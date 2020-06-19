package arenas.batalhas;

import java.util.List;

import java.util.Scanner;

import monstros.*;
import player.Bruxo;
import terrenos.Terreno;

public class CampoDeBatalha {

	private static Scanner scan;
	private int criaturamortas;
	private int niveis;

	public void naBatalha(Bruxo bruxo1, List<Monstro> criaturas, List<Terreno> Campos) {
		// TODO Auto-generated method stub

		float ataque;
		int i = 1;
		criaturamortas = 0;
		niveis = 1;

		Terreno terra = Campos.remove(0);

		Monstro criatura1 = criaturas.remove(0);

		while (bruxo1.getEnergia() > 0 && criaturas.size() > 0) {

			System.out.println("\n  Batalha " + i + "\n");

			// pegar terreno e bonus
			BonusTerreno(terra, criatura1);

			while (bruxo1.getEnergia() > 0 && criatura1.getEnergia() > 0) {

				System.out.println("\n====================\n");
				System.out.printf(bruxo1.getNome() + "    | Energia: " + "%.1f", bruxo1.Vida());
				System.out.println("\n        X			");
				System.out.printf(criatura1.getNome() + " | Energia: " + "%.1f", criatura1.Vida());
				System.out.println("\n");

				int atacando = ataqueBruxo();
				switch (atacando) {
				case 1:
					ataque = bruxo1.Attack();
					System.out.println(bruxo1.getNome() + " atacou com: " + ataque + " de dano");
					System.out.printf(criatura1.getNome() + " Defendeu com: " + "%.1f", criatura1.Defesa(ataque));
					System.out.println("");
					break;
				case 2:
					magiaTipos(bruxo1, criatura1);
//					float ataque1 = bruxo1.magiaLux(); 
//					if(bruxo1.getMagias().getMagias() == "Lux") {
//						criatura1.Defesa(ataque1);
//					}else if(bruxo1.getMagias().infoSpells() == "Praesedium" && bruxo1.getMagias().infoSpells() == "Lux") {
//						float ataque2 = bruxo1.magiaIgnis();
//						criatura1.Defesa(ataque2);
//					}else if(bruxo1.getMagias().infoSpells() == "Ignis"){
//						float ataque3 = bruxo1.magiaPrae();
//						criatura1.Defesa(ataque3);
//					}else {
//						System.out.println("Você não possui magia");
//					}
//					

					break;
				case 3:

					colarTipos(bruxo1);

					break;
				default:
					System.out.println("Opcao invalida");
					break;
				}
				if (criatura1.getEnergia() > 0) { // trocar monstro por criatura
					ataque = criatura1.Attack();
					System.out.println("\n" + criatura1.getNome() + " atacou com: " + ataque + " de dano");
					System.out.printf(bruxo1.getNome() + " Defendeu com: " + "%.1f", bruxo1.Defesa(ataque));
					System.out.println("");

					if (bruxo1.getEnergia() <= 0) {
						System.out.println(bruxo1.getNome() + " foi morto por: " + criatura1.getNome());
						System.out.println("\n-------- GAME OVER -------");
					}
				}

			} // WHILE 2

			if (criatura1.getEnergia() <= 0) {
				criaturamortas++;
				criatura1 = criaturas.remove(0);
				// remove as criaturas após derrota
			}

			i++; // contador de batalhas

			if (criaturas.size() > 25) {
				niveis++; // contador de nivel
			}

			if (criatura1.getEnergia() <= 0) {
				Campos.remove(0);
			}

		} // WHILE 1

	}

	public void magiaTipos(Bruxo bruxo1, Monstro criatura1) {
		float dano = bruxo1.magiaLux();
		if (bruxo1.getMagias().infoSpells() == "Ignis") {
			criatura1.Defesa(dano);
		} else if (bruxo1.getMagias().infoSpells() == "Lux") {
			criatura1.Defesa(dano);
		} else {
			System.out.println("Você não possui magia");
		}
	}

	public void colarTipos(Bruxo bruxo1) {
		if (bruxo1.getColar().infoColar() == "Regeneração") {
			bruxo1.colarhealth();
		} else if (bruxo1.getColar().infoColar() == "Proteção") {
			bruxo1.colarprotection();
		} else {
			bruxo1.colarpower();
		}

	}

	public void BonusTerreno(Terreno terra, Monstro criatura1) {

		System.out.println(terra.infoTerreno());

		if (terra.getTerreno() == "Pantano") {
			System.out.println("\nCriaturas que habitam em Pantanos");
			System.out.println("receberão 5% de Defesa ");
			if (criatura1.getTerreno() == "Cemiterios") {
				criatura1.BonusCampos();
			}
		} else if (terra.getTerreno() == "Floresta") {
			System.out.println("\nCriaturas que habitam em Florestas");
			System.out.println("receberão 5% de Defesa ");
			if (criatura1.getTerreno() == "Floresta") {
				criatura1.BonusCampos();
			}

		} else if (terra.getTerreno() == "Subterraneo") {
			System.out.println("\nCriaturas que habitam em Subterrâneos");
			System.out.println("receberão 5% de Defesa ");
			if (criatura1.getTerreno() == "Montanhas") {
				criatura1.BonusCampos();
			}
		} else if (terra.getTerreno() == "Campo") {
			System.out.println("\nCriaturas que habitam em Campos");
			System.out.println("receberão 5% de Defesa ");
			if (criatura1.getTerreno() == "Metrópole") {
				criatura1.BonusCampos();
			}
		}

	}

	public void MonstrosMortos() {
		System.out.print(" " + criaturamortas);

	}

	public void NivelJogo() {
		System.out.print(" " + niveis);

	}

	public int ataqueBruxo() {
		scan = new Scanner(System.in);
		System.out.println("Atacar com:");
		System.out.println("(1) - SWORD ATTACK");
		System.out.println("(2) - SPELLS");
		System.out.println("(3) - COLAR");
		return scan.nextInt();
	}

}
