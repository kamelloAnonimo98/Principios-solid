package inversionDependencias;
 /**O: Principio abierto/cerrado
Establece que las entidades software (clases, módulos y funciones) 
deberían estar abiertos para su extensión, pero cerrados para su modificación.*/
public class Main {

	public static void main(String[] args) {
		
		Computadora computadora = new Computadora();
		computadora.encender();

	}

}
