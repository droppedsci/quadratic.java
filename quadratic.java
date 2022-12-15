import java.util.Scanner;

public class quadratic {
		
		public static void main (String[] args) {
			
			int a , b , c;  //ax^2 + bx^2 + c
			Scanner scanner = new Scanner(System.in);	
		    System.out.println(" Enter the coefficient of x squared: ");
			    a = scanner.nextInt();
			    
			    System.out.println(" Enter the coefficent of x: ");
			    b = scanner.nextInt();
			    
			    System.out.println(" Enter the constant: ");
			    c = scanner.nextInt();
			    
			    
			    double discriminant  = Math.pow(b, 2) - (4 * a * c);
			    double root1 = ((-1 * b)+ Math.sqrt(discriminant)) / (2 * a);
			    double root2 = ((-1 * b)- Math.sqrt(discriminant)) / (2 * a);
			    
			    System.out.println( "Root #1:" + root1);
			    System.out.println ("Root #2:" + root2);
			    
		}

	}
