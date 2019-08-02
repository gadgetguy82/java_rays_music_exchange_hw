package instruments;

import instruments.pianos.GrandPiano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrandPianoTest {
  GrandPiano grandPiano;

  @Before
  public void setUp() {
    grandPiano = new GrandPiano("Steinway","Black", "Beech", 88, "Grand");
  }

  @Test
  public void hasName() {
    assertEquals("Steinway", grandPiano.getName());
  }

  @Test
  public void hasType() {
    assertEquals("Chordophone", grandPiano.getType());
  }

  @Test
  public void hasColour() {
    assertEquals("Black", grandPiano.getColour());
  }

  @Test
  public void hasMaterial() {
    assertEquals("Beech", grandPiano.getMaterial());
  }

  @Test
  public void hasNoOfStrings() {
    assertEquals(88, grandPiano.getNoOfKeys());
  }

  @Test
  public void hasPianoType() {
    assertEquals("Grand", grandPiano.getPianoType());
  }

  @Test
  public void canPlay() {
    assertEquals("Tap", grandPiano.play());
  }

  @Test
  public void boughtPriceStartsAtZero() {
    assertEquals(0, grandPiano.getBoughtPrice(), 0.01);
  }

  @Test
  public void canSetBoughtPrice() {
    grandPiano.setBoughtPrice(8200.00);
    assertEquals(8200.00, grandPiano.getBoughtPrice(), 0.01);
  }

  @Test
  public void sellingPriceStartsAtZero() {
    assertEquals(0, grandPiano.getSellingPrice(), 0.01);
  }

  @Test
  public void canSetSellingPrice() {
    grandPiano.setSellingPrice(9399.00);
    assertEquals(9399.00, grandPiano.getSellingPrice(), 0.01);
  }
}
