package examples;

public class Taco {

	private String filling;
	private String tortilla;

	public void setFilling(String filling) {
		this.filling = filling;
	}

	public String getFilling() {
		return this.filling;
	}

	public String getTortilla() {
		return tortilla;
	}

	public void setTortilla(String tortilla) {
		this.tortilla = tortilla;
	}

	public static void main(String[] args) {

		Taco taco = new Taco();
		taco.setFilling("carne asada");
		System.out.println(taco.getFilling());

	}

}
