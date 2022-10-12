package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char operateur) {
		
//		switch (operateur) {
//		case '+':
//			return a + b;
//			break;
//
//		case '-':
//			return a - b;
//			break;
//
//		case '*':
//			return a * b;
//			break;
//
//		case '/':
//			return a / b;
//			break;
//
//		default:
//			break;
//		}
		
		double resultat=0;
		
		if (operateur == '+') {
			resultat = a + b;
		}
		
		if (operateur == '-') {
			resultat = a - b;
		}
		
		if (operateur == '*') {
			resultat = a * b;
		}
		
		if (operateur == '/') {
			resultat = a / b;
		}
		return resultat;

	}

}
