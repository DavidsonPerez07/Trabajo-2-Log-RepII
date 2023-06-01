package com.davidsonperez.other.trabajo2.logyrepii;

public class Pila {
    private Persona[] vectorPersonas;
    private int tope;

    public Pila(int cont) {
        vectorPersonas = new Persona[cont];
        tope = -1;
    }

    public boolean apilar(Persona persona) {
        if (tope == vectorPersonas.length - 1) {
            return false; // La pila está llena
        }
        tope++;
        vectorPersonas[tope] = persona;
        return true;
    }

    public Persona desapilar() {
        Persona persona = vectorPersonas[tope];
        tope--;
        return persona;
    }

    public boolean estaVacia() {
        return tope == -1;
    }
    
    public Persona mostrarPila(int i) {
        return vectorPersonas[i];
    }
}
