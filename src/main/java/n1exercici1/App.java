package n1exercici1;

public class App {

	public static void main(String[] args) {

		Instrumento guitarra = new InstrumentoDeCuerda("guitarra", 100);
		guitarra.tocar();
		Instrumento bajo = new InstrumentoDeCuerda("bajo", 100);
		bajo.tocar();
		
		System.out.println("***");
		
		Instrumento saxo = new InstrumentoDeViento("saxo", 50);
		saxo.tocar();
		Instrumento trompeta = new InstrumentoDeViento("trompeta", 50);
		trompeta.tocar();

		System.out.println("***");
		
		Instrumento tambor = new InstrumentoDePercusion("tambor", 500);
		tambor.tocar();
		Instrumento redoblante = new InstrumentoDePercusion("redoblante", 250);
		redoblante.tocar();

	
	}

}
