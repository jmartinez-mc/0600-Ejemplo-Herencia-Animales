package es.maestredam.zoo;

/**
 * Aplicación que crea objetos e invoca a sus métodos.
 * 
 * @author josema
 * @version 1.1
 */
public class ZooApp {

	public static void main(String[] args) {
		Animal animal1 = new Animal("A002");
		System.out.println("Un animal");
		animal1.comer();
		animal1.crecer();
		animal1.respirar();
		if (!animal1.isAdulto()) {
			animal1.setAdulto(true);
			animal1.reproducirse();
		}
		
		System.out.println("---------");
		
		Mamifero unMamifero = new Mamifero("M001");
		unMamifero.setAdulto(true);
		
		System.out.println("Un mamífero");
		// Un objeto Mamifero puede hacer todo lo que 
		// puede hacer un Animal y además mamar
		unMamifero.comer();
		unMamifero.crecer();
		unMamifero.respirar();
		unMamifero.mamar();
		System.out.printf("    durante %d meses.%n", 
				unMamifero.getMesesLactancia());
		
		System.out.println("---------");
		
		Leon leoncio = new Leon("Leoncio");		
		System.out.println("Un leon llamado Leoncio");
		leoncio.comer();
		leoncio.crecer();
		leoncio.crecer(30);
		leoncio.respirar(); 
		leoncio.mamar(); 

		System.out.println("---------");
		
		Pez nemo = new Pez("Nemo");
		System.out.println("Un pez llamado Nemo");
		nemo.comer();
		nemo.crecer();
		nemo.respirar(); 
		//nemo.mamar(); No tiene ese método
	}

}
