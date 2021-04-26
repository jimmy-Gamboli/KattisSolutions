import java.util.*;
public class AnthonyAndDiablo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		double perimeter = scan.nextDouble();
		
		double radius = (perimeter/(2*Math.PI));
		double areaOfCircle = Math.PI*(radius*radius);
		if(area<areaOfCircle) {
			System.out.println("Diablo is happy!");
		}
		else {
			System.out.println("Need more Materials!");
		}
		
		

	}

}
