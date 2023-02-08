import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MemorableQuotesMain {
  static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MemorableQuoteDatabase db = new MemorableQuoteDatabase();
        String filename = "Quotes.txt";
        db.readFromFile(filename);
      if (args.length <= 0) {
          System.out.println("No argument. Use either 'all', 'random', 'display', or 'search <string>'");
      }
        switch(args[0]){
            case "all":
                ArrayList<MemorableQuote> quotes = db.getAllQuotes();
                if (args.length == 2) {
                  for (int i = 1; i < args.length; i++) {
                    String[] parts = args[i].split("=");
                    System.out.println("All " + parts[1]+" - Category");
                    ArrayList<MemorableQuote> category = db.displayCategory(parts[1]);
                    if (parts[0].equals("category")) {
                      for (MemorableQuote quote : category) {
                      quote.printQuote();
                      db.writeToFile(filename);
                        }
                    }
                  }
                }
                else if(args.length == 1){
                  for (MemorableQuote quote : quotes) {
                      quote.printQuote();
                      db.writeToFile(filename);
                  }
                }
                break;
            case "random":
              if (args.length == 2) {
                for (int i = 1; i < args.length; i++) {
                  String[] parts = args[i].split("=");
                  ArrayList<MemorableQuote> category = db.displayCategory(parts[1]);
                  if (parts[0].equals("category")) {
                  Random rand = new Random();
                  System.out.println("Random " + parts[1]+" - Category");
                  if(category.isEmpty()){
                    System.out.println("No Category Found");
                  }
                  else{
                    int randomIndex = rand.nextInt(category.size());
                    category.get(randomIndex).printQuote();
                    db.writeToFile(filename);
                  }

                  }
                }
              }
              else if(args.length == 1){
                MemorableQuote quote = db.getRandomQuote();
                quote.printQuote();
                db.writeToFile(filename);
              }
                break;
              case "search":
                if (args.length == 2 ){
                  ArrayList<MemorableQuote> quotes1 = db.searchQuotes(args[1]);
                  for (MemorableQuote quote : quotes1) {
                      quote.printQuote();
                      db.writeToFile(filename);
                  }
              }
              break;
            case "display":
                if (args.length >= 2) {
                  String categoryDisplay=null;
                  MemorableQuotesDisplay display = new MemorableQuotesDisplay(db);
                  for (int i = 1; i < args.length; i++) {
                    String[] parts = args[i].split("=");
                    if (parts[0].equals("delay")) {
                      display.setDelayBetweenQuotes(Integer.parseInt(parts[1]));
                    } else if (parts[0].equals("max")) {
                      display.setMaxQuotesToDisplay(Integer.parseInt(parts[1]));
                    } else if (parts[0].equals("category")) {
                      categoryDisplay = parts[1];
                    }
                  }
      
                  try {
                    display.execute();
                    db.writeToFile(filename);
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                }
              break;
            case "delete":
                System.out.print("Enter the line number to delete: ");
                int lineNumber1 = input.nextInt();
                db.deleteQuotes(lineNumber1-1);
              break;
            case "reset":
              if (args.length == 2 ){
                ArrayList<MemorableQuote> quotes1 = db.searchQuotes(args[1]);
                if(quotes1.isEmpty()){
                  System.out.println("Keyword Not Found");
                }
                else{
                  for (MemorableQuote quote : quotes1) {
                    quote.resetQuoteCount();
                    db.writeToFile(filename);
                  }
                  System.out.println("Successfull Reset the count timer!");
                }

              }
              break;
            default:
                  System.out.println("Invalid argument. Use either 'all', 'random', 'display', or 'search <string>'");
              }
            }
          }
