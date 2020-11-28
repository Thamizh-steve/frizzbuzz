

package fizzbuzz;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		//int n=100;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.println("enter the number - ");
		int number = input.nextInt();
		for(int i=1; i<=number; i++)
		{
			if(i%3==0)
			
				System.out.print("fizz"+" ");
			
			else if(i%5==0)
			
				System.out.print("buzz"+" ");
			
			else if(i%15==0)
			
				System.out.print("fizzbuzz"+" ");
			else
				
			   System.out.print(i + " " );
		}
	}

}
