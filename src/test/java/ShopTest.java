import accessories.GuitarString;
import instruments.guitars.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
  Shop shop;
  BassGuitar bassGuitar;
  GuitarString guitarString;

  @Before
  public void setUp() {
    shop = new Shop("Ray's Music Exchange");
    bassGuitar = new BassGuitar("Fender","Red", "Basswood", 4);
    guitarString = new GuitarString("Guitar String", 10.00, 15.99);
  }

  @Test
  public void hasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test
  public void startsWithZeroStock() {
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canAddInstrumentToStock() {
    shop.addStock(bassGuitar);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddAccessorToStock() {
    shop.addStock(guitarString);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canRemoveItemsFromStock() {
    shop.addStock(bassGuitar);
    shop.addStock(guitarString);
    shop.removeStock(guitarString);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canCalculateTotalPotentialProfit() {
    shop.addStock(bassGuitar);
    shop.addStock(guitarString);
    assertEquals(0.0, shop.totalPotentialProfit(), 0.01);
  }
}
