/**Se crea una nueva interfaz llamada ITriangulo que incluya únicamente …
…los métodos necesarios para el cliente de Triangulo. Por ejemplo, 
si el cliente solo necesita el cálculo del área del triángulo, 
se define en ITriangulo únicamente el método area().

la clase Triangulo implemente la nueva interfaz ITriangulo en lugar de IFigura.
De esta manera, la clase Triangulo se ajustará a la interfaz específica
que el cliente necesita y evitará depender de funcionalidades no utilizadas. */


public class Triangulo implements ITriangulo {

	private float base;
	private float altura;

	public Triangulo(float base, float altura) {
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
		return (getBase() * getAltura()) / 2;
	}
}
