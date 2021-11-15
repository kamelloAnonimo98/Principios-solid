package main;
/*
L: Principio de substituci�n de Liskov
Declara que una subclase debe ser sustituible por su superclase, y si al hacer esto, el programa falla, estaremos violando este principio.

Cumpliendo con este principio se confirmar� que nuestro programa tiene una jerarqu�a de clases f�cil de entender y un c�digo reutilizable.

**/
public class Main {

	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(10, 20);
		Triangulo triangulo = new Triangulo(10, 5);
		
		Presentacion presentacion = new Presentacion();
		
		
		presentacion.area(rectangulo);
		presentacion.area(triangulo);
		
	}

}
