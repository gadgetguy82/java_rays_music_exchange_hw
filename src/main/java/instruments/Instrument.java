package instruments;

import behaviours.*;
import enums.Type;

public abstract class Instrument implements IPlay, ISell {
  private String name, colour, material;
  private double boughtPrice, sellingPrice;
  private Type type;

  public Instrument(String name, Type type, String colour, String material) {
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

  public Type getType() {
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
    return Math.round((this.sellingPrice - this.boughtPrice) * 100.0) / 100.0;
  }
}
