package mat_zai_pie;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testEnum()
    {
        assertEquals("Rouge", PaletteDeCouleur.ROUGE.couleur);
        assertEquals("Vert", PaletteDeCouleur.VERT.couleur);
        assertEquals("Bleu", PaletteDeCouleur.BLEU.couleur);
        assertEquals("Jaune", PaletteDeCouleur.JAUNE.couleur);
        assertEquals("Blanc", PaletteDeCouleur.BLANC.couleur);
        assertEquals("Rose", PaletteDeCouleur.ROSE.couleur);
    }

}
