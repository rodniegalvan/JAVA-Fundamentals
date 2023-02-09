class StoreMain {
  public static void main(String[] args) {
    Car car1 = new Car("Ferrari", 100000.0, "Ferrari", "458 Italia");
    Car car2 = new Car("Lamborghini", 200000.0, "Lamborghini", "Huracan");

    Laptop laptop1 = new Laptop("MacBook Pro", 1500.0, "Apple", 16);
    Laptop laptop2 = new Laptop("Dell XPS", 1000.0, "Dell", 8);

    System.out.println("Car 1: " + car1.getName() +" "+ car1.getPrice() + ", " + car1.getMake() + " " + car1.getModel());
    System.out.println("Car 2: " + car2.getName() +" "+ car2.getPrice() + ", " + car2.getMake() + " " + car2.getModel());
    System.out.println("Laptop 1: " + laptop1.getName() +" "+ laptop1.getPrice() + ", " + laptop1.getBrand() + ", " + laptop1.getMemory() + " GB");
    System.out.println("Laptop 2: " + laptop2.getName() +" "+ laptop2.getPrice() + ", " + laptop2.getBrand() + ", " + laptop2.getMemory() + " GB");
  }
}