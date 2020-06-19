package fabrica;

import terrenos.Campo;
import terrenos.Floresta;
import terrenos.Pantano;
import terrenos.Subterraneo;
import terrenos.Terreno;

public abstract class FabTerrenoTipo {
	
public static  Terreno getTerreno(FabTerreno nome) {
		
		switch(nome) {
		//CONSTRUTORS
		case Pantano:
			return new Pantano("Pantano");
			
		case Floresta:
			return new Floresta("Floresta");
			
		case Subterraneo:
			return new Subterraneo("Subterraneo");
			
		case Campo:
			return new Campo("Campo");
		default:
			break;
		}
		
		return null;
	}


}
