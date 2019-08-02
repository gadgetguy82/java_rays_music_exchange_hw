package instruments;

public abstract class Instrument {
  private String name, type, colour, material;

  public Instrument(String name, String type, String colour, String material) {
    this.name = name;
    this.type = type;
    this.colour = colour;
    this.material = material;
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

  public String getMaterial() {
    return this.material;
  }
}
