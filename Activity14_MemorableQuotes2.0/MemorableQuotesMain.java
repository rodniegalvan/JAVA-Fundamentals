import java.util.ArrayList;
import java.util.Random;

public class MemorableQuotesMain {

    public static void main(String[] args) {
        MemorableQuoteDatabase db = new MemorableQuoteDatabase();
        db.addQuote(new MemorableQuote("The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.",null,0,"Love"));
        db.addQuote(new MemorableQuote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill",0,"Life"));
        db.addQuote(new MemorableQuote("The purpose of our lives is to be happy.", "Dalai Lama",0,"Life"));
        db.addQuote(new MemorableQuote("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.","Christian D. Larson",0,"Inspirational"));
      if (args.length <= 0) {
          System.out.println("No argument. Use either 'all', 'random', 'display', or 'search <string>'");
      }
        switch(args[0]){
            case "all":
                ArrayList<MemorableQuote> quotes = db.getAllQuotes();
                if (args.length == 2) {
                  for (int i = 1; i < args.length; i++) {
                    String[] parts = args[i].split("=");
                    System.out.println(parts[1]);
                    ArrayList<MemorableQuote> category = db.displayCategory(parts[1]);
                    if (parts[0].equals("category")) {
                      System.out.println("All " + parts[1]+" - Category");
                      for (MemorableQuote quote : category) {
                      quote.printQuote();
                        }
                    }
                  }
                }
                else if(args.length == 1){
                  for (MemorableQuote quote : quotes) {
                      quote.printQuote();
                  }
                }
                break;
              case "random":
              if (args.length == 2) {
                for (int i = 1; i < args.length; i++) {
                  String[] parts = args[i].split("=");
                  System.out.println(parts[1]);
                  ArrayList<MemorableQuote> category = db.displayCategory(parts[1]);
                  if (parts[0].equals("category")) {
                  Random rand = new Random();
                  System.out.println("Random " + parts[1]+" - Category");
                  int randomIndex = rand.nextInt(category.size());
                  category.get(randomIndex).printQuote();
                  }
                }
              }
              else if(args.length == 1){
                MemorableQuote quote = db.getRandomQuote();
                quote.printQuote();
              }
                break;
              case "search":
                if (args.length == 2 ){
                  ArrayList<MemorableQuote> quotes1 = db.searchQuotes(args[1]);
                  for (MemorableQuote quote1 : quotes1) {
                      quote1.printQuote();
                      System.out.println();
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
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                }
                break;
                default:
                  System.out.println("Invalid argument. Use either 'all', 'random', 'display', or 'search <string>'");
              }
            }
          }
