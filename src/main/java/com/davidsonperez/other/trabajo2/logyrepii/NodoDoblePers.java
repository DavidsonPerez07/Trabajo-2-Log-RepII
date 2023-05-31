package com.davidsonperez.other.trabajo2.logyrepii;

public class NodoDoblePers {
    private Persona persona;
    private NodoDoblePers ligaIzq, ligaDer;
    
    public NodoDoblePers() {
        persona = null;
        ligaIzq = ligaDer = null;
    }
    
    public NodoDoblePers(String nombre, char sexo, int edad) {
        persona = new Persona(nombre, sexo, edad);
        ligaIzq = ligaDer = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoDoblePers getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoblePers ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoblePers getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoblePers ligaDer) {
        this.ligaDer = ligaDer;
    }
}
