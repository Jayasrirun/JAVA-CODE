package DAY4;

public class Executor3 {

	public static void main(String[] args) {
		base b = new base();
		//private, default, protected members cannot be access outside the package
		b.methodPublic();
		
		b.varPublic = 22;
		b.methodPublic();
	}

}
