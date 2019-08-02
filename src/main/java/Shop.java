import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
  private String name;
  private ArrayList<ISell> stock;

  public Shop(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
