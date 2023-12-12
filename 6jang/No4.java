package ct6;

package base;
public class Shape {
	public void draw() { System.out.println("Shape"); }
}

package derived;
import base.Shape;
public class Circle extends Shape {
	public void draw() { System.out.println("Cirlce"); }
}

package app;
import base.Shape
import derived.Circle
public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}