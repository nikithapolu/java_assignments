package Assignment1;
import java.util.*;
public class CopyOfArray{
public static void main(String gg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		 System.out.print("Elements of arr1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("\n");
	    int []arr2=Arrays.copyOf(arr1,n);
	    System.out.println("Elements of arr2");
	    for(int i=0;i<n;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	sc.close();
	}
}