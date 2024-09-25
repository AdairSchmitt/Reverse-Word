import java.util.Scanner;
public class ReverseWord
	{

		public static void main(String[] args)
			{
			Scanner user = new Scanner(System.in);
			System.out.println("Enter your word");
			String text = user.nextLine();
			reverseWord(text);	
			}
		public static String reverseWord(String s)
		{
			String [] myArray = s.split("");
			String rev = "";
			for (int i = myArray.length-1; i > myArray.length-myArray.length-1; i--)
				{
				rev = myArray[i];
				System.out.print(rev);
				}
			
			return rev; 
			
			
		}

	}
