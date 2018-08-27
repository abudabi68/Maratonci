package edu.logic;

import java.util.Random;

public class PraviMaratonci {
    private int ucesnici[]=new int[10];
    Random rand=new Random();
    private int firs,secon,thrid;
    private boolean found=false;
	public int getFirs() {
		return firs;
	}
	public void setFirs(int firs) {
		this.firs=firs;
	}
	public int getSecon() {
		return secon;
	}
	public void setSecon(int secon) {
		this.secon = secon;
	}
	public int getThrid() {
		return thrid;
	}
	public void setThrid(int thrid) {
		this.thrid =thrid;
	}
	public boolean isFound() {
		return found;
	}
	public void setFound(boolean found) {
		this.found = found;
	}
	public PraviMaratonci(int[] ucesnici, Random rand, int firs, int secon, int thrid, boolean found) {
		super();
		this.ucesnici = ucesnici;
		this.rand = rand;
		this.firs = firs;
		this.secon = secon;
		this.thrid = thrid;
		this.found = found;
	}
	
    public int  fukcija(){
    	for(int i=0;i<ucesnici.length;i++){
			   ucesnici[i]=rand.nextInt(10)+5;
			   System.out.println(ucesnici[i]);
			   firs=secon=thrid=ucesnici[0];
			   if(ucesnici[i]>firs){
				  thrid=secon;
				   secon=firs;
				   firs=ucesnici[i];
			   }
			   else if(ucesnici[i]> secon && ucesnici[i]!= firs){
				   thrid=secon;
				   secon=ucesnici[i];
			   }
			   else if( ucesnici[i]> thrid &&  ucesnici[i]!= firs &&  ucesnici[i]!= secon ){
				    thrid=ucesnici[i];
			   }
		   }
    	return firs;
    }
	
	
	
}
