class Car extends Product {
    private String make;
    private String model;
  
    //setter and getter
    public Car(String name, double price, String make, String model) {
      super(name, price);
      this.make = make;
      this.model = model;
    }
  
    public String getMake() {
      return make;
    }
  
    public void setMake(String make) {
      this.make = make;
    }
  
    public String getModel() {
      return model;
    }
  
    public void setModel(String model) {
      this.model = model;
    }
  }
  