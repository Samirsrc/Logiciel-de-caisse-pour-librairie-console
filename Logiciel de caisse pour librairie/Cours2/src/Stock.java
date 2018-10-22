import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	ArrayList<Livre> livres = new ArrayList<Livre>();

	public void ajouterLivre(String titre, String auteur, String editeur, String collection, double prix) {

		livres.add(new Livre(titre, auteur, editeur, collection, prix));

	}

	public void afficherList() {
		System.out.println("La liste des livres disponible :");
		for (Livre livre : livres) {
			System.out.println(livre);
		}
	}

	public void rechercheLivre() {
		System.out.println("Saisissez :");
		System.out.println("[1] Pour faire une recherche par titre");
		System.out.println("[2] Pour faire une recherche par auteur");
		System.out.println("[3] Pour faire une recherche par edition");
		System.out.println("[4] Pour faire une recherche par collection");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Donnez le titre du livre :");
			Scanner sc1 = new Scanner(System.in);
			String s = sc1.nextLine();
			for (int j = 0; j < livres.size(); j++) {

				if (livres.get(j).getTitre().matches(s)) {

					System.out.println(livres.get(j));
				}

			}
			break;
		case 2:
			System.out.println("Donnez le nom de l'auteur :");
			Scanner sc3 = new Scanner(System.in);
			String l = sc3.nextLine();
			for (int j = 0; j < livres.size(); j++) {

				if (livres.get(j).getAuteur().matches(l)) {

					System.out.println(livres.get(j));
				}

			}
			break;
		case 3:
			System.out.println("Donnez l'édition :");
			Scanner sc4 = new Scanner(System.in);
			String d = sc4.nextLine();
			for (int j = 0; j < livres.size(); j++) {

				if (livres.get(j).getEditeur().matches(d)) {

					System.out.println(livres.get(j));
				}

			}
			break;
		case 4:
			System.out.println("Donnez la collection :");
			Scanner sc5 = new Scanner(System.in);
			String c = sc5.nextLine();
			for (int j = 0; j < livres.size(); j++) {

				if (livres.get(j).getCollection().matches(c)) {

					System.out.println(livres.get(j));
				}

			}
			break;
		}

	}

	public void recherche(int type, String s) {

		for (int j = 0; j < livres.size(); j++) {

			if (livres.get(j).getAuteur().matches(s)) {

				System.out.println(livres.get(j));
			}

		}
	}
}
