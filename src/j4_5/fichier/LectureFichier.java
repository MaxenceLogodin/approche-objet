package j4_5.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		// Exercice 1
		System.out.println("Exercice 1");
		Path path = Paths.get(
				"D:/Documents/Diginamic/cours/7 - Langage Java - Approche Objet/J5 & J6 - Collections et fichiers/TP/recensement.csv");

		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

//		for (String string : lines) {
//			System.out.println(string);
//		}

		// Exercice 2
		System.out.println("Exercice 2");
		List<Ville> listeVilles = new ArrayList<>();
		
		for (int i = 1; i < lines.size(); i++) {
			String[] splt = lines.get(i).split(";");
			listeVilles.add(new Ville(splt[6], splt[2] , splt[1], Integer.parseInt(splt[9].trim().replace(" ", "")) ));
		}
		
		
		for (Ville ville : listeVilles) {
			System.out.println(ville);
		}
		
		
		
		
		//Exercice 3 Generer Fichier
		List<String> listeVilles25k = new ArrayList<>();
		listeVilles25k.add("Nom; Code Département; Nom de la région; Population totale");
		
		for (int i = 1; i < lines.size(); i++) {
			String[] splt = lines.get(i).split(";");
			if (Integer.parseInt(splt[9].trim().replace(" ", ""))>=25000) {
				listeVilles25k.add( splt[6] +"; "+ splt[2] +"; "+ splt[1] +"; "+ splt[9] );
			}
		}
		
		Path newPath25k = Paths.get(path.getParent()+"\\recensement25k.csv");
		Files.write(newPath25k, listeVilles25k);
		
		
		
		
	}

}
