package instruments;

import instruments.pianos.UprightPiano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UprightPianoTest {
  UprightPiano uprightPiano;

  @Before
  public void setUp() {
    uprightPiano = new UprightPiano("Yamaha", "White", "Ash", 88, "Upright");
  }

  @Test
  public void hasName() {
    assertEquals("Yamaha", uprightPiano.getName());
  }

  @Test
  public void hasType() {
    assertEquals("Chordophone", uprightPiano.getType());
  }

  @Test
  public void hasColour() {
    assertEquals("White", uprightPiano.getColour());
  }

  @Test
  public void hasMaterial() {
    assertEquals("Ash", uprightPiano.getMaterial());
  }

  @Test
  public void hasNoOfStrings() {
    assertEquals(88, uprightPiano.getNoOfKeys());
  }

  @Test
  public void hasPianoType() {
    assertEquals("Upright", uprightPiano.getPianoType());
  }
}
