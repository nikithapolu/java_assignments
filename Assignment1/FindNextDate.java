package Assignment1;
import java.util.Scanner;

public class FindNextDate {

	public static boolean isLeapYear(int year)
	{
	boolean isLeapYear=false;
	if(year%4==0)
	{
	if(year%100==0)
	{
	if(year%400==0) isLeapYear=true;
	else isLeapYear=false;
	}
	else isLeapYear=true;
	}
	else isLeapYear=false; 
	return isLeapYear;
	}

	public static void main(String[] args) {
	    int d,m,y;
		Scanner s=new Scanner(System.in);
		while(true)
		{
	    System.out.println("Enter the day");
	    d=s.nextInt();
	    System.out.println("Enter the month");
		m=s.nextInt();
		System.out.println("Enter the year");
		y=s.nextInt();
		if(d<0 && d>31 && m>12){
			System.out.println("Invalid input");
	        continue;	
 		    } 		
		else break;
			
		}
		
		if(isLeapYear(y) && m==2) 
		{
				if(d==29)
				{
				d=1;
				m=3;	
			    }
				else if(d<29) d++;
				else {
					System.out.println("Invalid date");
                     }
		}	
		else
			{
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) 
				{
				     if(m==12 && d==31) {
			        	 d=1;
			        	 m=1;
			        	 y++;
			         }
			         else {
			        	 if(d==31)
			        	 {
			        	 d=1;
			        	 m++;
			        	 }
			        	 else d++;
			        	 }     
				}
			
			else
			{
			if(d==31) 
				{
				System.out.println("Invalid Date");
				}
			else if(d==30 )
				{
				m++;
				d=1;
				}
			else if(d==28 && m==2) 
			{
				d=1;
				m++;
			}
			else d++;
		}
	
	}
		System.out.println("new date is:"+ d +"/"+ m +"/"+ y);
        s.close();
	}
}