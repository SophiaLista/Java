package ejercicio1.practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche (marca, modelo, patente, kilometros). 
 * El programa pide por teclado los datos de los coches y los guarda en el array.
 *  A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:

Todos los coches introducidos.
Todos los coches de una marca determinada.
Todos los coches ordenados por número de kilómetros de menor a mayor.
Todos los coches ordenados por marca.
 */
public class Test {

	public static void main(String[] args) {
		ArrayList <Coche> coches = new ArrayList<Coche>();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa la marca del coche:");
		String marca = teclado.next();
		while(!marca.equals("fin")) {
			
			System.out.print("Ingresa el modelo del coche:");
			String modelo = teclado.next();
			
			System.out.print("Ingresa la patente del coche:");
			int patente= teclado.nextInt();
			
			System.out.print("Ingresa los kilometros del coche:");
			float kilometros = teclado.nextFloat();
			
			Coche coche = new Coche(marca,modelo,patente,kilometros);
			
			coches.add(coche);
			
			System.out.print("Ingresa la marca del coche:");
			marca = teclado.next();
			
		}
		
		System.out.println("Mostrar ArrayList cargado:");
		for (Coche coche : coches) {
			System.out.println(coche);
		}
		

		System.out.print("Marca que desea mostrar:");
		String nombreMarca = teclado.next();
					
		System.out.println("Mostrar segun la marca:");
		for (Coche coche : coches) {
			if(coche.getMarca().equals(nombreMarca)) {
				System.out.println(coche);
			}
		}
		
		Collections.sort(coches);
		System.out.println("Ordenados por marca");
		for (Coche coche : coches) {
			System.out.println(coche);
		}
		
		Collections.sort(coches,new CompararPorKilometros());
		System.out.println("Ordenados por kilometros");
		for (Coche coche : coches) {
			System.out.println(coche);
		}
		
	}

}
