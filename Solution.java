import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int len=s.length();int x=0;
        String[] ar=new String[3*(len/k)-1];
        for(int i=0;i<len-(k-1);i++){
            x=i+k;
            if(x<=len)
              ar[i]=s.substring(i,x);
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int size=ar.length;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++){
                if(ar[j].compareTo(ar[j+1])>0){
                    String temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        smallest=ar[size-1];
        largest=ar[0];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();int n=sc.nextInt();
        Solution ob=new Solution();
        System.out.println(ob.getSmallestAndLargest(s,n));
    }
}