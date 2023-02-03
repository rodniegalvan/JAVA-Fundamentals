import java.util.*;


public class Activity6_BreakfastActivity{
    
    static void printListCollection(ArrayList<String>listCollection){
    System.out.println("Title\tDescription");
    for (String listCollections : listCollection) {
        System.out.println(listCollections);
     }
}
    public static void main(String args[]){

        String choice = "";
        ArrayList<String> listCollection = new ArrayList<String>();
        int count = 0;
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------COLLECTIONS (" + count +")----------------");
        System.out.println("a.ADD COLLECTIONS");
        System.out.println("b.SORT COLLECTIONS ASCENDING");
        System.out.println("c.SORT COLLECTIONS DESCENDING");
        System.out.println("d.DISPLAY ALL COLLECTIONS");
        System.out.println("e.SEARCH COLLECTIONS");
        System.out.println("f.EXIT");

        choice = input.nextLine();
        switch(choice){

            case "a":
            
                Scanner inputStr = new Scanner(System.in);
                System.out.println("Enter Title : ");
                String title = inputStr.nextLine();
                System.out.println("Enter Description : ");
                String description = inputStr.nextLine();
                String Collections1 = title + " : " + description;
                listCollection.add(Collections1);
                count++;
                break;

            case "b":
                Collections.sort(listCollection);
                System.out.println("Sorted in Ascescending Order");
                break;
            case "c":
                Collections.sort(listCollection, Collections.reverseOrder());
                System.out.println("Sorted in Descending Order");
                break;   
            case "d":
            // adding Collection object to ArrayList object listCollection.
                System.out.println("Title\tDescription");    
                for (String i : listCollection) {

                    System.out.println(i);
                }
                break;
            case "e":
                // adding Collection object to ArrayList object listCollection.
                System.out.println("Enter Keyword to Search : ");
                String nameSearch = input.nextLine();
                System.out.println("Results... ");
                for (String element : listCollection){
                    if (element.contains(nameSearch)){
                          System.out.println(element);
                    }
                    if (!element.contains(nameSearch)){
                        System.out.println(nameSearch + " not Found");
                  }
                 }

                break;
            case "f":
                System.out.println("Exiting Program...");
                System.exit(0);
                input.close();
                break;
            default :
                System.out.println("This is not a valid Menu Option! Please Select Another");
                break;
    
        }
        
        }
        
    }
}