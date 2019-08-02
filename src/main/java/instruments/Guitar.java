package instruments;

public class Guitar extends Instrument {
  private int noOfStrings;

  public Guitar(String name, String colour, String material, int noOfStrings) {
    super(name, "Guitar", colour, material);
    this.noOfStrings = noOfStrings;
  }

  public int getNoOfStrings() {
    return this.noOfStrings;
  }
}
