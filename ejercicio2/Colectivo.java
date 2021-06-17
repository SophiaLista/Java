package clase6.modelo3;

public class Colectivo extends Vehiculo{

	public Colectivo() {
		super(25);
	}

	
	public float consumoCombustible(float kilometros) {
		float consumo=0.25f;
		consumo+=(kilometros*this.pesoPasajero()*0.005);
		return consumo;
	}
	

}
