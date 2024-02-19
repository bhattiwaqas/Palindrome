package palindrome;
import java.util.*;


public class Palindrome {
    
    public static String sPalindrome() { //create method sPalindrome
        int n = 10000;
        
        char[] letters = new char[n]; //list of letters
        for (int i=0; i<n; i++) {
            letters[i] = 'a';
        }
        
        
        
        /*String newString = new String(letters);
        assertEquals(,newString);*/
        
        int x, y; //create counter variables
        x =0;                  //x goes left to right
        y = letters.length -1; //y goes right to left. start at end
        
        letters[0] = 'n'; //guaranteed to not be a palindrome
        letters[y] = 'm';
        
        //System.out.println(letters); //print list of letters
        
        
        
        String string = new String(letters); //turn list of letters into a string
        
        String check = string;
        check = check.toLowerCase();
        
        //System.out.println(string.charAt(x) );
        
        boolean bool= true;
        
        //System.out.println(y + x);
        String s1 = "";
        for (int i=0; i<n;i++){                                   //for all amount of letters (10,100,...)
            if (string.charAt(x) == string.charAt(y) ){ //if char at x=y then
                x = x+1;                                          // x= x+1
                y = y-1;                                          // y= y-1
            }
            else {
                System.out.println("Not a palindrome");         // not a palindrome
                bool = false;
                s1 = "false";
                break;
            }
            if ( (x==y) || (x>y) ){                               // if counters x=y or if x>y then
                System.out.println("It is a palindrome");       //have a palindrome
                bool = true;
                s1 = "true";
                break;
            }
        } // end for loop
        return s1;
    } // end palindrome method

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        
        System.out.println(sPalindrome() );
        
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
        
    } //end main
    
} //end class