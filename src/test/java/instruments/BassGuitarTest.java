package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {
  BassGuitar bassGuitar;

  @Before
  public void setUp() {
    bassGuitar = new BassGuitar("Bass Guitar");
  }

  @Test
  public void hasName() {
    assertEquals("Bass Guitar", bassGuitar.getName());
  }
}
