package es.maestredam.zoo;

public class Pez extends Animal {
	// Atributos: 
	// - Heredados: indentificador y adulto
	// - Propios:
	private int numAletas;
	
	public Pez(String id) {
		super(id);
		numAletas = 5;
		
		System.out.println("Ejecutado Constructor Pez (String)");
	}
	
	public int getNumAletas() {
		return numAletas;
	}

	// Método propio:
	public void nadar() {
		System.out.println("  * Nadando...");		
	}
	
	// Método SOBRESCRITO: no se desea el heredado porque es 
	// "genéral" (respirar por pulmones) y los peces respiran 
	// por branquias.
	@Override
	public void respirar() {		
		System.out.println("  * Respirando por branquias...");
	}
	
}
