package j4_5.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get(
				"D:/Documents/Diginamic/cours/7 - Langage Java - Approche Objet/J5 & J6 - Collections et fichiers/TP/recensement.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		List<String> centLineStrings = new ArrayList<>();
		
		for (int i = 1; i < 101; i++) {
			centLineStrings.add(lines.get(i));
		}
		
		Path newFile = Paths.get(path.getParent()+"\\recensement100.csv");
		
		Files.write(newFile, centLineStrings);

	}

}
