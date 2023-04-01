package Basic_Program_Type_1;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[]args)
	{
		System.out.println("Enter the number = ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp = n;
		int count =0;
		int sum = 0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp = n;
		while(temp>0)
		{
			int rem = temp%10;
			sum+=Math.pow(rem,count);
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("The given number "+n+" is Armstrong");
		}
		else
		{
			System.out.println("The given number "+n+" is not Armstrong");
		}
	}
}