package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import arenas.batalhas.CampoDeBatalha;

import gerenciador.GerenciadorBruxo;
import monstros.Monstro;
import player.Bruxo;
import terrenos.Terreno;
import fabrica.FabGeralMonstros;
import fabrica.FabTerreno;
import fabrica.FabTerrenoTipo;
import fabrica.FabricaClasseMonstro;

public class Aplicacao {

	void Batalhas() {
		CampoDeBatalha battle = new CampoDeBatalha();

		Bruxo bruxo1 = criandoBruxo();
		// CriandoCriaturas();
		int nivel = 0;
		// int nivelemqueparou;
		while (nivel < 5) {
			List<Terreno> Campos = CamposBatalha();
			List<Monstro> criaturas = CriandoCriaturas();

			// CamposBatalha();
			battle.naBatalha(bruxo1, criaturas, Campos);
			if (bruxo1.getEnergia() > 0)
				nivel++;
			else
				nivel = 6;
		}

		System.out.println("\n         HISTÓRICO");
		System.out.println("\nNV  |   NOME   |   CRIATURAS");
		System.out.println("----------------------------");
		battle.NivelJogo();
		System.out.print(" | ");
		System.out.print(bruxo1.getNome());
		System.out.print(" | ");
		battle.MonstrosMortos();
		System.out.println("");
		

	}

	public static void main(String[] args) {
		Aplicacao aplication = new Aplicacao();
		aplication.Batalhas();

	}

	public Bruxo criandoBruxo() {
		// TODO Auto-generated method stub
		// criando bruxo
		GerenciadorBruxo gerenciador1 = new GerenciadorBruxo();

		gerenciador1.escolhaPersonagem();

		Bruxo bruxo1 = gerenciador1.getBruxo();

		System.out.println(bruxo1.inforBruxo() + "\n");
		System.out.println("Bruxo criado com sucesso!\n");
		return bruxo1;
	}

	public List<Terreno> CamposBatalha() {
		// Fabrica terrenos = factory method
		// CampoDeBatalha battle = new CampoFactory.getCampo("");
		// arraylist, for

		List<Terreno> campo = new ArrayList<Terreno>();

		List<FabTerreno> lista = new ArrayList<FabTerreno>();
		Random aleatorio = new Random();

		// TODO Auto-generated method stub
		lista.add(FabTerreno.Pantano);
		lista.add(FabTerreno.Floresta);
		lista.add(FabTerreno.Subterraneo);
		lista.add(FabTerreno.Campo);

		for (int i = 0; i < 1; i++) {

			FabTerreno tipoDoTerreno = lista.get(aleatorio.nextInt(4));

			Terreno terreAleatorio = FabTerrenoTipo.getTerreno(tipoDoTerreno);

			// System.out.println(terreAleatorio.infoTerreno()+"\n");

			campo.add(terreAleatorio);
		}
		return campo;

	}

	public List<Monstro> CriandoCriaturas() {

		List<Monstro> criaturas = new ArrayList<Monstro>();

		List<FabricaClasseMonstro> lista = new ArrayList<FabricaClasseMonstro>();
		Random aleatorio = new Random();
		// TODO Auto-generated method stub
		lista.add(FabricaClasseMonstro.Construtor);
		lista.add(FabricaClasseMonstro.Necrofalos);
		lista.add(FabricaClasseMonstro.Insectoide);
		lista.add(FabricaClasseMonstro.Relictio);

		for (int i = 0; i <= 24; i++) {
			FabricaClasseMonstro classe = lista.get(aleatorio.nextInt(lista.size()));
			FabGeralMonstros fabrica = FabGeralMonstros.getFabrica(classe);
			Monstro criatura = fabrica.getRandomCriaura();
			System.out.println(criatura.inforMonstro());

			criaturas.add(criatura);

		}
		return criaturas;

	}

}
