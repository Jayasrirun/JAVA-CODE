package DAY8Abraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square s = new Square();
		s.calArea();
		s.show();
		
		Shape shape;
		shape = new Square(21.5f);
		
		shape.calArea();
		shape.show();

	}

}