package equipamento;

public class Equipamento {
	
	protected int ataque;
	protected int defesa;
	protected String tipo;
	
	public Equipamento(int ataqueEquipamento, int defesaEquipamento, String tipoEquipamento) {
		
		this.ataque = ataqueEquipamento;
		this.defesa = defesaEquipamento;
		this.tipo = tipoEquipamento;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public int getDefesa() {
		return defesa;
	}
	
	public String infoEquipamento() {
		String aux = "\nTipo - " + tipo + "|" + "Ataque:" + ataque + "|" + "Defesa:" + defesa;
		
		return aux;
	}

}
