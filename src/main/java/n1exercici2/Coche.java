package n1exercici2;

public class Coche {

	private static final String marca = "KIA";
	private static String modelo = "Sportage";
	private final int potencia;
	
	public Coche(int potencia) {
		super();
		this.potencia = potencia;
	}
	
	public static void frenar() {
		
		System.out.println("El vehiculo esta frenando");
	}
	
	public void acelerar() {
		System.out.println("el vehiculo esta acelerando");
	}

}
