import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
  private String name;
  private ArrayList<ISell> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<ISell>();
  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    return stock.size();
  }

  public void addStock(ISell item) {
    this.stock.add(item);
  }

  public void removeStock(ISell item) {
    this.stock.remove(item);
  }

  public double totalPotentialProfit() {
    double total = 0.0;
    for (ISell item : this.stock) {
      total += item.calculateMarkup();
    }
    return total;
  }
}
