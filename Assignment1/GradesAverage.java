package Assignment1;
import java.util.Scanner;
public class GradesAverage{
	
public static void main(String gg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students :");
		int numStudents=sc.nextInt();
		System.out.print("\n");
		int grades[]=new int[numStudents];
		int i=1,grade,sum=0;
		while(true)
		{   
			if(i>numStudents) break;
			System.out.print("Enter the grade for student"+i+" : ");	
			grade=sc.nextInt();
			if(grade>0 && grade<100) grades[i-1]=grade;
			else {
				System.out.println("Invalid grade, try again...");		
				continue;
			}
			i++;
		}
		for(int j=0;j<grades.length;j++)
		{
			sum+=grades[j];
		}
		System.out.println("The average is: "+(float)sum/numStudents);			
        sc.close(); 
	}
}