package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {
  private String description;
  private double boughtPrice, sellingPrice;

  public Accessory(String description, double boughtPrice, double sellingPrice) {
    this.description = description;
    this.boughtPrice = boughtPrice;
    this.sellingPrice = sellingPrice;
  }

  public String getDescription() {
    return this.description;
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
    return Math.round((this.sellingPrice - this.boughtPrice) / this.boughtPrice * 100) * 100 / 100;
  }
}
