package animationGame;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Fibonacci {
static int compute (int n){
	if(n<=0){
		return 0;
	}else if(n==1){
		return 1;
	}else{
		int a=0;  
		int b=1;  
		int i=2;
		while(i<=n){
			int aa=b; 
			int bb=a+b; 
			a=aa; 
			b=bb;  
			i++;
		}
	return b;
	}
}
public static void main (String[] args) throws Exception{
	System.out.println("Enter number:");
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	String aLine=r.readLine();
	int n=Integer.parseInt(aLine);
	int result=compute(n);
	System.out.println("Fib("+n+")="+result);}
}

