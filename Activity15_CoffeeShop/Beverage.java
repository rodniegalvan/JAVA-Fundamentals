class Beverage {
  private String productName;
  private long price;
  private String size;
  private String type;

  public Beverage(String productName, long price, String size, String type) {
    this.productName = productName;
    this.price = price;
    this.size = size;
    this.type = type;
  }

  public String getProductName() {
    return productName;
  }

  public long getPrice() {
    return price;
  }

  public String getSize() {
    return size;
  }

  public String getType() {
    return type;
  }
}