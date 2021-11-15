package main;
/*
L: Principio de substitución de Liskov
Declara que una subclase debe ser sustituible por su superclase, y si al hacer esto, el programa falla, estaremos violando este principio.

Cumpliendo con este principio se confirmará que nuestro programa tiene una jerarquía de clases fácil de entender y un código reutilizable.

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
