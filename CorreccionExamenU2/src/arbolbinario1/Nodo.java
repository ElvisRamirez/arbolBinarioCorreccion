package arbolbinario1;
public class Nodo {
	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;

	public Nodo(Object valor){
		dato = valor;
		izdo = dcho = null;
	}

	public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
		dato= valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}


	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Nodo getIzdo() {
		return izdo;
	}

	public void setIzdo(Nodo izdo) {
		this.izdo = izdo;
	}

	public Nodo getDcho() {
		return dcho;
	}

	public void setDcho(Nodo dcho) {
		this.dcho = dcho;
	}

	// operaciones de acceso 
	public Object valorNodo(){
		return dato; 
	}

	public Nodo subarbolIzdo(){ 
		return izdo; 
	}

	public Nodo subarbolDcho(){ 
		return dcho;
	}

	public void nuevoValor(Object d){ 
		dato = d; 
	}

	public void ramaIzdo(Nodo n){
		izdo = n; 
	}

	public void ramaDcho(Nodo n){ 
		dcho = n; 
	}

	//VISITA
	public void visitar()
	{
		System.out.print(dato + " ");
	}

}


