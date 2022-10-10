package entites;

public class AdressePostale {
	
	public int numeroDeRue;
	public String libelleDeRueString;
	public int codePostale;
	public String villeString;
	
	
	public AdressePostale() {
		super();
	}
	
	public AdressePostale(int numeroDeRue, String libelleDeRueString, int codePostale, String villeString) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.libelleDeRueString = libelleDeRueString;
		this.codePostale = codePostale;
		this.villeString = villeString;
	}
	
	
	
	public int getNumeroDeRue() {
		return numeroDeRue;
	}
	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	
	public String getLibelleDeRueString() {
		return libelleDeRueString;
	}
	public void setLibelleDeRueString(String libelleDeRueString) {
		this.libelleDeRueString = libelleDeRueString;
	}
	
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	
	public String getVilleString() {
		return villeString;
	}
	public void setVilleString(String villeString) {
		this.villeString = villeString;
	}
	

}
