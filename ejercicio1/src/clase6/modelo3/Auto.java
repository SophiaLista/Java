package clase6.modelo3;

public class Auto extends Vehiculo{

	public Auto() {
		super(5);
	}

	
	public float consumoCombustible(float kilometros) {
		float consumo=0.1f;
		consumo+=(kilometros*this.pesoPasajero()*0.002);
		return consumo;
	}

}
