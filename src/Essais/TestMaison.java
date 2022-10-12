package Essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maison1 = new Maison();
		
		maison1.ajouterPiece(new WC(10 , 0));
		maison1.ajouterPiece(new Chambre(10 , 1));
		maison1.ajouterPiece(new Cuisine(10 , 2));
		maison1.ajouterPiece(new SalleDeBain(10 , 0));
		maison1.ajouterPiece(new Salon(10 , 1));
		maison1.ajouterPiece(new Salon(25 , 3));
		
		System.out.println("--------------------------------");
		maison1.ajouterPiece(null);
		maison1.ajouterPiece(new WC(-12 , -14));
		
		System.out.println("--------------------------------");
		System.out.println(maison1.getSuperficieTotaleEtage(0));
		System.out.println(maison1.getSuperficieTotaleEtage(1));
		System.out.println(maison1.getSuperficieTotaleEtage(2));
 		System.out.println(maison1.getSuperficieTotaleEtage(3));
 		
 		System.out.println("--------------------------------");
		System.out.println(maison1.getSuperficieTotaleMaison());
		
		System.out.println("--------------------------------");
		System.out.println(maison1.getSuperficiePieces("Chambre"));
		System.out.println(maison1.getSuperficiePieces("Cuisine"));
		System.out.println(maison1.getSuperficiePieces("SalleDeBain"));
		System.out.println(maison1.getSuperficiePieces("Salon"));
		System.out.println(maison1.getSuperficiePieces("WC"));
		
		System.out.println("--------------------------------");
		System.out.println(maison1.nbPieces("Chambre"));
		System.out.println(maison1.nbPieces("Cuisine"));
		System.out.println(maison1.nbPieces("SalleDeBain"));
		System.out.println(maison1.nbPieces("Salon"));
		System.out.println(maison1.nbPieces("WC"));

	}

}
