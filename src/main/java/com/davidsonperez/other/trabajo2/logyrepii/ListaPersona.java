package com.davidsonperez.other.trabajo2.logyrepii;

public class ListaPersona {
    private NodoPersona cab, ult, x;
    
    public ListaPersona() {
        cab = new NodoPersona();
        ult = cab;
        x = cab;
    }
    
    public void ingresar(String nombre, char sexo, int edad) {
        NodoPersona p = new NodoPersona(nombre, sexo, edad);
        ult.setLiga(p);
        ult = p;
    }

    public int contarHombres(){
        int contHombres=0;
        NodoPersona p = cab.getLiga();
        
        while (p != null) {
            if (p.getPersona().getSexo() == 'm') {
                contHombres++;
            }
            p = p.getLiga();
        }
        
        return contHombres;
    }

    public int contarMujeres(){
        int contMujeres=0;
        NodoPersona p = cab.getLiga();

        while (p != null){
            if(p.getPersona().getSexo() == 'f'){
            ++contMujeres;
            }
            p = p.getLiga();
        }
        
        return contMujeres;
    }
    
    public Persona mostrarLista() {
    x = x.getLiga();

    if (x == null) {
        x = cab;
    }

    return x.getPersona();
    }

    public void ordenarListaMenorAMayorEdad() {
        NodoPersona ant, p;
        Persona auxPersona = new Persona();
        ant = cab.getLiga();
        p = ant.getLiga();  

        while (p != null) {
            if (ant.getPersona().getEdad() > p.getPersona().getEdad()) {
                auxPersona = ant.getPersona();
                ant.setPersona(p.getPersona());
                p.setPersona(auxPersona);
            }
            p = p.getLiga();

            if (p == null) {
                ant = ant.getLiga();
                p = ant.getLiga();
            }
        }
    }


}
