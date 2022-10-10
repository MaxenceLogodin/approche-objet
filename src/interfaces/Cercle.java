package interfaces;

public class Cercle implements ObjetGeometrique{
	
	double rayon;

	
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	
	
}
