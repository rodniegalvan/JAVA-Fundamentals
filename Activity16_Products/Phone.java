public class Phone extends Product implements Printable {
    private String brand;
    private String model;
  
    public Phone(String name, double price, String brand, String model) {
      super(name, price);
      this.brand = brand;
      this.model = model;
    }
  
    public String getBrand() {
      return brand;
    }
  
    public void setBrand(String brand) {
      this.brand = brand;
    }
  
    public String getModel() {
      return model;
    }
  
    public void setModel(String model) {
      this.model = model;
    }
  
    @Override
    public String toString() {
      return "Phone: Name = " + getName() + ", Price = " + getPrice() + ", Brand = " + brand + ", Model = " + model;
    }
  
    @Override
    public void print() {
      System.out.println(toString());
    }
  }