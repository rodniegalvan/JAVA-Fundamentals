import java.util.ArrayList;
import java.util.Random;

public class MemorableQuoteDatabase {
    private ArrayList<MemorableQuote> quotes;
    private Random rand;
    
    public MemorableQuoteDatabase() {
        quotes = new ArrayList<MemorableQuote>();
        rand = new Random();
    }
    
    public void addQuote(MemorableQuote quote) {
        quotes.add(quote);
    }
    
    public void removeQuote(MemorableQuote quote) {
        quotes.remove(quote);
    }
    
    public int getQuoteCount() {
        return quotes.size();
    }
    public ArrayList<String> getCategory() {
        ArrayList<String> categoryList = new ArrayList<>();
        for (MemorableQuote quote : quotes) {
            categoryList.add(quote.getCategory());
        }
        return categoryList;
    }
    
    public MemorableQuote getQuoteByIndex(int n) {
        return quotes.get(n);
    }
    
    public ArrayList<MemorableQuote> getAllQuotes() {
        return quotes;
    }
    
    public MemorableQuote getRandomQuote() {
        if (quotes.size() == 0) {
            throw new IllegalArgumentException("The quotes list is empty");
        }
        int randomIndex = rand.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }
    public void displayQuotes(String category) {
        for (MemorableQuote quote : quotes) {
          if (category == null || category.equals(quote.getCategory())) {
            quote.printQuote();
          }
        }
    }
    public ArrayList<MemorableQuote> searchQuotes(String text) {
        ArrayList<MemorableQuote> result = new ArrayList<>();
        for (MemorableQuote quote : quotes) {
            if (quote.matches(text)) {
                result.add(quote);
            }
        }
        return result;
    }
    public ArrayList<MemorableQuote> displayCategory(String category) {
        ArrayList<MemorableQuote> categResult = new ArrayList<>();
        for (MemorableQuote quote : quotes) {
          if (category.equals(quote.getCategory())) {
            categResult.add(quote);
            System.out.println("dfgsdgsssssssssssssssssssssDF"+categResult);
          }
        }
        return categResult;
    }
}