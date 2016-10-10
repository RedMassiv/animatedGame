package animationGame;

public class Vertex {    //declare Variables
	public double x;
	public double y;

	public Vertex(double x,double y){  //Declaration of a new Method - Vertex
		this.x=x;
		this.y=y;
	}
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
	public String toString() {return "("+x+", "+y+")";}  //change output layout of Method-Vertex
	public double length() {return Math.sqrt(x*x+y*y);}  //calculate distance to (0,0)
	
	public Vertex skalarMult(double s) {    //multiplicate coordinates whith static factor
		return new Vertex(x*s,y*s);
	}
	
	public Vertex add(Vertex v2) {    //Create new Method but coordinates were added with Vertex v2
		return new Vertex(x+v2.x,y+v2.y);
	}
	
	public void addMod(Vertex v2) {  //manipulate coordinates x & y for later use, coords were added with Vertex v2
		x=x+v2.x;
		y=y+v2.y;
	}
	
	public void setX(double x) {this.x = x;} //Werte auf gewünschten übergabeparameter setzen
	public void setY(double y) {this.y = y;}
	
	public double getX() {return x;} //
	public double getY() {return y;}
	
	public boolean equals(Object thatObject){ //Funktion equals überschreiben
		if(thatObject instanceof Vertex){  //prüfen of variable auch vom Typ vertex ist
			Vertex that = (Vertex)thatObject;  //Variable als vertex markieren
			return this.x==that.x && this.y==that.y; //
		}
		return false;
	}
}
