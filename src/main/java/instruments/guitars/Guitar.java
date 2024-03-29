package instruments.guitars;

import enums.Type;
import instruments.Instrument;

public abstract class Guitar extends Instrument {
  private int noOfStrings;
  private String guitarType;

  public Guitar(String name, String colour, String material, int noOfStrings, String guitarType) {
    super(name, Type.STRING, colour, material);
    this.noOfStrings = noOfStrings;
    this.guitarType = guitarType;
  }

  public int getNoOfStrings() {
    return this.noOfStrings;
  }

  public String getGuitarType() {
    return this.guitarType;
  }

  public String play() {
    return "Strum";
  }
}
