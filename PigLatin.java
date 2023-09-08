import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
    String phrase;
    int len;
    int prevWord;
    int wordLen;
    String word;
    while (true) {
        System.out.print("Enter a word to be translated: ");
        phrase = scan.nextLine().toLowerCase();
        if (phrase.toLowerCase().equals("quit")) {
            System.out.println("Goodbye!");
            break;
        }
        len = phrase.length();
        prevWord = 0;
        for (int i = 0; i < len; i++) {
            word = "";
            if (phrase.charAt(i) == ' ') {
                word = phrase.substring(prevWord, i);
                prevWord = i;
                wordLen = word.length();
                if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
                    word = word + "way";
                }
                else {
                    word = word.substring(1, wordLen) + word.charAt(0) + "ay";
                }
        System.out.println(word);    
            }
            
        }         
    }
    }
}