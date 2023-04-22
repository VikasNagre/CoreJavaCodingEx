package anonymousInnerClass;


// Functional interface

@FunctionalInterface
interface MyInterface{
	public int getsum(int a, int b);
	default void printString() {
		
		System.out.println("I am default method");
	}
}

class MyInterfaceImpl implements MyInterface{

	@Override
	public int getsum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class FunctionalInterfaceTest {
	MyInterfaceImpl obj = new MyInterfaceImpl();
	//System.out.println(obj.getsum(20,30));
	
	
//	Anonymous inner class
	MyInterface interfObj = new MyInterface() {
		
		@Override
		public int getsum(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	
//	Lambda Expression
	
	MyInterface interfaceLambda = (a,b) -> {return (a+b);};
	//System.out.println(obj.getsum(20,30));
}
