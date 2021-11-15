package inversionDependencias;
 /*D: Principio de inversión de dependencias
Establece que las dependencias deben estar en las abstracciones, no en las concreciones. Es decir:

Los módulos de alto nivel no deberían depender de módulos de bajo nivel. Ambos deberían depender de abstracciones.
Las abstracciones no deberían depender de detalles. Los detalles deberían depender de abstracciones.
**/
public class Teclado {
	
	public void conectar() {
		System.out.println("Conexión Teclado vía USB!");
	}
}
