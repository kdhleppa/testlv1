package n;

public class n {

	public static void main(String[] args) {

			int n = 12;
		
		    int answer = 0;
		    for (int i = 1; i <= n; i ++) {
		        if (n % i == 0) {
		            answer = answer + i;
		        }
		    }
		    System.out.println(answer);
		
	}

}
