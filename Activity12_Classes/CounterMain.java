public class CounterMain {
    public static void main(String[] args) {
      Counter counter1 = new Counter();
      Counter counter2 = new Counter();
  
      counter1.increment();
      counter1.increment();
      counter2.increment();
  
      System.out.println("Counter 1: " + counter1.value);
      System.out.println("Counter 2: " + counter2.value);
    }
  }