import java.util.ArrayList;
import java.util.Random;

public class MemorableQuotesMain {
  public static void main(String[] args) {
    ArrayList<MemorableQuote> quotes = new ArrayList<>();
    quotes.add(new MemorableQuote("Life is like a box of chocolates, you never know what you're going to get."));
    quotes.add(new MemorableQuote("The greatest glory in living lies not in never falling, but in rising every time we fall."));
    quotes.add(new MemorableQuote("Don't watch the clock; do what it does. Keep going."));
    quotes.add(new MemorableQuote("You miss 100% of the shots you don't take."));
    quotes.add(new MemorableQuote("Believe you can and you're halfway there."));

    Random random = new Random();
    int randomIndex = random.nextInt(quotes.size());
    MemorableQuote randomQuote = quotes.get(randomIndex);
    System.out.println(randomQuote.getQuoteText());
  }
}
