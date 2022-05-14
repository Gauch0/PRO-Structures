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

    /**
     * @TAREA Copiar contenido de una pila a otra
     * @PARAMETRO pila original
     * @PARAMETRO pila destino
     * @PRECONDICION Ambas pilas iniciadas
     * @POSTCONDICION none
     * @COSTO Lineal
     **/

    public void pasarCola(ColaTDA origen , ColaTDA destino){
        while (!origen.ColaVacia()){
            destino.Acolar(origen.Primero());
            origen.Desacolar();
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

    public void pasarColaPila(ColaTDA origen , PilaTDA destino){
        while (!origen.ColaVacia()){
            destino.Apilar(origen.Primero());
            origen.Desacolar();
        }
    }

    public void pasarPilaCola(PilaTDA origen , ColaTDA destino){
        while (!origen.PilaVacia()){
            destino.Acolar(origen.Tope());
            origen.Desapilar();
        }
    }

    public void invertirColaP(ColaTDA origen){
        PilaTDA aux = new Pila();
        aux.inicializarPila();
        pasarColaPila(origen,aux);
        pasarPilaCola(aux,origen);
    }

    public void invertirCola(ColaTDA origen){
        int aux;
        if(!origen.ColaVacia()){
            aux = origen.Primero();
            origen.Desacolar();
            invertirCola(origen);
            origen.Acolar(aux);
        }
    }

    public boolean colaCoincidencia(ColaTDA origen , ColaTDA destino){
        PilaTDA aux = new Pila();
        PilaTDA aux2 = new Pila();
        aux.inicializarPila();
        aux2.inicializarPila();
        pasarColaPila(origen,aux);
        pasarColaPila(destino,aux2);
        if(aux.Tope() == aux2.Tope()){
            return true;
        }
            return false;
    }

    public boolean colaCapicua(ColaTDA origen){
        ColaTDA aux = new Cola();
        aux.InicializarCola();
        int cant = 0;
        int mitad = 0;
        PilaTDA pila = new Pila();
        pila.inicializarPila();

        while (!origen.ColaVacia()){
            aux.Acolar(origen.Primero());
            cant++;
            origen.Desacolar();
        }

        mitad = cant / 2;

        while (!aux.ColaVacia() && mitad > 0){
            pila.Apilar(aux.Primero());
            aux.Desacolar();
            mitad--;
        }

        while (!pila.PilaVacia() && !aux.ColaVacia()){
            if (pila.Tope() != aux.Primero()) {
                return false;
            }
            pila.Desapilar();
            aux.Desacolar();
        }
        return (pila.PilaVacia() && aux.ColaVacia());
    }

    public void CopiarColaPri(ColaPrioridadTDA origen , ColaPrioridadTDA destino){
        ColaPrioridadTDA aux = new ColaPrioridad();
        aux.InicializarCola();
        while (!origen.ColaVacia()){
            aux.AcolarPrioridad(origen.Primero(),origen.Prioridad());
            origen.Desacolar();
        }
        while (!aux.ColaVacia()){
            destino.AcolarPrioridad(aux.Primero(),aux.Prioridad());
            origen.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }
    }

    public void CombinarColasPrioridad(ColaPrioridadTDA origen , ColaPrioridadTDA destino){
        ColaPrioridadTDA aux = new ColaPrioridad();
        aux.InicializarCola();
        while (!origen.ColaVacia()){
            if(origen.Prioridad() >= destino.Prioridad()) {
                aux.AcolarPrioridad(origen.Primero(),destino.Prioridad());
                origen.Desacolar();
            } else {
                aux.AcolarPrioridad(destino.Primero(),destino.Prioridad());
                destino.Desacolar();
            }
        }

        while (!destino.ColaVacia()){
            aux.AcolarPrioridad(destino.Primero(),destino.Prioridad());
            destino.Desacolar();
        }
    }































}

