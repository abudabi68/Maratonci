package gui.edu;

import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Maratonci {
 private void izdvoji(){
	 
 }
	private JFrame frame;
	private JTextField prvi;
	private JTextField drugi;
	private JTextField treci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maratonci window = new Maratonci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Maratonci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Najbrzi maratonac je bio sa brzinom od :");
		lbl1.setBounds(43, 11, 224, 14);
		frame.getContentPane().add(lbl1);
		
		prvi = new JTextField();
		prvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		prvi.setBounds(53, 36, 169, 20);
		frame.getContentPane().add(prvi);
		prvi.setColumns(10);
		
		JLabel lbl2 = new JLabel("Drugi Maratonac je imao prosecnu brzinu ");
		lbl2.setBounds(43, 94, 211, 14);
		frame.getContentPane().add(lbl2);
		
		drugi = new JTextField();
		drugi.setBounds(53, 129, 169, 20);
		frame.getContentPane().add(drugi);
		drugi.setColumns(10);
		
		JLabel lbl3 = new JLabel("Treci maratonac je imao brzinu ");
		lbl3.setBounds(64, 173, 158, 14);
		frame.getContentPane().add(lbl3);
		
		treci = new JTextField();
		treci.setBounds(53, 205, 179, 20);
		frame.getContentPane().add(treci);
		treci.setColumns(10);
		
		JButton btn1 = new JButton("Prikazi Rezultat");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ucesnici []=new int[10];
			     Random rand=new Random();
			     int firs,secon,thrid;
			     boolean found =false;
			     firs=secon=thrid=ucesnici[0];
			     for(int i=0;i<ucesnici.length;i++){
					   ucesnici[i]=rand.nextInt(10)+5;
					   System.out.println(ucesnici[i]);
					   
					   if(ucesnici[i]>firs){
						   thrid=secon;
						   secon=firs;
						   firs=ucesnici[i];
					   }
					   else if(ucesnici[i]>secon && ucesnici[i]!=firs){
						   thrid=secon;
						   secon=ucesnici[i];
					   }
					   else if(ucesnici[i]>thrid && ucesnici[i]!=firs && ucesnici[i]!=secon ){
						   thrid=ucesnici[i];
					   }
				   }
				 
			     prvi.setText(String.valueOf(firs));
			     drugi.setText(String.valueOf(secon));
			     treci.setText(String.valueOf(thrid));
			}
		});
		btn1.setBounds(309, 227, 115, 23);
		frame.getContentPane().add(btn1);
	}
}
