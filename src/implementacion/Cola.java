package implementacion;

import api.ColaTDA;

public class Cola implements ColaTDA{
    int [] vector;
    int indice;
    @Override
    public void InicializarCola() {
        vector = new int[100];
        indice = 0;
    }

    @Override
    public void Acolar(int x) {
        vector[indice] = x;
        indice++;
    }
    @Override
    public void Desacolar() {
        for (int i = 0 ; i < indice-1 ; i ++){
            vector[i] = vector[i+1];
        }
        indice--;
    }

    @Override
    public boolean ColaVacia() {
        return (indice == 0);
    }

    @Override
    public int Primero() {
        return vector[0];
    }
}
