package monstros;

public abstract class Monstro {

	private String classe;
	private String nome;
	private String terreno;
	private int ataque;
	private int defesa;
	private float energia;

	public Monstro(String classe, String nome, String terreno, int ataque, int defesa, int energia) {

		this.classe = classe;
		this.nome = nome;
		this.terreno = terreno;
		this.ataque = ataque;
		this.defesa = defesa;
		this.energia = energia;

	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTerreno() {
		return terreno;
	}

	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public float getEnergia() {
		return energia;
	}

	public float setEnergia(float energia) {
		return this.energia = energia;
	}

	public String inforMonstro() {

		String aux = " Classe:" + classe + "|" + " Nome:" + nome + "|" + " Terreno:" + terreno + "|" + " Ataque:"
				+ ataque + "|" + " Defesa:" + defesa + "|" + " Energia:" + energia + "|";

		return aux;
	}

	public int Attack() {

		int dano;

		// dano = getAtaque() *10/100;
		dano = (int) (getAtaque() * Math.random());

		return dano;

	}

	public float Defesa(float dano) {
		// TODO Auto-generated method stub
		float aux = defesa * (float) Math.random();
		if (dano > aux) {

			setEnergia((getEnergia() - (dano - aux)));
		}
		return aux;
	}

	public float Vida() {

		// logica de atacar

		return getEnergia();

	}

	public void BonusCampos() {

		setDefesa(getDefesa() + 10);

	}

}
