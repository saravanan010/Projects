package Basic_Program_Type_1;
import java.util.Scanner;
public class Multiplication_Table 
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the table = ");
		int t = in.nextInt();
		System.out.println("Enter the table limit= ");
		int n = in.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(t+"x"+i+"="+(t*i));
		}
	}
}
