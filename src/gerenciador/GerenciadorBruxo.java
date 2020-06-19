package gerenciador;

import java.util.Scanner;

import equipamento.*;
import magias.Ignis;
import magias.Lux;
import builder.*;
import player.Bruxo;

public class GerenciadorBruxo {

	private BruxoInterface criador;
	private Scanner scan;

	public void BruxoInterface(BruxoInterface criador) {
		this.criador = criador;
	}

	public void escolhaPersonagem() {

		scan = new Scanner(System.in);

		System.out.println("Qual classe de Bruxo você deseja ser? " + "\n 1: Bruxo Iniciante"
				+ "\n 2: Bruxo Intermediário" + "\n 3: Bruxo Avançado");

		int classe = scan.nextInt();

		switch (classe) {

		case 1:
			BruxoInterface(new BruxoIniciante_Builder());
			getBruxoIniciante();
			break;

		case 2:
			BruxoInterface(new BruxoIntermediario_Builder());
			getBruxoIntermediario();
			break;

		case 3:
			BruxoInterface(new BruxoAvancado_Builder());
			getBruxoAvancado();
			break;
		}
	}

	private void getBruxoIniciante() {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);

		System.out.println("Informe o nome do Bruxo: ");
		criador.setNome(scan.next());

		System.out.println("Inform o sexo do Bruxo: " + "\nM - Masculino" + "\nF - Feminino");
		criador.setSexo(scan.next());

		criador.setEquipamentoMaoEsquerda(new Espada(20, 10));
		criador.setEquipamentoMaoDireita(new Equipamento(0, 0, " Vazio"));
		criador.setEnergia(100);
		criador.SetColar(new Colar("Regeneração"));
		criador.setMagias(new Ignis("No"));

	}

	private void getBruxoIntermediario() {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);

		System.out.println("Informe o nome do Bruxo: ");
		criador.setNome(scan.next());

		System.out.println("Inform o sexo do Bruxo: " + "\nM - Masculino" + "\nF - Feminino");
		criador.setSexo(scan.next());

		criador.setEquipamentoMaoEsquerda(new Espada(20, 10));
		criador.setEquipamentoMaoDireita(new Espada(20, 10));
		criador.setEnergia(100);
		criador.SetColar(new Colar("Proteção"));
		criador.setMagias(new Ignis("Ignis"));
	}

	private void getBruxoAvancado() {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);

		System.out.println("Informe o nome do Bruxo: ");
		criador.setNome(scan.next());

		System.out.println("Inform o sexo do Bruxo: " + "\nM - Masculino" + "\nF - Feminino");
		criador.setSexo(scan.next());

		criador.setEquipamentoMaoEsquerda(new Espada(20, 10));
		criador.setEquipamentoMaoDireita(new Escudo(10, 25));
		criador.setEnergia(100);
		criador.SetColar(new Colar("Poder"));
		criador.setMagias(new Lux("Lux"));
	}

	public Bruxo getBruxo() {
		return criador.getBruxo();
	}

}
