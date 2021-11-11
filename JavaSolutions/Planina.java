
import java.util.*;
import java.util.Map.Entry;
public class Planina {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int numIterations= scan.nextInt();
		int [] arr = new int[16];
		arr[0]=2;
		arr[1]=3;
		arr[2]=5;
		for(int i=3;i<16;i++) {
			arr[i]=arr[i-1]+(arr[i-1]-1);
		}
		System.out.println(arr[numIterations]*arr[numIterations]);
		
		
		
		    
	}
	
}
