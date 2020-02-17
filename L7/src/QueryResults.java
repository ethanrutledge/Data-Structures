import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryResults {
    // class variables go here
	
	private final List<String> dictionary;
	private List<String> list;
	private String word;
	private int count;

    /**
     * Constructor for the QueryResults class. <br>
     * Initialize the dictionary and list objects
     * @param filename name of the dictionary file
     * @throws FileNotFoundException exception is thrown to the calling method if unable to open file
     */
    public QueryResults(String filename) throws FileNotFoundException {
        // Call the readDictionary method to assign contents to the member variable, dictionary.
        // Instantiate a new ArrayList for the list variable.
    	dictionary = readDictionary(filename);
    	list = new ArrayList<>();
    }


    /**
     * Getter method for the dictionary object.
     * @return {@link java.util.List} dictionary object
     */
    public List<String> getDictionary() {
    	return this.dictionary;
    }

    /**
     * Getter method for the list object.
     * @return {@link java.util.List} of words found in {@link QueryResults#searchDictionary} method.
     */
    public List<String> getList() {
        return this.list;
    }

    /**
     * Get number of recursive calls.
     * @return the number of recursive calls used in {@code searchDictionary}.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Getter method for the current string being queried.
     * @return the word being queried
     */
    public String getWord(){
        return this.word;
    }

    /**
     * Create a new {@link java.util.List} and then read each token from
     * the file called {@code filename} and add it into the
     * {@link java.util.List}.
     *
     * @param filename name of file
     * @return A list of legal words to use for this recitation
     * @throws FileNotFoundException exception is thrown to the calling method if unable to open file.
     * @see Scanner#hasNext()
     * @see Scanner#next()
     */
    public List<String> readDictionary(String filename) throws FileNotFoundException{
       
    	
    	List<String> list = new ArrayList<>();
    	
		try {
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			
			
			while(sc.hasNext()) {
				list.add(sc.next());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return list;
    }

    /**
     * Recursively search substrings of the parameter {@code word}
     * and store uniquely in the {@link java.util.List} {@code list}.
     * <p>
     *
     * <ol>
     *     <li> Assign {@code word} into the corresponding member variable
     *     <li> Set the member variable for count back to 0
     *     <li> Assign {@code list} to the return value for {@link QueryResults#searchDictionaryHelper(List, String)} method.
     *          Pass in a new ArrayList and the word as parameters.
     * </ol>
     *
     * @param word the word to query.
     */
    public void searchDictionary(String word) {
    	this.word = word;
    	this.count = 0;
    	this.list = searchDictionaryHelper(new ArrayList<>(), word);
    }

    /**
     * Helper method for {@code searchDictionary}. <br>
     *
     * Your recursive logic goes here:
     *
     * <ol>
     *     <li> If the word is less than or equal to two characters, return {@code wordList}.
     *     <li> Increment the counter.
     *     <li> Add the word if it is in the dictionary but not already in the list.
     *     <li> Recursively call the method twice: Once with the first character removed
     *          and once with the last character removed.
     * </ol>
     * Use {@link ArrayList#contains(Object)}.
     * @param wordList A List of unique legal substrings from the parameter, word
     * @param word The word being queried
     * @return A List of unique legal substrings from the parameter, word
     * @see ArrayList#contains(Object)
     */
    public List<String> searchDictionaryHelper(List<String> wordList, String word){
        
    	if (word.length() <= 2) {
    		return wordList;
    	}
    	
    	this.count++;
    	
    	if(this.dictionary.contains(word) && !(wordList.contains(word))) {
    		wordList.add(word);
    		
    	}
    	
    	searchDictionaryHelper(wordList, word.substring(1));
    	searchDictionaryHelper(wordList, word.subSequence(0, word.length() - 1).toString());
    	
    	return wordList;
    }

    /**
     * toString for you QueryResults class.
     * @return String that prints information about the class
     */
    @Override
    public String toString() {
        // Remember to double check your formatting
    	System.out.printf("Dictionary has %d words.\n", this.dictionary.size());
    	System.out.printf("Original string is %s\n", this.word);
    	System.out.printf("String size equals %d\n", this.word.length());
    	System.out.printf("Method called %d times\n", this.count);
    	System.out.println("Contains:");
    	
    	for(int i = 0; i < this.getList().size(); i++) {
    		System.out.println(this.getList().get(i));
    	}
    	
        return "";
    }

    public static void main(String [] args) throws FileNotFoundException {
        // Instantiate object
        QueryResults qr = new QueryResults(args[0]);

        // Call searchDictionary method with a word
        qr.searchDictionary(args[1].toLowerCase());

        // Print list of words found
        // you could also type: System.out.println(qr.toString());
        System.out.println(qr);

    }
}
