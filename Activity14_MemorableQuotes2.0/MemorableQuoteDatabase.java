import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
          }
        }
        return categResult;
    }
    public boolean readFromFile(String filename) {
        File file = new File(filename);
        try (Scanner sc = new Scanner(file)) {
          while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("@");
            int count = Integer.parseInt(parts[2]);
            quotes.add(new MemorableQuote(parts[0], parts[1], count, parts[3]));
          }
          return true;
        } catch (FileNotFoundException e) {
          System.out.println("File not found: " + filename);
          return false;
        }
    }
    public boolean writeToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            ArrayList<String> write = new ArrayList<>();
            for(MemorableQuote quote: quotes){
                write.add(quote.getQuoteText() +"@"+ quote.getReference() +"@"+ quote.getCount() +"@"+ quote.getCategory());
            }
            for (String str : write) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return true;
        } 
        catch (IOException e) {
            System.out.println("An error occurred while updating data in the file: " + e.getMessage());
            return false;
        }
    }
    public void deleteQuotes(int index){
        try {
            FileWriter writer = new FileWriter("Quotes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            ArrayList<String> write = new ArrayList<>();
            for(MemorableQuote quote: quotes){
                write.add(quote.getQuoteText() +"@"+ quote.getReference() +"@"+ quote.getCount() +"@"+ quote.getCategory());
            }
            write.remove(index);
            for (String str : write ){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while updating data in the file: " + e.getMessage());
        }
    }
    public void addQuotes(ArrayList<String>quote1, String filename){
        try {
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String str : quote1) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data to the file: " + e.getMessage());
        }
    }
    
}