package fabrica;

import java.util.ArrayList;
import java.util.Random;

import monstros.Monstro;
import monstros.relictio.Doppler;
import monstros.relictio.Kernun;
import monstros.relictio.Silvano;

public class Relictio extends FabGeralMonstros {
	public Monstro getCriatura(FabricaMonstros classe) {
		switch(classe) {
		case Dopplers:
			return new Doppler("Relictios", "Doppler", "Montanhas", 10, 10, 100);
		
		case Kernun:
			return new Kernun("Relictios", "Kernun", "Montanhas", 10, 10, 100);
			
		case Silvano:
			return new Silvano("Relictios", "Silvano", "Metrópole", 10, 10, 100);
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
		lista.add(FabricaMonstros.Dopplers);
		lista.add(FabricaMonstros.Kernun);
		lista.add(FabricaMonstros.Silvano);
		FabricaMonstros monstroAleatorio = lista.get(aleatorio.nextInt(lista.size()));
		return getCriatura(monstroAleatorio);
	}
	}

