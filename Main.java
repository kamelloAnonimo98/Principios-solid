package inversionDependencias;
 /**O: Principio abierto/cerrado
Establece que las entidades software (clases, m�dulos y funciones) 
deber�an estar abiertos para su extensi�n, pero cerrados para su modificaci�n.*/
public class Main {

	public static void main(String[] args) {
		
		Computadora computadora = new Computadora();
		computadora.encender();

	}

}
