package fabrica;

import monstros.Monstro;

public abstract class FabGeralMonstros {

	public static FabGeralMonstros getFabrica(FabricaClasseMonstro tipo) {
		switch (tipo) {
		case Construtor:
			return new Construtor();
		case Necrofalos:
			return new Necrofalos();
		case Insectoide:
			return new Insectoide();
		case Relictio:
			return new Relictio();
		}
		return null;
	}

	public abstract Monstro getCriatura(FabricaMonstros classe);
	
	public abstract Monstro getRandomCriaura();
}
