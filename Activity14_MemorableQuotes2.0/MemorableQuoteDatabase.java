import java.util.ArrayList;
import java.util.Random;

public class MemorableQuoteDatabase {
    private ArrayList<MemorableQuote> quotes;
    private Random rand;
    
    public MemorableQuoteDatabase() {
        quotes = new ArrayList<MemorableQuote>();

        quotes = new ArrayList<>();
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
    
    public ArrayList<MemorableQuote> searchQuotes(String text) {
        ArrayList<MemorableQuote> result = new ArrayList<>();
        for (MemorableQuote quote : quotes) {
            if (quote.matches(text)) {
                result.add(quote);
            }
        }
        return result;
    }
}