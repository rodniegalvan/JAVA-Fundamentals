public class Activity12_CounterMain {
        //These are called "member variables" or "instance variable"
     String name;
    int value = 0;

        //This is a special method called "constructor"
    public Activity12_CounterMain(String name){
        this.name = name;
        System.out.println("Counter '" + name + "' created");
    }
    public void increment(){
        value++;
    }
    public int getValue(){
        return(value);
    }
    public void report(){
        System.out.println("Value of "+name+": "+ value);

    }


    public static void main(String[] args) {
        //Creates new instances (objects) of the class Counter.
        //NOTE: This automatically calls the constructor method
        Activity12_CounterMain counter1 = new Activity12_CounterMain("First Counter");
        Activity12_CounterMain counter2 = new Activity12_CounterMain("Second Counter");

        //Call class methods on the objects
        counter1.increment();
        counter1.increment();
        counter2.increment();
        counter1.report();
        counter2.report();

    }
}
