import java.util.Scanner;

public class Anagram {
    
    static void anagrams(String prefix, String word) {
        if(word.length() == 1) {
            System.out.println(prefix + word);
        }
        else {
            for (int i = 0; i < word.length(); i++ ) {
                String current = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                anagrams(prefix + current, before + after);
            }
        }
    }
    
    public static void main(String[] args) {
        
//        String s = new String("nikos");
//        System.out.println(s.length());
//        System.out.println(s.equals(s.substring(0,2)+s.substring(2)));
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word to anagram");
        String word = keyboard.nextLine();
        anagrams("", word);
    }
    
    
}
