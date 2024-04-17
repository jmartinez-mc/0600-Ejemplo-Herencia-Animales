package es.maestredam.zoo;

public class Mamifero extends Animal {
	private final static int MESES_LACTANCIA_DEF = 4;
	
	// Atributos: 
	// - Heredados: indentificador y adulto
	// - Propios:
	private int mesesLactancia;

	// Constructor -> se ejcuta cuando hago new Mamifero
	public Mamifero(String id) {		
		this(id, MESES_LACTANCIA_DEF);
	}
	
	public Mamifero(String id, int mesesLactancia) {
		// -> se ejecuta implicitamente super(); 

		// Ahora llamo al constructor de la clase
		// padre que yo quiero, explictamente con super a
		super (id);          //      Animal(String)
		// super (id, true); // -o-  Animal(String,boolean)
				
		this.mesesLactancia =  mesesLactancia;

		// TRAZA:
		System.out.println("Ejecutado Constructor Mamifero(String,int)");
	} 
	
	// Métodos:
	// Heredados: crecer, comer, reproducirse y respirar y getters/setters
	
	// Propios:
	public void mamar() {
		System.out.println("  * Mamando...");		
	}

	public int getMesesLactancia() {
		return mesesLactancia;
	}	
}
