public class MemorableQuote {
    private String quoteText;
    private String reference;
    private int count;
    private String category;
    
    // constructor with quote text, reference and count
    public MemorableQuote(String quoteText, String reference, int count, String category) {
        this.quoteText = quoteText;
        this.reference = reference;
        this.count = count;
        this.category = category;
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
    // getter and setter for count
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    // getter and setter for category
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    // method to check if quote or reference contains the text
    public boolean matches(String text) {
        return quoteText.toLowerCase().contains(text.toLowerCase()) || 
            (reference != null && reference.toLowerCase().contains(text.toLowerCase()))
            || category.toLowerCase().contains(text.toLowerCase());
    }
    
    // method to print quote
    public void printQuote() {
        count++;
        if (reference == null) {
            System.out.println(count + " "+ quoteText);
        } else {
            System.out.println(count + " " + quoteText + "\n\t-- " + reference);
        }
    }
    public void resetQuoteCount(){
        this.count = 0;
    }
}