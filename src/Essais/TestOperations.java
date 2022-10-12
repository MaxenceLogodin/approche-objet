package Essais;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
		System.out.println("Test addition de a et b : " + Operations.calcul(a,b,'+')  );
		System.out.println("Test soustraction de a et b : " + Operations.calcul(a,b,'-')  );
		System.out.println("Test multiplication de a et b : " + Operations.calcul(a,b,'*')  );
		System.out.println("Test division de a et b : " + Operations.calcul(a,b,'/')  );
		
	}

}
