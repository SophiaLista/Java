package clase6.modelo3;

/*
 * Existen tres tipos de vehiculos: autos, camionetas y colectivos.
 * Los autos tienen una capacidad maxima de 5 pasajeros y los colectivosde 25 pasajeros. 
 * Los camiones tienen una carga maxima tolerada alcrear y su carga actual.En el primer caso, 
 * el consumo de combustible es 5 litros por kilometro 
 * y en el segundo caso 5 litros por kilometro y un extra de 0, 01 litro por cada kilogramo de peso del pasajero.
 * Todos los vehiculos tienen una identificacion, marca y modelo.Crear 3 vehiculos, uno de cada tipo. 
 * La cantidad de pasajeroso carga que lleva cada vehiculo es un numero aleatorio quetiene que estar dentro de los limites enunciadosanteriormente.
 *  Imprimir por consola la cantidad de pasajerosque lleva y su consumo si viaja una cantidad determinada dekilometros.
 */

public abstract class Vehiculo {
	private String ID,marca,modelo;
	protected Pasajero[] pasajeros;
	
	public Vehiculo(int cantPasajeros) {
		this.pasajeros = new Pasajero[cantPasajeros];
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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
	
	public abstract float consumoCombustible(float kilometros);
	
	public float pesoPasajero() {
		float pesoTotal=0;
		for(Pasajero p : this.pasajeros) {
			if(p!= null)
				pesoTotal+=p.getPesoPasajero();
		}
		
		return pesoTotal;
	}
	
	public boolean SubirPasajero(Pasajero pasajero) {
		int indice=0; //SI INDICE MENOR A LENGT Y PASAJERO[INDICE] DISTINTO DE NULL, EL INDICE AUMENTA 
		while(indice < this.pasajeros.length && this.pasajeros[indice]!=null) {
			indice++;
		}//si indice menor que length entonces carga en ese indice que previamente dio null
		if(indice < this.pasajeros.length) {
			this.pasajeros[indice]=pasajero;
			return true;
		}
		return false;
	}
	
}
