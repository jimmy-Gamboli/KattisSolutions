
import java.util.Scanner;
public class SodaSlurper2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		
		int totalNumCans = e+f;
		int numDrank =0;
		
		while(totalNumCans>=c) {
			numDrank += totalNumCans/c;
			totalNumCans = (totalNumCans/c)+ (totalNumCans%c);
		}
		
		System.out.println(numDrank);

	}

}
