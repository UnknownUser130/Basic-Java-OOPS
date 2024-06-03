import java.util.Scanner;
import java.util.Arrays;
public class Solution1 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean result=false;
    // check if length is same
    if(a.length() == b.length()) {

      // convert strings to char array
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

      // sort the char array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        result = Arrays.equals(charArray1, charArray2);
            }
            return result;
        }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}