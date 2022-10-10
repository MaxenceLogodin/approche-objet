package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		
		Operation[] tabOperations = new Operation[4];
		tabOperations[0] = new Credit("10/10", 20);
		tabOperations[1] = new Debit("11/10", 50);
		tabOperations[2] = new Credit("12/10", 80);
		tabOperations[3] = new Debit("13/10", 110);
		
		
		
		for (Operation operation : tabOperations) {
			System.out.println(operation+"\n");
		}
		
		double montant = 0;
		
		
		for (Operation operation : tabOperations) {
			if (operation.getType() == "CREDIT") {
				montant += operation.montant;
			}
			if (operation.getType() == "DEBIT") {
				montant -= operation.montant;
			}
		}
		
		System.out.println("Le montant total des opérations est de : " + montant);
		
		
	}

}
