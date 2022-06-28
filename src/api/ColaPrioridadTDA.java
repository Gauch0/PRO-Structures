package api;

public interface ColaPrioridadTDA {
    public void InicializarCola(); // sin precondiciones - costo constante
    public void AcolarPrioridad(int x , int prioridad); // cola inicializada - costo lineal
    public void Desacolar(); // cola inicializada - costo constante
    public int Primero(); // cola inicializada - costo constante
    public boolean ColaVacia(); // cola inicializada y no vacia - costo constante 
    public int Prioridad(); // cola inicializada - costo constante
}
