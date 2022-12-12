package mat_zai_pie;

public class App {

	public static void main(String[] args) throws Exception {

		PaletteDeCouleur[] jocondeCouleur = {PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT};
		Peinture joconde = new Peinture("Joconde", "peinture", 1954, 2500, "Toile", "Pinceau", jocondeCouleur);
		
		Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "peinture sur toile", "Crayon", jocondeCouleur);

		Sculpture buste = new Sculpture("buste incroyable", "oeuvre baroque", 2022, 15, "boue et argile", 180, 37);

		Oeuvre[] leonardOeuvre = {joconde, laCene, buste};

		Artist leonardDeVinci = new Artist("DeVinci", "Leonard", "leodu33", 53, leonardOeuvre);

		leonardDeVinci.afficher();

	}

}