public class Activity4_ControlStructure{
    public static void main(String[] args) {
        int n;
        for(n=0; n<=20;n++){
            if(n==0){
                System.out.println("First one: " + n );
            }
            else if(n<5){
                System.out.println("Less than five: " + n);
            }
            else if(n==10 || n==11){
                System.out.println("Ten or Eleven: "+ n);
            }
            else if(n>12 && n<19){
                System.out.println("YEHEY!");
            }
            else{
                System.out.println("Not less than five: "+ n);
            }
        }
    }
}