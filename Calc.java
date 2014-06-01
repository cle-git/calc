package Calculator;
import java.util.Scanner;

public class Calc {
	
	static double number1;
	static double number2;
	static String operation;
	static double answer;
	static double temp;
	static String quit;
	static String q;
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter first operand: ");
		number1=input.nextDouble();
		
		do{
		System.out.print("Enter operation: ");
		operation = input.next();
		
		System.out.print("Enter second operand: ");
		number2=input.nextDouble();
	
		
		if(operation.equals("+")){
			temp=number1+number2;
			System.out.println(temp);
		}
		
		if (operation.equals("-")){
			temp=number1-number2;
			System.out.println(temp);
		}
		
		if (operation.equals( "/")){
			temp=number1/number2;
			System.out.println(temp);
		}
		
		if(operation.equals("*")){
			temp= number1*number2;
			System.out.println(temp);
		}
		
		System.out.println("Do you want to quit? Enter Y or N");
		q=input.next();

		number1=temp;
		
	}while( !q.equals ("Y"));
		
	}
	
}
