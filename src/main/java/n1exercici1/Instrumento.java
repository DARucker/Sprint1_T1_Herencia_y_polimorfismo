package n1exercici1;

public abstract class Instrumento {

	private String instrumento;
	private int precio;	
	
	static {
		System.out.println(" ** Comienza a tocar la orquesta **");
	}
	{
		
	}
	
	public Instrumento(String instrumento, int precio) {
		this.instrumento = instrumento;
		this.precio = precio;
	}	
	
	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void tocar();
	
}
