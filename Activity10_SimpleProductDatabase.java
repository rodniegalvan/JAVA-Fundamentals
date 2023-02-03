import java.util.ArrayList;

public class Activity10_SimpleProductDatabase {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("Mitsubishi:PHP 800,000");
        cars.add("Toyota:PHP 1,100,000");
        cars.add("Honda:PHP 750,000");
        cars.add("BMW:PHP 1,500,000");
            for(int n=0; n<cars.size(); n++){
                    String[] arrOfStr = cars.get(n).split(":");
                            System.out.println("Product:"+arrOfStr[0]+ ", Price:"+arrOfStr[1]);
                        }
                    }
        

}