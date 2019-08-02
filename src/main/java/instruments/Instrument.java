package instruments;

import behaviours.*;

public abstract class Instrument implements IPlay, ISell {
  private String name, type, colour, material;
  private double boughtPrice, sellingPrice;

  public Instrument(String name, String type, String colour, String material) {
    this.name = name;
    this.type = type;
    this.colour = colour;
    this.material = material;
    this.boughtPrice = 0.0;
    this.sellingPrice = 0.0;
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

  public double getBoughtPrice() {
    return this.boughtPrice;
  }

  public void setBoughtPrice(double boughtPrice) {
    this.boughtPrice = boughtPrice;
  }

  public double getSellingPrice() {
    return this.sellingPrice;
  }

  public void setSellingPrice(double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public double calculateMarkup() {
    return (this.sellingPrice - this.boughtPrice) / this.boughtPrice * 100;
  }
}
