import java.util.Scanner;
class Factorial1
{
    public int fact(int n)
    {
        int fact=1;
        for(int i=n;i>=1;i--)
            fact=fact*i;
        return (fact);
    }
}
class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Factorial1 ob=new Factorial1();
        System.out.println("The factorial of "+n+" is "+ob.fact(n));
    }
    
}