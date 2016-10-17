package animationGame;

public class Vertex {    //declare Variables
	public double x;
	public double y;

	public Vertex(double x,double y){  //Declaration of a new Method - Vertex
		this.x=x;
		this.y=y;
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
	public Vertex sub(Vertex v2){
		double xx=v2.x-this.x;
		double yy=v2.y-this.y;
		return new Vertex(xx,yy);
	}
	public double distance(Vertex v2){
		double xx=v2.x-this.x;
		double yy=v2.y-this.y;
		return Math.sqrt(xx*xx+yy*yy);
	}
	public Vertex normalized(Vertex v2){
		double teiler= v2.length();
		Vertex normalizedvertex = new Vertex(v2.x/teiler, v2.y/teiler);
		return normalizedvertex;
	}
}
