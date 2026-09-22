import java.util.Scanner;
public class ExceptDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try{
			int res = a/b;
			System.out.println("Result = "+res);
		}
        catch(ArithmeticException e){
            System.out.println("Error:cannot divide by zero");
        }
        finally{
            System.out.println("Program ends");
        }
	}		
}	