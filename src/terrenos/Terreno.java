package terrenos;

public abstract class Terreno {

	private String terreno;

	public Terreno(String terreno) {

		this.terreno = terreno;

	}

	public String getTerreno() {
		return terreno;
	}

	public String infoTerreno() {
		String aux = "Terreno: " + terreno;

		return aux;
	}

}
