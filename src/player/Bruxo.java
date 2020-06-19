package player;

import equipamento.Colar;
import equipamento.Equipamento;
import magias.Spells;

public class Bruxo {

	private String nome;
	private String sexo;

	private int ataque;
	private int defesa;

	private float energia;

	// EQUIPAMENTOS
	private Equipamento equipamentoMaoEsquerda;
	private Equipamento equipamentoMaoDireita;
	private Colar colar;
	private Spells magias;

	public Bruxo(String nome, String sexo, int forca, int defesa, Equipamento equipamentoMaoEsquerda,
			Equipamento equipamentoMaoDireita, int energia, Colar colar, Spells magias) {
		this.nome = nome;
		this.sexo = sexo;
		this.ataque = forca;
		this.defesa = defesa;
		this.equipamentoMaoEsquerda = equipamentoMaoEsquerda;
		this.equipamentoMaoDireita = equipamentoMaoDireita;
		this.energia = energia;
		this.colar = colar;
		this.magias = magias;
	}

	public Spells getMagias() {
		return magias;
	}

	public void setMagias(Spells magias) {
		this.magias = magias;
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

	public Equipamento getEquipamentoMaoEsquerda() {
		return equipamentoMaoEsquerda;
	}

	public void setEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda) {
		this.equipamentoMaoEsquerda = equipamentoMaoEsquerda;
	}

	public Equipamento getEquipamentoMaoDireita() {
		return equipamentoMaoDireita;
	}

	public void setEquipamentoMaoDireita(Equipamento equipamentoMaoDireita) {
		this.equipamentoMaoDireita = equipamentoMaoDireita;
	}

	public Colar getColar() {
		return colar;
	}

	public void setColar(Colar colar) {
		this.colar = colar;
	}

	// PEGANDO O NOME DO PLAYER
	public String getNome() {
		return nome;
	}

	// JOGANDO AS INFORMAÇÕES DO PLAYER
	public String inforBruxo() {

		if (equipamentoMaoEsquerda == null) {
			return " Nome:" + nome + "|" + " Sexo:" + sexo + "|" + " Ataque:" + ataque + "|" + " Defesa:" + defesa + "|"
					+ "\nEquipamento Mão Direita:" + equipamentoMaoDireita.infoEquipamento()
					+ "\nEquipamento Mão Esquerda:" + equipamentoMaoEsquerda.infoEquipamento() + "\nEnergia: " + energia
					+ "\nColar:" + colar.infoColar() + "\nSpells: " + magias.infoSpells();
		} else {

			return " Nome:" + nome + "|" + " Sexo:" + sexo + "|" + " Ataque:" + ataque + "|" + " Defesa:" + defesa + "|"
					+ "\nEquipamento Mão Esquerda:" + equipamentoMaoEsquerda.infoEquipamento()
					+ "\nEquipamento Mão Direita: " + equipamentoMaoDireita.infoEquipamento() + "\nEnergia: " + energia
					+ "\nColar:" + colar.infoColar() + "\nSpells: " + magias.infoSpells();
		}
	}


	//Ataques e Defesas
	public int Attack() {

		// logica de atacar
		int dano;

		dano = (int) (getAtaque() * Math.random());

		return dano;

	}

	public float Vida() {

		return getEnergia();

	}



	public float Defesa(float dano) {
		// TODO Auto-generated method stub
		float aux = defesa * (float) Math.random();
		if (dano > aux) {

			setEnergia((getEnergia() - (dano - aux)));
		}
		return aux;
	}
	
	//SPELLS
	public float magiaLux() {
		
		System.out.println("- Spell Lux -");
		System.out.println("Atacou com toda sua força");
		return getAtaque();

	}

	public float magiaIgnis() {
		
		setAtaque((int) (getAtaque() + 15));
		System.out.println("- Spell Ignis -");
		System.out.println("Defesa da criatura reduzida");
		return ataque;
		
	}
	
	public float magiaPrae() {
		float aux = getDefesa();
		System.out.println("- Spell Praesidium -");
		System.out.println("Você recebeu uma energia protetora ");
		setDefesa((int) (getDefesa() + aux));
		return aux;
		
		
	}
	
	//COLARES
	public void colarhealth() {
		if (getEnergia() < 95) {
			setEnergia(getEnergia() + 10);
			if (getEnergia() > 100) {
				setEnergia(100);
			}

			System.out.println("- Colar Regeneração -");
			System.out.println("10% da vida recuperada");
		} else {
			System.out.println("Energia não é menor que 95%");
		}

	}

	public void colarprotection() {
		setDefesa(getDefesa() + 15);
		System.out.println("- Colar Proteção -");
		System.out.println("Você recebeu um bônus de defesa");

	}

	public void colarpower() {
		System.out.println("- Colar do Poder -");
		System.out.println("Você recebeu um bônus de ataque");
		setAtaque(getAtaque() + 10);

	}

}
