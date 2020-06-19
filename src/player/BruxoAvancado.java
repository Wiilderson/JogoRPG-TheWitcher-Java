package player;

import equipamento.Colar;
import equipamento.Equipamento;
import magias.Spells;


public class BruxoAvancado extends Bruxo {
	
	public BruxoAvancado(String nome, String sexo,
						  int ataque, int defesa,
						  Equipamento equipamentoMaoEsquerda, Equipamento equipamentoMaoDireita, int energia, Colar colar, Spells magias) {

	super(nome, sexo, ataque, defesa, equipamentoMaoEsquerda, equipamentoMaoDireita, energia, colar, magias);
	
	}
}