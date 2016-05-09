package singletonExample;

public class SupermanTest {

	public static void main(String[] args) {

		//In order to access the instance of the singleton, all clients must use the Superman.getInstance() of singleton. All clients
		//acquire the same instance and it is mutual to all of them.
		Superman superman = Superman.getInstance();
		superman.setSpeed(1000);
		System.out.println(superman);
		superman.setSpeed(50);
		System.out.println(superman);

	}
}
