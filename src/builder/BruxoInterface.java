package builder;

import equipamento.Colar;
import equipamento.Equipamento;
import magias.Spells;
import player.Bruxo;

public interface BruxoInterface {

	public void setNome(String nome);
	public void setSexo(String sexo);
	public void setEquipamentoMaoEsquerda(Equipamento equipamentoMaoEsquerda);
	public void setEquipamentoMaoDireita(Equipamento equipamentoMaoDireita);
	public void SetColar(Colar colar);
	//void SetColar(String colar);
	public void setEnergia(int energia);
	public void setMagias(Spells magias);
	
	public Bruxo getBruxo();
	
	
	
	
	
}
