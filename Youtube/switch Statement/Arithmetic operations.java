/******************************************************************************
                                Switch Statement

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int a,b;
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter a value of a:");
		a = scanner.nextInt();
		System.out.println("Enter a value of b:");
		b = scanner.nextInt();
		char operator;
		System.out.println("Enter a operator to perform:");
		op = scanner.next().charAt(0);
		
		switch(operator)
		{
		case '+' :
		        System.out.println("a+b=" + (a+b));
		        break;
		case '-':
		        System.out.println("a+b=" + (a-b));
		        break;
		case '*':
		        System.out.println("a+b=" + (a*b));
		        break;
		case '/':
		        System.out.println("a+b=" + (a/b));
		        break;
		case '%':
		        System.out.println("a+b=" + (a%b));
		        break;
		default:
		        System.out.println("Invalid operator");
		        break;
		 
		 
		 
		}
	}
}
