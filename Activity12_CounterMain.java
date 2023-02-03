public class Activity12_CounterMain {


    public static void main(String[] args) {
        //Creates new instances (objects) of the class Counter.
        //NOTE: This automatically calls the constructor method
        Activity12_Counter counter1 = new Activity12_Counter("First Counter");
        Activity12_Counter counter2 = new Activity12_Counter("Second Counter");

        //Call class methods on the objects
        counter1.increment();
        counter1.increment();
        counter2.increment();
        counter1.report();
        counter2.report();

    }
}
