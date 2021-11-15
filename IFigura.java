package main;
/*

I: Principio de segregaci�n de interfaz
Este principio establece que los clientes no deber�an verse forzados a depender de interfaces que no usan.

Dicho de otra manera, cuando un cliente depende de una clase que implementa una interfaz cuya funcionalidad este cliente no usa, pero que otros clientes s� usan, este cliente estar� siendo afectado por los cambios que fuercen otros clientes en dicha interfaz.
**/
public interface IFigura {
	float area();
}
