package week1;

import java.util.*;
import java.util.StringTokenizer;

public class WordAndCharCounter {
    private String input;
    
     public WordAndCharCounter(String input) {
        this.input = input;
    }
     
    
     Map<String, Integer> countWord = new LinkedHashMap<>();
     Map<Character,Integer> countChar = new LinkedHashMap<>();
         
    
    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content:");
        input = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input," ");
        while(tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            countWord.put(word, countWord.getOrDefault(word, 0) + 1);
        }
        
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) { // Bỏ qua khoảng trắng
                countChar.put(c, countChar.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(countWord);
        System.out.println(countChar);
    }
   
  
}
