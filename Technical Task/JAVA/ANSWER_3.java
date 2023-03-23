//Reverse a String
import java.util.Scanner;
public class Question_3 
{
	public static void main(String argu[]) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String= ");
		String str=in.next();
	    char[] carray = str.toCharArray();
	    System.out.println("The string is:" + str);
	    System.out.print("Duplicate Characters in above string are: ");
	    for (int i = 0; i < str.length(); i++) 
	    {
	    	for (int j = i + 1; j < str.length(); j++) 
	    	{	    	
	    		if (carray[i] == carray[j]) 
	    		{
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	   }
}
