public class Activity12_Counter {
    //These are called "member variables" or "instance variable"
    String name;
    int value = 0;

        //This is a special method called "constructor"
    public Activity12_Counter(String name){
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
}