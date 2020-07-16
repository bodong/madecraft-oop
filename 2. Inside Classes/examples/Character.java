package examples;

public class Character {

	private String name;
	private String species;

	public Character(String name, String species) {
		this.name = name;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	Character bilbo = new Character("Bilbo", "Hobbit");
	Character legolas = new Character("Legolas", "Elf");

}
