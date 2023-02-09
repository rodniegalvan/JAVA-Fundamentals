class Laptop extends Product {
    private String brand;
    private int memory;
  
        //setter and getter
    public Laptop(String name, double price, String brand, int memory) {
      super(name, price);
      this.brand = brand;
      this.memory = memory;
    }
  
    public String getBrand() {
      return brand;
    }
  
    public void setBrand(String brand) {
      this.brand = brand;
    }
  
    public int getMemory() {
      return memory;
    }
  
    public void setMemory(int memory) {
      this.memory = memory;
    }
  }