import java.util.*;
public class SchoolSpirit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numScores = scan.nextInt();
		ArrayList<Double> arr = new ArrayList<Double>();
		/// Scan in the array
		for(int i=0;i<numScores;i++) {
			arr.add((double) scan.nextInt());
		}
		///calculate score using formula
		double score=calcScore2(arr);
		double newScore=0;
		
		
		//Finding new score
		for(int i=0;i<numScores;i++) {
			double d=arr.remove(i);
			newScore+=calcScore2(arr);
			arr.add(i, d);
		}
		System.out.println(score+"\n"+(newScore/numScores));
		
		
	}
	public static double calcScore2(ArrayList<Double> arr) {
		double score =0;
		for(int i=0;i<arr.size();i++) {
			score += arr.get(i)*Math.pow(.8, i);
		}
		return .2*score;
	}

}
