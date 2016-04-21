
public class Automobile {

	private int doors;
	private int cyl;
	private int trans;
	private String color;
	private String name;
	private String about;

	public void SetNumberOfDoors(int d) {
		doors = d;

	}

	public void SetNumberOfCylinders(int c) {
		cyl = c;

	}

	public void SetTransmission(int d) {
		trans = d;

	}

	public void SetColor(String s) {
		color = s;

	}

	public void SetName(String n) {
		name = n;

	}

	public String About() {
		String description = "Doors: " + doors + "\nCylinders: " + cyl + "\nTransmission: " + trans + "\nColor: "
				+ color + "\nName: " + name;
		return description;
	}

}
