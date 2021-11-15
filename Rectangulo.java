package main;


/**O: Principio abierto/cerrado:
Establece que las entidades software (clases, módulos y funciones) 
deberían estar abiertos para 
su extensión, pero cerrados para su modificación.

*/
public class Rectangulo implements IFigura {
	private float base;
	private float altura;
	
	public Rectangulo(float base, float altura) {
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
	
	
	public String toString() {
		return "Base " + this.getBase() + ", altura " + this.getAltura();
	}
	
	public float area() {
		return this.getBase() * this.getAltura();
	}
	

}
