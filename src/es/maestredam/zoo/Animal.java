package es.maestredam.zoo;

/**
 * Clase que permite crear objetos y además sirve como superclase
 * para cualquier clase que represente un animal.
 * 
 * @author josema
 * @version 0.9 
 */
public class Animal {
	
	protected String identificador;
	protected boolean adulto;
	
	// Constructor
	/*
	public Animal() {
		this.identificador = "0000";
		this.adulto = false;	
	}
	*/
	public Animal(String id) {
		// La 1ª LINEA tiene o super o this 
		this(id, false);
	}
	
	public Animal(String id, boolean adulto) {		
		this.identificador = id;
		this.adulto = adulto;
		// TRAZA:
		System.out.println("Ejecutado Constructor Animal(String,boolean)");
	}
	
	// Getters / Setters
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public boolean isAdulto() {
		return adulto;
	}

	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}

	// Operaciones
	public void respirar() {
		System.out.println("  Respirando...");		
	}
	public void crecer() {
		if (!adulto) {
			System.out.println("  Creciendo...");
		}
	}
	public void comer() {
		System.out.println("  Comiendo...");
	}
	public void reproducirse() {
		if (adulto) {
			System.out.println("  Reproduciendose...");
		}
	}
}
