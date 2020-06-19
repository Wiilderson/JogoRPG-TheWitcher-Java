package builder;

import equipamento.Colar;
import equipamento.Equipamento;
import magias.Spells;
import player.Bruxo;
import player.BruxoIniciante;

public class BruxoIniciante_Builder implements BruxoInterface {

	private String nome;
	private String sexo;

	private int ataque;
	private int defesa;
	private int energia;

	private Equipamento equipamentoMaoEsquerda;
	private Equipamento equipamentoMaoDireita;

	private Colar colar;
	private Spells magias;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {

		if (sexo.equalsIgnoreCase("M")) {
			this.sexo = "Masculino";
		} else if (sexo.equalsIgnoreCase("F")) {
			this.sexo = "Feminino";
		} else
			this.sexo = "Indefinido";

	}

	public void setEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda) {
		this.equipamentoMaoEsquerda = equipamentoMaoEsquerda;
	}

	public void setEquipamentoMaoDireita(Equipamento equipamentoMaoDireita) {
		this.equipamentoMaoDireita = equipamentoMaoDireita;
	}

	public void SetColar(Colar colar) {
		// TODO Auto-generated method stub
		this.colar = colar;
	}

	@Override
	public void setEnergia(int energia) {
		// TODO Auto-generated method stub
		this.energia = energia;

	}
	
	@Override
	public void setMagias(Spells magias) {
		// TODO Auto-generated method stub
		this.magias = magias;
	}
	
	

	public Bruxo getBruxo() {
		ataque = equipamentoMaoEsquerda.getAtaque() + equipamentoMaoDireita.getAtaque();
		defesa = equipamentoMaoEsquerda.getDefesa() + equipamentoMaoDireita.getDefesa();

		return new BruxoIniciante(nome, sexo, ataque, defesa, equipamentoMaoEsquerda, equipamentoMaoDireita, energia,
				colar, magias);
	}

	

	



}
