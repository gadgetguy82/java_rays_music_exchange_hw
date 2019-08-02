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

  @Test
  public void canPlay() {
    assertEquals("Tap", uprightPiano.play());
  }

  @Test
  public void boughtPriceStartsAtZero() {
    assertEquals(0, uprightPiano.getBoughtPrice(), 0.01);
  }

  @Test
  public void canSetBoughtPrice() {
    uprightPiano.setBoughtPrice(3500.00);
    assertEquals(3500.00, uprightPiano.getBoughtPrice(), 0.01);
  }

  @Test
  public void sellingPriceStartsAtZero() {
    assertEquals(0, uprightPiano.getSellingPrice(), 0.01);
  }

  @Test
  public void canSetSellingPrice() {
    uprightPiano.setSellingPrice(4684.00);
    assertEquals(4684.00, uprightPiano.getSellingPrice(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    uprightPiano.setBoughtPrice(3500.00);
    uprightPiano.setSellingPrice(4684.00);
    assertEquals(34.0, uprightPiano.calculateMarkup(), 0.01);
  }
}
