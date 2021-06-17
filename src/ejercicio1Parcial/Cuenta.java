package ejercicio1Parcial;

/*
 * Crear una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales).
 *  El titular será obligatorio y la cantidad es opcional. Construye los siguientes métodos para la clase:
 *Un constructor, donde los datos pueden estar vacíos.
 *Los setters y getters para cada uno de los atributos. El atributo cantidad no se puede modificar directamente, sólo ingresando o retirando dinero.
 *mostrar(): Muestra los datos de la cuenta.
 *ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
 *retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
 */

public class Cuenta {
	private Persona titular;
	private float cantidad;
	
	public Cuenta(Persona titular) {
		this.titular = titular;
	}
		
	public Cuenta(Persona titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	
	public void mostrar() {
		if(this.cantidad>=0)
			System.out.println("Titular:"+titular.getNombre()+",cuenta:"+this.cantidad);
		else {
			System.err.println("Titular:"+titular.getNombre()+",cuenta:"+this.cantidad);
		}
	}

	public void ingresar(int cantidad) {
		if(cantidad>=0) {
			this.cantidad= this.cantidad+cantidad;
		}
		else {
			System.err.println("No se puede ingresar numeros negativos");
		}
	}
	
	public void retirar(int cantidad) {
		if(cantidad>=0) {
			this.cantidad= this.cantidad - cantidad;
		}
		else {
			System.err.println("No se puede retirar numeros negativos");
		}
	}
	
	
	
	
	
}
