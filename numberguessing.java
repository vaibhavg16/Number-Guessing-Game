import java.util.Random;
import java.util.Scanner;
public class numberguessing 
{
	public static void main(String args[])
	{
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Range of numbers : ");
		int number=sc.nextInt();
		
		int randomnumber=ran.nextInt(number);         // generating random from number specified by user
		// System.out.println("Random number is: "+randomnumber);  // For cheating
		int count=0;
		while(true)
		{
			System.out.print("Enter your guess Number  : ");
			
			int playerGuess = sc.nextInt();
			count++;
			if(playerGuess == randomnumber)
			{
				System.out.println("*** Yeah..!! Its correct. YOU WIN...!! ***\n__________________________________________________");
				System.out.println("YOU TOOK "+count+" CHANCES TO WIN");
				break;
			}
			else if(randomnumber > playerGuess)
			{
				System.out.println("__________________________________________________\n*** Oops..!! The Number is Greater.\n TRY AGAIN ***\n__________________________________________________");
			}
			else 
			{
				System.out.println("*** Oops..!! The Number is Lower. TRY AGAIN ***\n__________________________________________________");
			}
			
		}
		sc.close();
	}
	
}
