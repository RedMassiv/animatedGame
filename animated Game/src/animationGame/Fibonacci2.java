package animationGame;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=0;
		long b=1;
		while(b<2147483647){
			a=a+b;
			b=a+b;
			a=b-a;
			b=b-a;	
			System.out.println(b);
		}
	}

}
