package n1exercici1;
 
public class InstrumentoDeViento extends Instrumento {

	public InstrumentoDeViento(String instrumento, int precio) {
		super(instrumento, precio);
	}
	
	static {
		
		System.out.println("Se preparan los instrumentos de viento");
	}
	{
		System.out.println("Tocan los instrumentos de viento");
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de viento: " + super.getInstrumento());
	}
}
