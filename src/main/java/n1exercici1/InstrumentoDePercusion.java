package n1exercici1;
 
public class InstrumentoDePercusion extends Instrumento {

	public InstrumentoDePercusion(String instrumento, int precio) {
		super(instrumento, precio);
	}
	
	static {
		
		System.out.println("Se preparan los instrumentos de percusion");
	}
	{
		System.out.println("Tocan los instrumentos de percusion");
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de percusion: " + super.getInstrumento());
	}
}
