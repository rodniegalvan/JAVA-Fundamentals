import java.util.Random;

public class MemorableQuotesDisplay {
  private MemorableQuoteDatabase quoteDatabase;
  private int delayBetweenQuotes = 3;
  private int maxQuotesToDisplay = 0;

  public MemorableQuotesDisplay(MemorableQuoteDatabase quoteDatabase) {
    this.quoteDatabase = quoteDatabase;
  }

  public int getDelayBetweenQuotes() {
    return delayBetweenQuotes;
  }

  public void setDelayBetweenQuotes(int delayBetweenQuotes) {
    this.delayBetweenQuotes = delayBetweenQuotes;
  }

  public int getMaxQuotesToDisplay() {
    return maxQuotesToDisplay;
  }

  public void setMaxQuotesToDisplay(int maxQuotesToDisplay) {
    this.maxQuotesToDisplay = maxQuotesToDisplay;
  }

  public void execute() throws InterruptedException {
    int displayedQuotes = 0;
    Random random = new Random();
    int quoteCount = quoteDatabase.getQuoteCount();
  
    while (maxQuotesToDisplay <= 0 || displayedQuotes < maxQuotesToDisplay) {
      if (quoteCount > 0) {
        int quoteIndex = random.nextInt(quoteCount);
        quoteDatabase.getQuoteByIndex(quoteIndex).printQuote();
        displayedQuotes++;
      }
      Thread.sleep(delayBetweenQuotes * 1000);
    }
  }
}