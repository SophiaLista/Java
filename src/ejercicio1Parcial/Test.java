package ejercicio1Parcial;

public class Test {

	public static void main(String[] args) {
		Persona p1 = new Persona("Sophia");
		Cuenta c1 = new Cuenta(p1);
		
		c1.ingresar(100);
		c1.mostrar();
		c1.retirar(150);
		c1.mostrar();

	}

}
