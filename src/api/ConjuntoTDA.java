package api;

public interface ConjuntoTDA { 
	public void InicializarConjunto(); // sin precondiciones - costo constante
	public boolean ConjuntoVacio(); // conjunto inicializado - costo constante
	public void Agregar(int x); // conjunto inicializado - costo lineal
	public int Elegir(); // conjunto inicializado - costo constante
	public void Sacar(int x); // conjunto inicializado - costo lineal
	public boolean Pertenece(int x); // conjunto inicializado - costo lineal
}
