
import java.util.*;

class SlowTrain
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	double arrivalTime, actualTime, rohitTime;
	int testCase;
	double waitingTime, min1,min2;
	System.out.println("Enter the number of test cases:");
	testCase=sc.nextInt();
	if(testCase<=10 && testCase>=1)
	{
		for(int t=1; t<=testCase; t++)
		{
		 System.out.println("Enter the time when Rohit arrives:");
		 rohitTime=sc.nextDouble();
		 System.out.println("Enter the time when the train actually arrives:");
		 actualTime=sc.nextDouble();
		 System.out.println("Enter the time  when the train has to arrive:");
		 arrivalTime=sc.nextDouble();
		 if(rohitTime>actualTime)
			actualTime=actualTime+12;
		 min1=rohitTime%1;
		 min2=actualTime%1;
		 if(min2<min1)
		 {
		   waitingTime=.60-min1+min2;	
		 }
		 else
		 {
	     	   waitingTime=min2-min1;
		 }
		 int time;
		 time=(int)(waitingTime*100);
		 System.out.println("Rohit has to wait for "+time+" minutes");
		}
	}
	else
		System.out.println("Invalid input");
}
}