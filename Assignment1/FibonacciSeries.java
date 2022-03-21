package Assignment1;
import java.util.Scanner;
public class FibonacciSeries{
public static void printAverageOfFibonacciNumber(int n)
{
int f1=1,f2=0,f3=1,sum=0;
for(int i=1;i<=20;i++)
{
f3=f1+f2;
f1=f2;
f2=f3;
sum=sum+f3;
System.out.print(f3+" ");
}
System.out.print("\n");
System.out.print("The average is : "+(float)sum/n);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("The first 20 Fibonacci numbers are:");
printAverageOfFibonacciNumber(n);
sc.close();
}
}