package api;

public interface ABBTDA {
    public int Raiz();
    public ABBTDA HijoIzq();
    public ABBTDA HijoDer();
    public boolean ArbolVacio();
    public void InicializarArbol();
    public void AgregarElem(int x);
    public void EliminarElem(int x);

}
