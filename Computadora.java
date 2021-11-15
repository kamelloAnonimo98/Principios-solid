package inversionDependencias;

/**S: Principio de responsabilidad �nica
Como su propio nombre indica, establece que una clase, componente o 
microservicio debe ser responsable de una sola cosa (el tan aclamado 
t�rmino �decoupled� en ingl�s). Si por el contrario, una clase 
tiene varias responsabilidades, esto implica que el cambio en 
una responsabilidad provocar� la modificaci�n en otra responsabilidad.*/

public class Computadora {
	
	private Teclado teclado;
	private Mouse mouse;
	
	public Computadora() {
		this.teclado = new Teclado();
		this.mouse = new Mouse();
	}
	
	
	public void encender() {
		this.teclado.conectar();
		this.mouse.conectar();
	}
}
