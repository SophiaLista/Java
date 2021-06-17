package ejercicio1.practica;

/*
 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche (marca, modelo, patente, kilometros). 
 * El programa pide por teclado los datos de los coches y los guarda en el array. 
 * A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:

Todos los coches introducidos.
Todos los coches de una marca determinada.
Todos los coches ordenados por número de kilómetros de menor a mayor.
Todos los coches ordenados por marca.
 */
public class Coche implements Comparable<Coche>{
	private String marca,modelo;
	private int patente;
	private float kilometros;
	
	public Coche(String marca, String modelo, int patente, float kilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometros = kilometros;
	}
	
		
	public Coche(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", kilometros=" + kilometros
				+ "]";
	}
	
	
	public int compareTo(Coche coche) {
		return this.getMarca().compareTo(coche.marca);
	}

}
