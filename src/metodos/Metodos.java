package metodos;

import api.*;
import implementacion.*;
public class Metodos {
    /**
     * @TAREA Pasar contenido de una pila a otra en orden inverso
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICON Ambas pilas iniciadas
     * @POSTCONDICON Se pierde la pila original
     * @COSTO Lineal
     **/

    public void pasarPila(PilaTDA origen , PilaTDA destino) {
        while(!origen.PilaVacia()) {
            destino.Apilar(origen.Tope());
            origen.Desapilar();
        }
    }


    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/

    public void copiarPila(PilaTDA origen , PilaTDA destino){
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        pasarPila(origen,aux);
        while (!aux.PilaVacia()){
            destino.Apilar(aux.Tope());
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }
    }

    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/

    public void invertirPila(PilaTDA origen) {
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        pasarPila(origen, aux);
        copiarPila(aux, origen);
    }

    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/

    public int contarElementosPila(PilaTDA origen) {
        int cant = 0;
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        while(!origen.PilaVacia()) {
            cant++;
            aux.Apilar(origen.Tope());
            origen.Desapilar();
        }
        while(!aux.PilaVacia()) {
            origen.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return cant;
    }

    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/

    public int sumarElementosPila(PilaTDA origen) {
        int sum = 0;
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        Metodos m = new Metodos();
        m.copiarPila(origen, aux);
        while(!aux.PilaVacia()) {
            sum += aux.Tope();
            aux.Desapilar();
        }
        return sum;
    }

    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/
    public int calcularPromedioPila(PilaTDA origen) {
        int promedio = 0;
        int suma = 0;
        int cantidad = 0;
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        Metodos m = new Metodos();
        m.copiarPila(origen, aux);
        while(!aux.PilaVacia()) {
            cantidad++;
            suma = aux.Tope();
            aux.Desapilar();
        }
        promedio = cantidad / suma;
        return promedio;
    }
}

