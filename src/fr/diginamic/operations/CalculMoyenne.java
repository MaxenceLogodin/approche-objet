package fr.diginamic.operations;

public class CalculMoyenne {
	
	
	double[] tab= new double[0];
	
	public static double[] aggrandirTab(double[] tab2)
    {
		double[] newTab = new double[tab2.length + 1];
        for(int i = 0; i < tab2.length; i++)
        {
        	newTab[i] = tab2[i];
        }
        return newTab;
    }
	
	
	public void ajout(double a) {
		
		tab = aggrandirTab(tab);
		
		tab[tab.length-1] = a;
	}
	
	public double calcul() {
		double moyenne=0;
		for (double d : tab) {
			moyenne+=d;
		}
		return moyenne/tab.length;
	}
	
	
	
}
