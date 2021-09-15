import java.util.Scanner;
public class SortTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b = scan.nextInt();
		if(b>a) {
			System.out.println(a+" "+b);
		}
		else {
			System.out.println(b+" "+a);
		}

	}

}
