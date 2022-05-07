package test;

import metodos.*;
import api.PilaTDA;
import implementacion.Pila;

public class main {
    public static void main(String[] args) {

        EjercicioTP2PA();
        //EjercicioTP2PB();
        //EjercicioTP2PC();
        //EjercicioTP2PD();
        //EjercicioTP2PE();
        //EjercicioTP2PF();

    }


    public static void EjercicioTP2PA() {
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        origen.Apilar(1);
        origen.Apilar(2);
        origen.Apilar(3);
        origen.Apilar(4);
        PilaTDA destino = new Pila();
        destino.inicializarPila();
        Metodos m = new Metodos();
        m.pasarPila(origen, destino);
        System.out.println("- EJERCICIO TP2 A) - PASAR PILA A OTRA DEJANDO EN ORDEN INVERSO");
        while (!destino.PilaVacia()) {
            System.out.println(destino.Tope());
            destino.Desapilar();
        }
        System.out.println();
        System.out.println("-------- Pila Pasada --------");
    }

    public static void EjercicioTP2PB(){
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        origen.Apilar(1);
        origen.Apilar(2);
        origen.Apilar(3);
        origen.Apilar(4);
        origen.Apilar(5);
        PilaTDA destino = new Pila();
        destino.inicializarPila();
        Metodos m = new Metodos();
        m.copiarPila(origen,destino);
        System.out.println("- EJERCICIO TP2 B) - Copiar una Pila en otra (dejándola en el mismo orden que la original)");
        while (!destino.PilaVacia()){
            System.out.println(destino.Tope() + " ");
            destino.Desapilar();
        }
        System.out.println();
        System.out.println("Pila Copiada");
    }

    public static void EjercicioTP2PC() {
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        origen.Apilar(1);
        origen.Apilar(2);
        origen.Apilar(3);
        origen.Apilar(4);
        origen.Apilar(5);
        Metodos m = new Metodos();
        m.invertirPila(origen);
        System.out.println("- EJERCICIO TP2 C) -Invertir el contenido de una Pila. ");
        while (!origen.PilaVacia()){
            System.out.println(origen.Tope() + " ");
            origen.Desapilar();
        }
        System.out.println();
        System.out.println("Pila Invertida");
    }

    public static void EjercicioTP2PD() {
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        int cant;
        origen.Apilar(1);
        origen.Apilar(2);
        origen.Apilar(3);
        origen.Apilar(4);
        origen.Apilar(5);
        Metodos m = new Metodos();
        cant = m.contarElementosPila(origen);
        System.out.println("- EJERCICIO TP2 D) - Contar los elementos de una Pila ");
        System.out.println("Cantidad de elementos dentro de la pila: " + cant);
    }

    public static void EjercicioTP2PE() {
        int cant = 0;
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        origen.Apilar(2);
        origen.Apilar(7);
        origen.Apilar(11);
        origen.Apilar(6);
        Metodos m = new Metodos();
        cant = m.sumarElementosPila(origen);
        System.out.println("- EJERCICIO TP2 D) - Contar los elementos de una Pila ");
        System.out.println("Cantidad de elementos dentro de la pila: " + cant);
    }

    public static void EjercicioTP2PF() {
        int cantidad = 0;
        PilaTDA origen = new Pila();
        origen.inicializarPila();
        origen.Apilar(2);
        origen.Apilar(15);
        origen.Apilar(13);
        origen.Apilar(14);
        origen.Apilar(18);
        Metodos m = new Metodos();
        cantidad = m.calcularPromedioPila(origen);
        System.out.println("- EJERCICIO TP2 F) - Calcular el promedio de los elementos de una Pila ");
        System.out.println("Promedio de los elementos de una pila: " + cantidad);
    }
}
