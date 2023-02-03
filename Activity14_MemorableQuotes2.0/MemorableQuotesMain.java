import java.util.ArrayList;

public class MemorableQuotesMain {
    public static void main(String[] args) {
        MemorableQuoteDatabase db = new MemorableQuoteDatabase();
        db.addQuote(new MemorableQuote("The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart."));
        db.addQuote(new MemorableQuote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill"));
        db.addQuote(new MemorableQuote("Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.", "Christian D. Larson"));
        if (args.length == 1) {
            if (args[0].equals("all")) {
                ArrayList<MemorableQuote> quotes = db.getAllQuotes();
                for (MemorableQuote quote : quotes) {
                    quote.printQuote();
                    System.out.println();
                }
            } else if (args[0].equals("random")) {
                MemorableQuote quote = db.getRandomQuote();
                quote.printQuote();
            } else {
                System.out.println("Invalid argument. Use either 'all', 'random', or 'search <string>'");
            }
        } else if (args.length == 2 && args[0].equals("search")) {
            ArrayList<MemorableQuote> quotes = db.searchQuotes(args[1]);
            for (MemorableQuote quote : quotes) {
                quote.printQuote();
                System.out.println();
            }
        } else {
            System.out.println("Invalid argument. Use either 'all', 'random', or 'search <string>'");
        }
    }
}