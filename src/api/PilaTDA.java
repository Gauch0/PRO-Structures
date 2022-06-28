package api;

public interface PilaTDA {
    public void inicializarPila(); // sin precondiciones - costo constante
    public void Apilar(int x); // pila inicializada - costo constante
    public void Desapilar(); // pila inicializada - costo constante
    public boolean PilaVacia(); // pila inicializada y no vacia- costo constante
    public int Tope(); // pila inicializada- costo constante
}
