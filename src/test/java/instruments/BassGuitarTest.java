package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {
  BassGuitar bassGuitar;

  @Before
  public void setUp() {
    bassGuitar = new BassGuitar("Red", "Basswood");
  }

  @Test
  public void hasName() {
    assertEquals("Bass Guitar", bassGuitar.getName());
  }

  @Test
  public void hasType() {
    assertEquals("Guitar", bassGuitar.getType());
  }

  @Test
  public void hasColour() {
    assertEquals("Red", bassGuitar.getColour());
  }

  @Test
  public void hasMaterial() {
    assertEquals("Basswood", bassGuitar.getMaterial());
  }
}
