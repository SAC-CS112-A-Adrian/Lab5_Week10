import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Automobile auto1 = new Automobile();
		Automobile auto2 = new Automobile();
		Automobile auto3 = new Automobile();

		
		auto1.SetColor("yellow");
		auto1.SetNumberOfCylinders(4);
		auto1.SetNumberOfDoors(4);
		auto1.SetName("Cabbie");
		auto1.SetTransmission(4);
		auto1.About();
		String about1 = auto1.About();
		
		System.out.printf("%s\n\n", about1);
		
		auto2.SetColor("red");
		auto2.SetNumberOfCylinders(6);
		auto2.SetNumberOfDoors(2);
		auto2.SetName("Sporty");
		auto2.SetTransmission(6);
		auto2.About();
		String about2 = auto2.About();
		
		System.out.printf("%s\n\n", about2);
		
		auto3.SetColor("green");
		auto3.SetNumberOfCylinders(6);
		auto3.SetNumberOfDoors(5);
		auto3.SetName("Vany");
		auto3.SetTransmission(4);
		String about3 = auto3.About();
		
		System.out.printf("%s", about3);

	}

}