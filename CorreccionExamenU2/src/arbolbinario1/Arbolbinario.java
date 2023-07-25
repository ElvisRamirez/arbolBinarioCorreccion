package arbolbinario1;
public class Arbolbinario {
	protected Nodo raiz;

	public Arbolbinario()
	{
		raiz = null;
	}

	public Arbolbinario(Nodo raiz)
	{
		this.raiz = raiz;
	}

	public Nodo raizArbol()
	{
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio()
	{
		return raiz == null;
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
///////////////
public void insertar( Object dato) {
if (raiz == null) {
  raiz = new Nodo(dato);
} else {
  insertarRecursion(raiz, dato);
}
}
////
private void insertarRecursion(Nodo nodoActual, Object dato) {

Comparable<Object> datoComparable = (Comparable<Object>) dato;
if (datoComparable.compareTo(nodoActual.dato) < 0) {
	if (nodoActual.izdo == null) {
		nodoActual.izdo = new Nodo(dato);
	} else {
		insertarRecursion(nodoActual.izdo, dato);
	}
} else {
	if (nodoActual.dcho == null) {
		nodoActual.dcho = new Nodo(dato);
	} else {
		insertarRecursion(nodoActual.dcho, dato);
	}
}
}
//METODOS DE RECORRIDO
	//PREORDEN
	public  void preorden(Nodo raiz){
		if (raiz != null){
			raiz.visitar();
			preorden (raiz.subarbolIzdo());
			preorden (raiz.subarbolDcho());
		}
	}

	//INORDEN
	public  void inorden(Nodo raiz){
		if (raiz != null){
			inorden (raiz.subarbolIzdo());
			raiz.visitar();
			inorden (raiz.subarbolDcho());
		}
	}

	//POSTORDEN
	public void postorden(Nodo raiz){
		if (raiz != null){
			postorden (raiz.subarbolIzdo());
			postorden (raiz.subarbolDcho());
			raiz.visitar();
		}
	}
	
	 public int NumeroDeNodos() {
	        return contarNodos(raiz);
	    }

	    private int contarNodos(Nodo nodo) {
	        if (nodo == null) {
	            return 0;
	        }

	        if (nodo.izdo == null && nodo.dcho == null) {
	            return 1; // El nodo actual es una hoja
	        }

	        int NodoIzquierdo = contarNodos(nodo.izdo);
	        int NodoDerecho = contarNodos(nodo.dcho);

	        return NodoIzquierdo + NodoDerecho;
	    }
	    
	    public int sumarElementos() {
	        return sumarElementosRecursion(raiz);
	    }

	    private int sumarElementosRecursion(Nodo nodo) {
	        if (nodo == null) {
	            return 0;
	        }

	        int suma = (int) nodo.dato;
	        suma += sumarElementosRecursion(nodo.izdo);
	        suma += sumarElementosRecursion(nodo.dcho);

	        return suma;
	    }

		
}


