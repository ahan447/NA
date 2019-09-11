package NA.java0903;

public class opop {

	public static void main(String[] args) {
		int n =0;
		while(true) {
			try {
				if(n % 3 == 0)
					System.out.println("빨강");
				if(n % 3 == 1)
					System.out.println("파랑");
				if(n % 3 == 2)
					System.out.println("노랑");
				n++;
				Thread.sleep(1000);
			}catch(Exception e) {}
			}
		}
	}

