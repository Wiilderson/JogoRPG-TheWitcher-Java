package magias;

public class Spells {
	protected Spells tipo;
	protected String magias;

	public Spells(String magias, Spells tipo) {
		this.tipo = tipo;
		this.magias = magias;

	}

	public Spells getTipo() {
		return tipo;
	}

	public void setTipo(Spells tipo) {
		this.tipo = tipo;
	}

	public String getMagias() {
		return magias;
	}

	public void setMagias(String magias) {
		this.magias = magias;
	}

	public String infoSpells() {
		String aux = magias;

		return aux;
	}

}
