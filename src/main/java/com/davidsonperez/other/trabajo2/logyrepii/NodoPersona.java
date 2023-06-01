package com.davidsonperez.other.trabajo2.logyrepii;

public class NodoPersona {
    private Persona persona;
    private NodoPersona liga;
    
    public NodoPersona() {
        persona = null;
        liga = null;
    }
    
    public NodoPersona(String nombre, char sexo, int edad) {
        persona = new Persona(nombre, sexo, edad);
        liga = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoPersona getLiga() {
        return liga;
    }

    public void setLiga(NodoPersona liga) {
        this.liga = liga;
    }
}
