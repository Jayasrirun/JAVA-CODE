package DAY4;

public class Executor {

	public static void main(String[] args) {
		base obj = new base();		//object creation
		obj.methodDefault();
		obj.methodProtected();
		obj.methodPublic();
		
		obj.varDefault = 11;
		obj.methodDefault();
		
		obj.varProtected = 31;
		obj.methodProtected();
		
		obj.varPublic = 21;
		obj.methodPublic();
	}

}