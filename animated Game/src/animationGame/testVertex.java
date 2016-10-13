package animationGame;

public class testVertex {
	public static void main(String[] args) { //Main method
		Vertex v1 = new Vertex(15, 76);      //create Methods-Vertex
		Vertex v2 = new Vertex(0, 0);
		Vertex v3 = (v1.skalarMult(2));
		
		System.out.println("v1.x= "+v1.x);
		System.out.println("v2.x= "+v2.x);
		System.out.println("v1= "+v1);
		System.out.println("v1.length= "+v1.length());
		System.out.println("v2.length= "+v2.length());
		System.out.println("v3.skalarMult= "+ v3);
		System.out.println(v1.equals(v2));
		v2.setX(15);
		v2.setY(76);
		System.out.println(v1.equals(v2));
		System.out.println();
		System.out.println();	
	}
}
