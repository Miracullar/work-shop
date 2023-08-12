import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner az = new Scanner(System.in);
	    int a = az.nextInt();
	    if (a%2 == 0)
	    {
	        System.out.println("The number "+ a + " is: Even! ");
	    }
	    else{
	         System.out.println("The number "+ a + " is: Odd! ");
	    }
		
	}
}
