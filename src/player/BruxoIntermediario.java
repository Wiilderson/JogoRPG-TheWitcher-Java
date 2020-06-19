package player;

import equipamento.Equipamento;
import magias.Spells;
import equipamento.Colar;

public class BruxoIntermediario extends Bruxo {
	
	public BruxoIntermediario(String nome, String sexo,
						  	  int ataque, int defesa,
						  	  Equipamento equipamentoMaoEsquerda, Equipamento equipamentoMaoDireita, int energia, Colar colar, Spells magias) {

	super(nome, sexo, ataque, defesa, equipamentoMaoEsquerda, equipamentoMaoDireita, energia, colar, magias);
	
	}
}