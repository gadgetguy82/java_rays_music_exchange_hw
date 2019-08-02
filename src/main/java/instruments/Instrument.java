package instruments;

public class Instrument {
  private String name, type, colour;

  public Instrument(String name, String type, String colour) {
    this.name = name;
    this.type = type;
    this.colour = colour;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public String getColour() {
    return this.colour;
  }
}
