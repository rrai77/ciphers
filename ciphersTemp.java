import java.util.*;

/**
 * Abstract class for the remaining ciphers
 *
 * This is the work of Rhea Rai, 2021
 */

public abstract class ciphersTemp
{
    private final String rootAlphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
    private String word;
    private final boolean encryptedTrue; //if this equals true - the word is already encrypted
    private String finalWord;
    HashMap<String, String> toText;
    HashMap<String, String> toCode;
    
    
    public ciphersTemp(String w, boolean et)
    {
        word = w;
        encryptedTrue = et;
        
        toText = new HashMap<>();
        toCode = new HashMap<>();
    }

    /**
     * This method encodes (needs to be implemented)
     */
    public abstract String encrypt(String s);
    
    /**
     * This method decodes (needs to be implemented)
     */
    public abstract String decrypt(String s);
    
    /** getters **/
    public String getRoot() {return rootAlphabet;}
    public String getWord() {return word;}
    public boolean getET() {return encryptedTrue;}
    public String getFinWord() {return finalWord;}
    public HashMap<String, String> getToText() {return toText;}
    public HashMap<String, String> getToCode() {return toCode;}
    
    /**setters **/
    public void setFinWord(String w) {finalWord = w;}
}
