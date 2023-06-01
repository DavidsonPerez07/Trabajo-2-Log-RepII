package com.davidsonperez.other.trabajo2.logyrepii;

import java.util.Scanner;

public class Trabajo2LogYRepII {

    public static void main(String[] args) {
        String nom;
        char sexo;
        int edad;
        Scanner input = new Scanner(System.in);
        ListaPersona listaPersonas = new ListaPersona();
        boolean c = true;

        Persona persona = new Persona();
        
        System.out.println("Ingrese los datos de la persona (999 en nombre para salir): ");
        System.out.println();

        System.out.print("Nombre: ");
        nom = input.nextLine();

        while(c){
            if(nom.equals("999")){
                if(listaPersonas.contarHombres() == listaPersonas.contarMujeres()){
                    break;
                }else{
                    System.out.println("La cantidad de hombres y mujeres es diferentes");
                    
                    System.out.print("Nombre: ");
                    nom = input.nextLine();
                }
            }

            do {
                System.out.print("Sexo: ");
            sexo = input.next().charAt(0);
            } while (sexo != 'f' && sexo != 'm');
                
            do {
                System.out.print("Edad (debe ser mayor de edad): ");
                edad = input.nextInt();
            } while (edad < 18);

            listaPersonas.ingresar(nom, sexo, edad);

            input.nextLine();
            System.out.println();
            System.out.print("Nombre: ");
            nom = input.nextLine();    
        }

        System.out.println();

        listaPersonas.ordenarListaMenorAMayorEdad();
        
        Pila pilaHombres = new Pila(listaPersonas.contarHombres());
        Pila pilaMujeres = new Pila(listaPersonas.contarMujeres());
        Pila pilaAuxMujeres = new Pila(listaPersonas.contarMujeres());

        persona = listaPersonas.mostrarLista();
        while(persona != null){
            if (persona.getSexo() == 'f') {
                pilaAuxMujeres.apilar(persona);
            }
            else if (persona.getSexo() == 'm') {
                pilaHombres.apilar(persona);
            }
            persona = listaPersonas.mostrarLista();
        }

        for(int i=0; i<listaPersonas.contarMujeres(); i++){
            pilaMujeres.apilar(pilaAuxMujeres.desapilar());
        }

        for(int i=0, k= 0; i<listaPersonas.contarHombres() && k<listaPersonas.contarMujeres(); i++, k++){
            System.out.println(pilaHombres.mostrarPila(i).getNombre()+" "+pilaHombres.mostrarPila(i).getEdad() 
            + " --- " 
            + pilaMujeres.mostrarPila(k).getNombre()+" "+pilaMujeres.mostrarPila(k).getEdad());
            System.out.println();
        }
    }
}
