
import static org.junit.Assert.assertEquals;

import levelupjava.LetterPointsMain;
import org.junit.Test;
public class LetterPointsTest {

    @Test
    public void scrabbleWordCalculator() {
        assertEquals(10, LetterPointsMain.wordScoreCalculator("very"));
        assertEquals(12, LetterPointsMain.wordScoreCalculator("zoo"));
        assertEquals(28, LetterPointsMain.wordScoreCalculator("maximize"));
        assertEquals(17, LetterPointsMain.wordScoreCalculator("exercise"));
        assertEquals(27, LetterPointsMain.wordScoreCalculator("jukebox"));
        assertEquals(26, LetterPointsMain.wordScoreCalculator("flapjack"));
        assertEquals(25, LetterPointsMain.wordScoreCalculator("squeeze"));
        assertEquals(11, LetterPointsMain.wordScoreCalculator("school"));
        assertEquals(9,  LetterPointsMain.wordScoreCalculator("ex"));
        assertEquals(12, LetterPointsMain.wordScoreCalculator("common"));
    }

    @Test
    public void scrabbleWordCalculator_edgeCases() {
        assertEquals(0, LetterPointsMain.wordScoreCalculator(""));
        assertEquals(0, LetterPointsMain.wordScoreCalculator("          "));
        assertEquals(0, LetterPointsMain.wordScoreCalculator("     12-183     "));

        assertEquals(10, LetterPointsMain.wordScoreCalculator("v2ery"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("Very"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("VeRy"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("VERY"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("ver!y"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("ver!y"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("  ve ry"));
        assertEquals(10, LetterPointsMain.wordScoreCalculator("  ve ry"));
        assertEquals(7,  LetterPointsMain.wordScoreCalculator("dadd"));
    }
}
