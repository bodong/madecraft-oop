package exercises;

public class Smurf {

	private static String name;

	public static Smurf createSmurf(String name) {
		if (getName() != null && getName().equalsIgnoreCase(name)) {
			System.err.println("not allowed to create same name " + name);
			return null;
		}

		System.out.println("Creating " + name + " Smurf");

		return new Smurf(name);
	}

	public static String getName() {
		return name;
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
