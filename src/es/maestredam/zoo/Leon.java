package es.maestredam.zoo;

public class Leon extends Mamifero {
	
	// NO tiene atributos propios, 
	// solo los heredados de Leon
	// que a su vez tiene los heredados de Animal.
	
    public Leon(String id)  {		
		super(id);
		// TRAZA:
		System.out.println("Ejecutado Constructor Leon (String)");
	}
	
	// Método propio
	public void rugir() {
		System.out.println("  * Rugiendo");
	}
	
	// Método SOBRESCRITO (no lo hereda)
	public void reproducirse() {
		System.out.println("  * Reproduciendose...");
	}
	
	// Método SOBRECARGADO: 
	// Una nueva versión de crecer que ofrece la clase Leon
	// pero SÍ hereda crecer()
	public void crecer(int cm) {
		System.out.printf("  * Creciendo %d cm%n", cm);
	}
}
