package s01.warmupChallenges;

public class CountingValleys {

	public static void main(String[] args) {
		System.out.println("Test Case 1: " + countingValleys(8, "UDDDUDUU"));
	}

	public static int countingValleys(int steps, String path) {
		int valleys = 0;
		int level = 0;
		
		for(char step : path.toCharArray()) {
			if(step == 'U')
				level++;
			else
				level--;
			
			if(level == 0 && step == 'U') {
				valleys++;
			}
		}
		
		return valleys;
	}

}
