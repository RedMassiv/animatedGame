package animationGame;

public class Vertex {
	public double x;
	public double y;

	public Vertex(double x,double y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Vertex v1 = new Vertex(15, 76);
		Vertex v2 = new Vertex(0, 0);
		
		System.out.println("v1.x= "+v1.x);
		System.out.println("v2.x= "+v2.x);
		System.out.println("v1= "+v1);
	}
	public String toString() {return "("+x+", "+y+")";}


}
