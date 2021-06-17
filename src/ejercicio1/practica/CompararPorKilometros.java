package ejercicio1.practica;

import java.util.Comparator;

public class CompararPorKilometros implements Comparator<Coche>{
	
	public int compare(Coche o1, Coche o2) {
		if(o1.getKilometros() == o2.getKilometros()) {
			return 0;
		}
		if(o1.getKilometros()<o2.getKilometros()) {
			return -1;
		}
		return 1;
	}
}
