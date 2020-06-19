package builder;

import equipamento.Colar;
import equipamento.Equipamento;
import magias.Spells;
import player.Bruxo;
import player.BruxoIntermediario;

public class BruxoIntermediario_Builder implements BruxoInterface  {

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
			
			if(sexo.equalsIgnoreCase("M")) {
				this.sexo = "Masculino";
			} else
					if(sexo.equalsIgnoreCase("F")) {
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
		
//		public void setColar(Colar colar) {
//			this.colar = colar;
//		}
		
		public void setEnergia(int energia) {
			this.energia = energia;
		}
		
		public Bruxo getBruxo() {
			ataque = equipamentoMaoEsquerda.getAtaque() + equipamentoMaoDireita.getAtaque();
			defesa = equipamentoMaoEsquerda.getDefesa() + equipamentoMaoDireita.getDefesa();
			
			return new BruxoIntermediario(nome, sexo, ataque, defesa,
					   				  equipamentoMaoEsquerda, equipamentoMaoDireita, energia, colar, magias);
		}

		@Override
		public void SetColar(Colar colar) {
			// TODO Auto-generated method stub
			this.colar = colar;
			
		}

		@Override
		public void setMagias(Spells magias) {
			// TODO Auto-generated method stub
			this.magias = magias;
		}

		

		
	

}
