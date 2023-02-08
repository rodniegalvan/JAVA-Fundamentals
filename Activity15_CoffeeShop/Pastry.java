class Pastry {
  private String productName;
  private long price;
  private String type;

  public Pastry(String productName, long price, String type) {
    this.productName = productName;
    this.price = price;
    this.type = type;
  }

  public String getProductName() {
    return productName;
  }

  public long getPrice() {
    return price;
  }

  public String getType() {
    return type;
  }
}