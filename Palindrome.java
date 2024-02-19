package palindrome;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        int n = 10;
        //int numbers[];
        
        char[] letters = new char[n];
        for (int i=0; i<n; i++) {
            letters[i] = 'a';
        }
        /*String newString = new String(letters);
        assertEquals(,newString);*/
        System.out.println(letters);
        int x, y;
        x =0;
        y = letters.length -1;
        
        System.out.println(y + x);
        for (int i=0; i<n;i++){
            if (x==y){
                x = x+1;
                y = y-1;
            }
        }
            
        
        
    } //end main
    
} //end class
