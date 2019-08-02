package instruments.pianos;

import enums.Type;
import instruments.Instrument;

public abstract class Piano extends Instrument {
  private int noOfKeys;
  private String pianoType;

  public Piano(String name, String colour, String material, int noOfKeys, String pianoType) {
    super(name, Type.CHORDOPHONE, colour, material);
    this.noOfKeys = noOfKeys;
    this.pianoType = pianoType;
  }

  public int getNoOfKeys() {
    return this.noOfKeys;
  }

  public String getPianoType() {
    return this.pianoType;
  }

  public String play() {
    return "Tap";
  }
}
