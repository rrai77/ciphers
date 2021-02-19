import java.util.*;

/**
 * This program is used by the ciphersRunner class and
 * encrypts/decrypts Morse Code phrases.
 * 
 * This is the work of Rhea Rai, 2021
 */
public class ciphersMorseCode extends ciphersTemp
{
    String[] morseKey = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", 
                       ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", 
                       ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", 
                       "-....", "--...", "---..", "----.", "-----", "|"};
    
    public ciphersMorseCode(String w, boolean et)
    {
        super (w, et);
        
        for (int i=0; i<getRoot().length(); i++) { //setting up the hashmaps
            toText.put(morseKey[i], getRoot().substring(i, i+1)); 
            toCode.put(getRoot().substring(i, i+1), morseKey[i]);
        }
        if (getET()) //means - if it is encrypted (see ciphersTemp)
            setFinWord(decrypt(getWord()));
        else 
            setFinWord(encrypt (getWord()));
    }
    
    
    @Override
    public String encrypt(String s){
        String toReturn = "";
        String[] arrEnglish = s.split(""); 
        for (int i=0; i<arrEnglish.length; i++)
            toReturn += toCode.get(arrEnglish[i]) + " ";
        return toReturn;
    }
    @Override
    public String decrypt(String s){
        String toReturn = "";
        String[] arrMorse = s.split(" | "); 
        for (int i=0; i<arrMorse.length; i++)
            toReturn += toText.get(arrMorse[i]);
        return toReturn;
    }
}
