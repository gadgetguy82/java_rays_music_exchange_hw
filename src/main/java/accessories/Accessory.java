package accessories;

public abstract class Accessory {
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
}
