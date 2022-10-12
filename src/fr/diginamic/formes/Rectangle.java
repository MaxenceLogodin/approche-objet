package fr.diginamic.formes;

public class Rectangle extends Forme{
	

	double longueur;
	double largeur;

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur*2+largeur*2;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

}
