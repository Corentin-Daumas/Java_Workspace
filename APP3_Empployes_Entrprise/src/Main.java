import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Vendeur e = new Vendeur("MARC", "Th�o", "06.51.97.42.77", "10-01-2000", "05-01-2017", 20000);
		// debug//System.out.println(e.prime());
		System.out.println(e + "\n");

		ChargeDeProd c = new ChargeDeProd("Duval", "Toto", "07.18.20.12.12", "02-11-1998", "10-05-2020", 500);
		System.out.println(c + "\n");

		ArrayList<Employe> liste = new ArrayList<>();
		liste.add((Employe) e);
		liste.add((Employe) c);

		Double salaireTotal = 0.0;
		for (Employe i : liste) {
			salaireTotal += i.salaire();
		}
		System.out.println("Le salaire total de l'entreprise est : " + salaireTotal);
		System.out.println("Le salaire moyen dans l'entreprise est : " + salaireTotal / liste.size());
		
		
	}
}
