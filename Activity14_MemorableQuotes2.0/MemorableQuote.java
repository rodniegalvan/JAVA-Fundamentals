public class MemorableQuote {
    private String quoteText;
    private String reference;
    
    // constructor with quote text
    public MemorableQuote(String quoteText) {
        
        this.quoteText = quoteText;
    }
    
    // constructor with quote text and reference
    public MemorableQuote(String quoteText, String reference) {
        this.quoteText = quoteText;
        this.reference = reference;
    }
    
    // getter and setter for quote text
    public String getQuoteText() {
        return quoteText;
    }
    
    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }
    
    // getter and setter for reference
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    // method to check if quote or reference contains the text
    public boolean matches(String text) {
        return quoteText.toLowerCase().contains(text.toLowerCase()) || 
            (reference != null && reference.toLowerCase().contains(text.toLowerCase()));
    }
    
    // method to print quote
    public void printQuote() {
        if (reference == null) {
            System.out.println(quoteText);
        } else {
            System.out.println(quoteText + "\n-- " + reference);
        }
    }
}