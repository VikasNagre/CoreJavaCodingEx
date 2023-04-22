package singleton;

public class SingletonDesign {
	
	private static SingletonDesign instance;
	
	private SingletonDesign() {
		
	}
	
	public static SingletonDesign getInstance() {
		
		if(instance==null)
			synchronized (SingletonDesign.class) {
				
			}	
			if(instance==null)
			instance= new SingletonDesign();
			return instance;
	}
	
	public static void main(String[] args) {
		SingletonDesign.getInstance();
	}
}
