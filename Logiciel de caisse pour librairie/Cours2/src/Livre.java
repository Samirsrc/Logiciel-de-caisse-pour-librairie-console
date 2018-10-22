public class Livre {

	private String titre;
	private String auteur;
	private String editeur;
	private String collection;
	private double prix;

	public String toString() {
		return "[ titre = " + titre + ", auteur = " + auteur + ", editeur = " + editeur + ", collection = " + collection
				+ ", prix = " + prix + " euros ]";
	}

	public Livre(String titre, String auteur, String editeur, String collection, double prix) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.collection = collection;
		this.prix = prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
