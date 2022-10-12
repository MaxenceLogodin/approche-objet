package fr.diginamic.maison;

public abstract class Piece {
	
	public double superficie;
	public int numEtage;
	
	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.numEtage = numEtage;
	}
	
	public abstract String getType();
	
	
}
