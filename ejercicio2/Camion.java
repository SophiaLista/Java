package clase6.modelo3;

public class Camion extends Vehiculo{
	private final float CargaMaxima;
	private float cargaActual;
	
	public Camion(float cargaMaxima) {
		super(1);
		this.CargaMaxima=cargaMaxima;
	}

	public float getCargaMaxima() {
		return CargaMaxima;
	}

	
	public float getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(float carga) {
		if(carga>=0 && carga<=this.CargaMaxima)
			this.cargaActual = carga;
		else
			System.err.println("No se puede llevar la carga");
	}

	
	public float consumoCombustible(float kilometros) {
		float consumo=0.5f; //Arranque
		consumo+=(kilometros*this.cargaActual*0.1);
		consumo+=(kilometros*this.pesoPasajero()*0.01);
		return consumo;
	}
	
	
}
