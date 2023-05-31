package com.davidsonperez.other.trabajo2.logyrepii;

public class ListaDoblementeLigPers {
    private NodoDoblePers cab, ult, x, y;
    
    public ListaDoblementeLigPers() {
        cab = new NodoDoblePers();
        ult = cab;
        x = cab;
    }
    
    public void ingresar(String nombre, char sexo, int edad) {
        NodoDoblePers p = new NodoDoblePers(nombre, sexo, edad);
        p.setLigaIzq(ult);
        ult.setLigaDer(p);
        ult = p;
        y = ult;
    }
    
    public Persona mostrarAlDerecho() {
    x = x.getLigaDer();

    if (x == null) {
        x = cab;
    }

    return x.getPersona();
    }
    
    public Persona mostrarAlReves() {
        if (y == cab) {
            y = ult;
            return null;
        }
        
        y = y.getLigaIzq(); 
        return y.getLigaDer().getPersona();
    }
}
