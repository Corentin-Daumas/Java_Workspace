import java.util.Scanner;


public class Banque {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choix;
		
		Compte premierCompte = new Compte("Arthur", 1000, 300);
		
		/*
		System.out.println(premierCompte.getClient());
		System.out.println(premierCompte.getSolde());
		System.out.println(premierCompte.getPlafond());
		System.out.println(premierCompte.getNumeroCompte());
		

	
	
		
		System.out.print("Quel est le montant du d�p�t ?\n >>> ");
		premierCompte.setSolde(premierCompte.getSolde() + scan.nextFloat());
		System.out.println(premierCompte.getSolde()); 
		*/
		
		System.out.println("Que faire ? \n 1 cr�er un compte \n 2 op�ration sur un compte");
		
		
		System.out.println("Que faire ? \n 1 d�p�t \n 2 retrait \n 3 afficher solde");
		choix = scan.nextInt();
		switch(choix) {
			case 1:  //d�p�t
				System.out.print("Quel est le montant du d�p�t ?\n >>> ");
				premierCompte.setSolde(premierCompte.getSolde() + scan.nextFloat());
				break;
			case 2:  //retrait
				System.out.print("Quel est le montant du retrait ?\n >>> ");
				premierCompte.setSolde(premierCompte.getSolde() - scan.nextFloat());
				break;
			case 3:  //afficher le solde
				System.out.println(premierCompte.getSolde());
				break;
		}
	
	
	
	
	}

}
