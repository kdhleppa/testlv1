package lessNumber;

public class lessNumber {

	public static void main(String[] args) {

		int answer = 0;
		
		String t = "500220839878";
		
		String p = "17" ;
		
		long pNumber = Long.parseLong(p);
		
		int split = t.length() - p.length() + 1;
		
		
		for (int i = 0; i < split; i++) {
			String part = t.substring(i, i+ p.length());
			long s = Long.parseLong(part);
			System.out.println(s);
			if (s <= pNumber) {
				answer++;
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		System.out.println("answer : " + answer);
	}

}
