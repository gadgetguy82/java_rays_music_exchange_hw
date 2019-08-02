package instruments.pianos;

import instruments.Instrument;

public class Piano extends Instrument {
  private int noOfKeys;
  private String pianoType;

  public Piano(String name, String colour, String material, int noOfKeys, String pianoType) {
    super(name,"Chordophone", colour, material);
    this.noOfKeys = noOfKeys;
    this.pianoType = pianoType;
  }

  public int getNoOfKeys() {
    return this.noOfKeys;
  }

  public String getPianoType() {
    return this.pianoType;
  }
}
