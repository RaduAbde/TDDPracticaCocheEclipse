
public class Coche {

	public int velocidad;

	public void acelerarRadwane(int aceleracion) {
		velocidad += aceleracion;
		
	}

	public void decelerarRadwane(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad < 0) velocidad = 0;
	}


}
