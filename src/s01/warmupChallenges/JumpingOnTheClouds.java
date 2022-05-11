package s01.warmupChallenges;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		List<Integer> c1 = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
		System.out.println("Result 1: " + jumpingOnClouds(c1));

		List<Integer> c2 = Arrays.asList(0, 0, 0, 0, 1, 0);
		System.out.println("Result 2: " + jumpingOnClouds(c2));
		
	}

	public static int jumpingOnClouds(List<Integer> c) {
		int numberOfJumps = 0;

		for (int i = 0; i < c.size() - 1; i++) {
			if(c.get(i) == 0) {
				i++;
			}
			System.out.println(i);
			numberOfJumps++;
		}
		return numberOfJumps;
	}

}
