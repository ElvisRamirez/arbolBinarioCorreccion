package arbolbinario1; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbolbinario arbol = new Arbolbinario();
	        arbol.insertar(50);
	        arbol.insertar(30);
	        arbol.insertar(70);
	        arbol.insertar(20);
	        arbol.insertar(40);
	        
	        
	     // Calcular la suma de todos los elementos del árbol
	        int sumaTotal = arbol.sumarElementos();
	        System.out.println("Suma total : " + sumaTotal);
	     // Contar las hojas del árbol
	        int NodosElementos = arbol.NumeroDeNodos();
	        System.out.println("Número de nodos: " + NodosElementos);
	        
	        
	        System.out.println("Recorrido en preorden:");
	        arbol.preorden(arbol.raizArbol());

	        System.out.println("\nRecorrido en inorden:");
	        arbol.inorden(arbol.raizArbol());

	        System.out.println("\nRecorrido en postorden:");
	        arbol.postorden(arbol.raizArbol());
	}

}
