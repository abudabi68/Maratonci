package edu.logic;

import java.util.Random;

public class Maratonci {

	public static void main(String[] args) {
	       int ucesnici []=new int[10];
	       Random rand=new Random();
	       int firs,secon,thrid;
	       
	       int brzina= rand.nextInt(15)+5;
	       //System.out.println(brzina);
	       firs=secon=thrid=ucesnici[0];
	       /*
	        * Upis brzine 10 takmicara u niz
	        */
	    	   for(int i=0;i<ucesnici.length;i++){
	    		   ucesnici[i]=rand.nextInt(10)+5;
	    		   System.out.println(ucesnici[i]);
	    		   
	    		   if(ucesnici[i]>firs){
	    			   thrid=secon;
	    			   secon=firs;
	    			   firs=ucesnici[i];
	    		   }
	    		   else if(ucesnici[i]>secon){
	    			   thrid=secon;
	    			   secon=ucesnici[i];
	    		   }
	    		   else if(ucesnici[i]>thrid){
	    			   thrid=ucesnici[i];
	    		   }
	    	   }
	    	   
	    	   System.out.println("Prvo mesto je  osvoji trkac sa prosecnom brzinom:"+firs+"km/h");
	    	   System.out.println("Drugo mesto je  osvoji trkac sa prosecnom brzinom:"+secon+"km/h");
	    	   System.out.println("Trece mesto je  osvoji trkac sa prosecnom brzinom:"+thrid+"km/h");
	
		
	}
}
