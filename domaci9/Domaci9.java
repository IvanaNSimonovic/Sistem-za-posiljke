package domaci9;

import java.util.Scanner;

public class Domaci9 {
	
	public static void main(String[] args) {
		Pismo p= new Pismo();
		Scanner s=new Scanner(System.in);
		System.out.println("Dobrodosli u pametni sistem poste!");
		System.out.println("----------------------------------");
		System.out.println("Unesite pristigla pisma: ");
		String unos=s.next();
		Pismo[] pisma=new Pismo[10];
		int i;
				for(i=0;i<10;i++) {
					while (!(unos.equals("kraj"))) {
				    pisma[i]=p;
					String b=s.next();
					p.setPosiljalac(unos+" " +b);
					String z=s.next();
					String y=s.next();
					p.setPrimalac(z+" "+y);
					int pBr=s.nextInt();
					p.setPostanski(pBr);
					double t=s.nextDouble();
					p.setTezinaGr(t);
					int prio=s.nextInt();
					if (prio==0)
					p.setPrioritetno(false);
					else p.setPrioritetno(true);
					unos=s.next();
				}
					
              }
			 
		System.out.println("Pisma uspesno ucitana! ");
		System.out.println("------------------------");
		System.out.println("Unesite postanski broj grada: ");
		int postanski=s.nextInt();
		for(int j=0; j<i; j++) {
			if (!(pisma[j]==null)) {
		    if (postanski==pisma[j].getPostanski()) 
		    	System.out.println(pisma[j]);
		   
		    }
	    }	
		
    }	
	
}

