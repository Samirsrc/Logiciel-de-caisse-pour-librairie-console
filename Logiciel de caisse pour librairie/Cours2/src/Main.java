import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		Stock s = new Stock();

		Path path = Paths.get("livres");
		List<String> ar = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
		for (int i = 0; i < 50; i = i + 5) {
			s.ajouterLivre(ar.get(i), ar.get(i + 1), ar.get(i + 2), ar.get(i + 3), Integer.parseInt(ar.get(i + 4)));
		}

		s.rechercheLivre();

	}

}
