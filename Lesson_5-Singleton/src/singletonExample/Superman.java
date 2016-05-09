package singletonExample;

//A singleton class can be instantiated only once. There can be only 1 object of its type.
public class Superman {

	private int speed;

	// ///////////////////////////////////////////////////
	//3 REQUREMENTS FOR A SINGLETON CLASS:
	
	//1.Must have a PRIVATE AND STATIC INSTANCE ATTRIBUTE. The singleton is responsible to its own instantiation. It stores its only instance.
	//Initialised by invoking the CTOR.
	private static Superman instance = new Superman();

	//2.Must have a PRIVATE CTOR. The CTOR is private so it can not be accessed by the client.
	private Superman() {
	}

	//3.Must have a PUBLIC AND STATIC getInstance() METHOD. The singleton lets clients to get the only instance of the class, not create a new one.
	//The method needs to be static since it returns the static attribute 'instance'. 
	public static Superman getInstance() {
		return instance;
	}

	// ///////////////////////////////////////////////////

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Superman is flying at speed " + speed;
	}

}
