package fabrica;

import java.util.ArrayList;
import java.util.Random;

import monstros.Monstro;
import monstros.construtor.Djinn;
import monstros.construtor.Gargula;
import monstros.construtor.Golen;

public class Construtor extends FabGeralMonstros {

	public Monstro getCriatura(FabricaMonstros classe) {
		switch (classe) {
		case Djinn:
			return new Djinn("Construtor", "Djinn", "Metrópole", 10, 10, 100);

		case Gargulas:
			return new Gargula("Construtor", "Gargula", "Floresta", 10, 10, 100);

		case Golens:
			return new Golen("Construtor", "Golen", "Montanhas", 10, 10, 100);
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
		lista.add(FabricaMonstros.Djinn);
		lista.add(FabricaMonstros.Gargulas);
		lista.add(FabricaMonstros.Golens);
		FabricaMonstros monstroAleatorio = lista.get(aleatorio.nextInt(lista.size()));//lista.size()
	
		return getCriatura(monstroAleatorio);
	}
}