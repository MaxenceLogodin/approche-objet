package fr.diginamic.maison;

public class Maison {

	public Piece[] piecesTab = new Piece[0];

	public static Piece[] aggrandirTab(Piece[] tabPiece )
    {
		Piece[] newTab = new Piece[tabPiece.length + 1];
        for(int i = 0; i < tabPiece.length; i++)
        {
        	newTab[i] = tabPiece[i];
        }
        return newTab;
    }
	
	public void ajouterPiece(Piece nouvellePiece) {
		if (nouvellePiece != null && (nouvellePiece.superficie>0 || nouvellePiece.numEtage>=0) ) {
			piecesTab = aggrandirTab(piecesTab);
			piecesTab[piecesTab.length-1] = nouvellePiece;
		}else {
			System.err.println("La Piece n'existe pas ou n'est pas conforme");
		}
	}

	public String getSuperficieTotaleMaison() {
		double somme=0;
		for (Piece piece : piecesTab) {
			somme+= piece.superficie;
		}
		return "Superficie totale : " + somme;
	}

	public String getSuperficieTotaleEtage(int etage) {
		double somme=0;
		for (Piece piece : piecesTab) {
			if ( piece.numEtage == etage) {
				somme+= piece.superficie;
			}
		}
		return "Superficie etage " + etage + " : " + somme;
	}
	
	public String getSuperficiePieces(String type) {
		double somme=0;
		for (Piece piece : piecesTab) {
			if (piece.getType().equals(type)) {
				somme+= piece.superficie;
			}
		}
		return "Superficie de toute les " + type + " : " + somme;
	}
	
	public String nbPieces(String type) {
		int somme=0;
		for (Piece piece : piecesTab) {
			if (piece.getType().equals(type)) {
				somme++;
			}
		}
		return "Nombre de " + type + " : " +somme;
	}
		
}
