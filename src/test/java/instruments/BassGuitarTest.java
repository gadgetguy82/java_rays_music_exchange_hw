package instruments;

import instruments.guitars.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {
  BassGuitar bassGuitar;

  @Before
  public void setUp() {
    bassGuitar = new BassGuitar("Fender","Red", "Basswood", 4);
  }

  @Test
  public void hasName() {
    assertEquals("Fender", bassGuitar.getName());
  }

  @Test
  public void hasType() {
    assertEquals("String", bassGuitar.getType());
  }

  @Test
  public void hasColour() {
    assertEquals("Red", bassGuitar.getColour());
  }

  @Test
  public void hasMaterial() {
    assertEquals("Basswood", bassGuitar.getMaterial());
  }

  @Test
  public void hasNumberOfStrings() {
    assertEquals(4, bassGuitar.getNoOfStrings());
  }

  @Test
  public void hasGuitarType() {
    assertEquals("Bass", bassGuitar.getGuitarType());
  }

  @Test
  public void canPlay() {
    assertEquals("Strum", bassGuitar.play());
  }

  @Test
  public void boughtPriceStartsAtZero() {
    assertEquals(0, bassGuitar.getBoughtPrice(), 0.01);
  }

  @Test
  public void canSetBoughtPrice() {
    bassGuitar.setBoughtPrice(60.00);
    assertEquals(60.00, bassGuitar.getBoughtPrice(), 0.01);
  }

  @Test
  public void sellingPriceStartsAtZero() {
    assertEquals(0, bassGuitar.getSellingPrice(), 0.01);
  }

  @Test
  public void canSetSellingPrice() {
    bassGuitar.setSellingPrice(89.99);
    assertEquals(89.99, bassGuitar.getSellingPrice(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    bassGuitar.setBoughtPrice(60.00);
    bassGuitar.setSellingPrice(89.99);
    assertEquals(50.0, bassGuitar.calculateMarkup(), 0.01);
  }
}
