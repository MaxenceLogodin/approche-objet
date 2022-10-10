package fr.diginamic.banque.entites;

public class TestCompte {

	public static void main(String[] args) {
		
		
		Compte compte = new Compte(1654641, 10050.62);
		
		System.out.println(compte);
		
		
		
		Compte[] tabComptes = new Compte[2];
		tabComptes[0] = new Compte(0, 12.5);
		tabComptes[1] = new CompteTaux(1, 2500.5, 1.2);
		
		
		
		for (Compte compte2 : tabComptes) {
			System.out.println(compte2+"\n");
		}
		
		
	}

}
