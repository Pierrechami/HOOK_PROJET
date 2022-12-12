package mat_zai_pie;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Test Enum
     */

    @Test
    public void testEnum() {
        assertEquals("Rouge", PaletteDeCouleur.ROUGE.couleur);
        assertEquals("Vert", PaletteDeCouleur.VERT.couleur);
        assertEquals("Bleu", PaletteDeCouleur.BLEU.couleur);
        assertEquals("Jaune", PaletteDeCouleur.JAUNE.couleur);
        assertEquals("Blanc", PaletteDeCouleur.BLANC.couleur);
        assertEquals("Rose", PaletteDeCouleur.ROSE.couleur);
    }

    /**
     * Test Class Artist
     */

    @Test
    public void artistAge() throws Exception {
        PaletteDeCouleur[] jocondeCouleur = { PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT };
        Peinture joconde = new Peinture("Joconde", "peinture", 1954, 2500, "Toile", "Pinceau", jocondeCouleur);

        Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "peinture murale", "Crayon", jocondeCouleur);

        Oeuvre[] zainabOeuvre = { joconde, laCene };

        Artist zainab = new Artist("Lahmar", "Zainab", "Zai", 25, zainabOeuvre);
        assertEquals(zainab.getAge(), 25);
    }

    @Test
    public void paletteDeCouleurLength() throws Exception {
        PaletteDeCouleur[] jocondeCouleur = { PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT };
        Peinture joconde = new Peinture("Joconde", "peinture", 1954, 2500, "Toile", "Pinceau", jocondeCouleur);

        Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "peinture murale", "Crayon", jocondeCouleur);

        Oeuvre[] zainabOeuvre = { joconde, laCene };

        Artist zainab = new Artist("Lahmar", "Zainab", "Zai", 25, zainabOeuvre);
        assertEquals(2, zainabOeuvre.length);
    }

    @Test
    public void artistNom() throws Exception {
        PaletteDeCouleur[] jocondeCouleur = { PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT };
        Peinture joconde = new Peinture("Joconde", "peinture", 1954, 2500, "Toile", "Pinceau", jocondeCouleur);

        Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "peinture murale", "Crayon", jocondeCouleur);

        Oeuvre[] zainabOeuvre = { joconde, laCene };

        Artist zainab = new Artist("Lahmar", "Zainab", "Zai", 25, zainabOeuvre);
        assertEquals(zainab.getNom(), "Lahmar");
    }

    @Test(expected = supportException.class)
    public void releveUneErreur() throws Exception {
        PaletteDeCouleur[] jocondeCouleur = { PaletteDeCouleur.BLEU, PaletteDeCouleur.ROUGE, PaletteDeCouleur.VERT };

        Peinture laCene = new Peinture("Cene", "peinture", 1754, 156, "", "Crayon", jocondeCouleur);

    }
}