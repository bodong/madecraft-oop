package exercises;

public class Ocean {
	public static void main(String[] args) {
		SeaCreature spongBob = new SeaCreature("Spongebob");
		spongBob.eat();
		spongBob.laugh();
		
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.laugh();
		
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(squidward.getName());
		squidward.laugh();
	}
}
