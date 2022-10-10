package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tabObjetGeometriques = new ObjetGeometrique[2];
		tabObjetGeometriques[0] = new Cercle(5);
		tabObjetGeometriques[1] = new Rectangle(2,5);
		
		
		for (ObjetGeometrique objetGeometrique : tabObjetGeometriques) {
			System.out.println(objetGeometrique.perimetre()+"\n");
			System.out.println(objetGeometrique.surface()+"\n");
		}
		
		
	}

}
