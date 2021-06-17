package clase6.modelo3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		/*
		Camion c1 = new Camion(1000);
		c1.setCargaActual(200);
		float consumoCamion=c1.consumoCombustible(200);
		System.out.println(consumoCamion);
		*/
		
		Random rnd = new Random();
		Camion c1= new Camion(1000);
		c1.setCargaActual(rnd.nextFloat()*1000);
		
		Pasajero a = new Pasajero(rnd.nextFloat()*150+50);
		c1.SubirPasajero(a);
		
		float kilometros=rnd.nextFloat()*1000+100;
		float consumo = c1.consumoCombustible(kilometros);
		System.out.println(kilometros);
		System.out.println(consumo);

	}

}
