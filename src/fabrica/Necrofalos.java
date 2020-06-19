package fabrica;

import java.util.ArrayList;
import java.util.Random;

import monstros.Monstro;
import monstros.necrofalo.Ghoul;
import monstros.necrofalo.Necroso;
import monstros.necrofalo.Nevoloso;

public class Necrofalos extends FabGeralMonstros {
	public Monstro getCriatura(FabricaMonstros classe) {
		switch(classe) {
		case Ghouls:
			return new Ghoul("Necrofalo", "Ghoul", "Cemiterios", 10, 10, 100);
			
		case Necrosos:
			return new Necroso("Necrofalo", "Necroso", "Cemiterios", 10, 10, 100);
			
		case Nevolosos:
			return new Nevoloso("Necrofalo", "Nevoloso", "Cemiterios", 10, 10, 100);
		default:
			break;
		}
		return null;
	}

	@Override
	public Monstro getRandomCriaura() {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		ArrayList<FabricaMonstros> lista = new ArrayList<FabricaMonstros>();
		lista.add(FabricaMonstros.Ghouls);
		lista.add(FabricaMonstros.Necrosos);
		lista.add(FabricaMonstros.Nevolosos);
		FabricaMonstros monstroAleatorio = lista.get(aleatorio.nextInt(lista.size()));
		return getCriatura(monstroAleatorio);
	}
}	
