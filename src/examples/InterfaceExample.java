package examples;

public class InterfaceExample implements TrafficLights,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExample I=new InterfaceExample();
		I.printMe();
		I.guest();
		I.redLight();
		
	}
	

	public void printMe() {
		System.out.println("i belong to same class");
	}



	@Override
	public void redLight() {
		// TODO Auto-generated method stub
		System.out.println("1");
		
	}



	@Override
	public void guest() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}



	


}
