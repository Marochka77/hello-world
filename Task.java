import java.util.Scanner; 

public class Task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input integer number i:");
		int i = scan.nextInt();
		
		System.out.println("Input real number x:");
		double x = scan.nextDouble(); 
		
		System.out.printf("x = %.2f;  i = %d%n",x,i);
		System.out.printf("x + i = %.2f%n",(x+i));
		scan.close();
	}
}
