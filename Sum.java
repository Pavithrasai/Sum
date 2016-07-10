import java.io.*l;
import java.util.*;
import java.lang.*;
public class Sum
{
public static void main(String[]args)
{
int sum=0;
int n;
System.out.println("Enter the n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=n; i++) 
{

  sum += i; 

}

 System.out.println("The sum is " + sum);
}
}
