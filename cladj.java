import java.util.Scanner;

public class cladj {

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int a=0;
        String[] ar=new String[s.length()];
        for(int i=k;i<s.length();i=i+k){
            ar[a]=s.substring(0,i);
            a++;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        /*for(int i=0;i<ar.length-1;i++){
            smallest=ar[i];
            largest=ar[i];
            if(smallest.compareTo(ar[i+1])>0)
               smallest=ar[i+1];
            else if(largest.compareTo(ar[i+1])<0)
               largest=ar[i+1];
        }*/
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //return smallest + "\n" + largest;
    }

}