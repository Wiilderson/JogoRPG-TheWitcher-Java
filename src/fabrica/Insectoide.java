package fabrica;

import java.util.ArrayList;
import java.util.Random;

import monstros.Monstro;
import monstros.insectoide.Aracno;
import monstros.insectoide.Harrisi;
import monstros.insectoide.Kikimora;

public class Insectoide extends FabGeralMonstros {
	public Monstro getCriatura(FabricaMonstros classe) {
		switch(classe) {
		case Aracnos:
			return new Aracno("Insectoide", "Aracno", "Floresta", 10, 10, 100);
		
		case Harrisi:
			return new Harrisi("Insectoide", "Harrisi", "Floresta", 10, 10, 100);
		
		case Kikimora:
			return new Kikimora("Insectoide", "Kikimora", "Montanhas", 10, 10, 100);
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
		lista.add(FabricaMonstros.Aracnos);
		lista.add(FabricaMonstros.Harrisi);
		lista.add(FabricaMonstros.Kikimora);
		FabricaMonstros monstroAleatorio = lista.get(aleatorio.nextInt(lista.size()));
		
		return getCriatura(monstroAleatorio);
	}
}
