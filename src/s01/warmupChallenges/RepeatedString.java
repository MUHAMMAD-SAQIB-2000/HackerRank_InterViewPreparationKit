package s01.warmupChallenges;

public class RepeatedString {

	public static void main(String[] args) {
//		System.out.println("Result1 : " + repeatedString("abcac", 10));
		System.out.println("Result2 : " + repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400L));
//		System.out.println("Result3 : " + repeatedString("aba", 10));
	}

	public static long repeatedString(String s, long n) {
		if(s.length() == 1 && s.charAt(0) == 'a') {
			return n;
		}
		long count = 0;
		for(char a : s.toCharArray()) {
			if(a == 'a') {
				count++;
			}
		}
		
		long sToRepeat = n / s.length();
		long sToCheck = n % s.length();
		
		count = count * sToRepeat;
		
		System.out.println(sToRepeat+", " + sToCheck+", " + count);
		
		for(int i=0;i<sToCheck;i++) {
			if(s.charAt(i) == 'a')
				count++;
		}
		
		return count;
	}

}
