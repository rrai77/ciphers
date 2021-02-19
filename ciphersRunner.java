import java.util.*;
/**
 * PLEASE NOTE - THIS IS A PROGRAM IN PROGRESS
 * This is a runner class for the ciphers. The program will run in console. 
 * 
 * This is the work of Rhea Rai, 2021
 */
public class ciphersRunner
{
     public static void main(String args[]) {
       //testCases();
       
       Scanner console = new Scanner(System.in);
       
       System.out.print ("What cipher would you like to use, Morse, ROT47, or ROT13? \nPlease type the name exactly >> ");
       String cipherName = console.next();
       console.nextLine();
       
       System.out.print ("\n Do you want to encrypt or decrypt your phrase? >> ");
       String actionStr = console.next().toLowerCase();
       console.nextLine();
       boolean state = false; //means it is decrypted - NEEDS to be encrypted using methods
       if (actionStr.equals("decrypt"))
            state = true; //if it NEEDs to be decrypted, that means it IS encrypted
       
       System.out.print ("\n Finally, what is the phrase? >> ");
       String phrase = console.nextLine();
       
       ciphersTemp toSolve;
       if (cipherName.toLowerCase().substring(0,5).equals("morse")) { //extra things, like lowercase and the substring, to make minimize user error
            toSolve = new ciphersMorseCode(phrase, state);
            System.out.println("\n\n\""+ phrase + "\" " + actionStr + "ed is " + toSolve.getFinWord());
        }   
    }
    
    /** 
     * This is to run test cases while checking code
     */
    public static void testCases() {
       ciphersMorseCode x = new ciphersMorseCode("hello world", false);
       System.out.println(x.getFinWord()); //should return .... . .-.. .-.. --- | .-- --- .-. .-.. -.. 
       
       ciphersMorseCode y = new ciphersMorseCode(".... . .-.. .-.. --- | .-- --- .-. .-.. -..", true);
       System.out.println(y.getFinWord()); //should return "hello world"
    }
}


