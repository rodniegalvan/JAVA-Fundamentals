public class CounterMain1 {


    public static void main(String[] args) {
        //Creates new instances (objects) of the class Counter.
        //NOTE: This automatically calls the constructor method
        Counter1 counter1 = new Counter1("First Counter");
        Counter1 counter2 = new Counter1("Second Counter");

        //Call class methods on the objects
        counter1.increment();
        counter1.increment();
        counter2.increment();
        counter1.report();
        counter2.report();

    }
}
