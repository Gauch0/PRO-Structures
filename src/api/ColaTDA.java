package api;

public interface ColaTDA {
    public void InicializarCola(); // sin precondiciones - costo constante
    public void Acolar(int x); // cola inicializada - costo lineal
    public void Desacolar(); // cola inicializada y no vacia - costo constante
    public boolean ColaVacia(); // cola inicializada y no vacia - costo constante
    public int Primero(); // cola inicializada - costo constante
}
