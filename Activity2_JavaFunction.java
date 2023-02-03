public class Activity2_JavaFunction {
    static float myFunction(float x){
        //divides the value of x by 2
        return(x/2);
    }
    public static void main(String[] args) {
        //loop x from 1 to 9
        for(float x=0; x<10; x++){
            //output the function MyFunction
            System.out.println("f("+x+") = " + myFunction(x));
        }
    }
  }
