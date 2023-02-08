import java.util.ArrayList;

class CoffeeShop {
  public static void main(String[] args) {
    Beverage beverage1 = new Beverage("Latte", 399, "Grande", "Coffee Based");
    Beverage beverage2 = new Beverage("Iced Tea", 299, "Venti", "Juice Based");
    Beverage beverage3 = new Beverage("Hot Cocoa", 349, "Tall", "Creme Based");

    Pastry pastry1 = new Pastry("Croissant", 249, "Sweet");
    Pastry pastry2 = new Pastry("Muffin", 299, "Sweet");
    Pastry pastry3 = new Pastry("Savory Danish", 349, "Savory");

    ArrayList<Beverage> orderBeverages = new ArrayList<>();
    orderBeverages.add(beverage1);
    orderBeverages.add(beverage2);
    orderBeverages.add(beverage3);

    ArrayList<Pastry> orderPastries = new ArrayList<>();
    orderPastries.add(pastry1);
    orderPastries.add(pastry2);
    orderPastries.add(pastry3);

    long totalPrice = 0;
    System.out.println("Beverages: ");
    for (Beverage b : orderBeverages) {
      System.out.println("- " + b.getProductName() + ": $" + (b.getPrice() / 100.0));
      totalPrice += b.getPrice();
    }

    System.out.println("Pastries: ");
    for (Pastry p : orderPastries) {
      System.out.println("- " + p.getProductName() + ": $" + (p.getPrice() / 100.0));
      totalPrice += p.getPrice();
    }

    System.out.println("Total Price: $" + (totalPrice / 100.0));
  }
}