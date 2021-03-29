import java.util.*;
public class EncodedMessage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer="";
		char [][] array;
		int numCases = scan.nextInt();
		scan.nextLine();
		
		for(int y=0;y<numCases;y++) {
		String input = scan.nextLine();
		int counter=0;
		answer="";
		array = new char [(int) Math.sqrt(input.length())][(int)Math.sqrt(input.length())];
		//Converts string into an array such that it is in the jumbled up order
		for(int i=0; i<array.length;i++) {
			for(int x=0;x<array[0].length;x++) {
				array[i][x]=input.charAt(counter);
				counter++;
			}
		}
		//constructs correct string by iterating through array
		for(int i=array.length-1;i>=0;i--) {
			for(int x=0;x<array.length;x++) {
				answer+=array[x][i];
			}
		}
		
		System.out.println(answer);

	}
	}

}
