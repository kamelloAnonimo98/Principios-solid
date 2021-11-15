package main;
/**I: Principio de segregación de interfaz
Este principio establece que los clientes no deberían verse forzados a depender de interfaces que no usan.

Dicho de otra manera, cuando un cliente depende de una clase que implementa una interfaz cuya funcionalidad este cliente no usa, pero que otros clientes sí usan, este cliente estará siendo afectado por los cambios que fuercen otros clientes en dicha interfaz.*/
public class Triangulo implements IFigura {
	
	private float base;
	private float altura;
	
	public Triangulo (float base, float altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float area() {
		return (getBase() * getAltura() ) / 2;
	}
	
	
}
