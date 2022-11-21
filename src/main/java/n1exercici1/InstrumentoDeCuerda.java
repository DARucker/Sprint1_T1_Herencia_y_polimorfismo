package n1exercici1;
 
public class InstrumentoDeCuerda extends Instrumento {

	public InstrumentoDeCuerda(String instrumento, int precio) {
		super(instrumento, precio);
	}
	
	static {
		
		System.out.println("Se preparan los instrumentos de cuerdas");
	}
	{
		System.out.println("Tocan los instrumentos de cuerdas");
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda: " + super.getInstrumento());
	}

}
