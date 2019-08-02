package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
  GuitarString guitarString;

  @Before
  public void setUp() {
    guitarString = new GuitarString("Guitar String", 10.00, 15.99);
  }

  @Test
  public void hasDescription() {
    assertEquals("Guitar String", guitarString.getDescription());
  }

  @Test
  public void hasBoughtPrice() {
    assertEquals(10.00, guitarString.getBoughtPrice(), 0.01);
  }

  @Test
  public void canSetBoughtPrice() {
    guitarString.setBoughtPrice(11.99);
    assertEquals(11.99, guitarString.getBoughtPrice(), 0.01);
  }

  @Test
  public void hasSellingPrice() {
    assertEquals(15.99, guitarString.getSellingPrice(), 0.01);
  }

  @Test
  public void canSetSellingPrice() {
    guitarString.setSellingPrice(16.99);
    assertEquals(16.99, guitarString.getSellingPrice(), 0.01);
  }
}
