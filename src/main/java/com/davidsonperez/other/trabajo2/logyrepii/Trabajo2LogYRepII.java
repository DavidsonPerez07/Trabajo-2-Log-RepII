package com.davidsonperez.other.trabajo2.logyrepii;

import java.util.Scanner;

public class Trabajo2LogYRepII {

    public static void main(String[] args) {
        String nom;
        char sexo;
        int edad;
        Scanner input = new Scanner(System.in);
        ListaDoblementeLigPers listaPersonas = new ListaDoblementeLigPers();

        System.out.println("Ingrese los datos de la persona (999 en nombre para salir): ");
        System.out.println("Ingrese los datos de la persona (999 en nombre para salir): ");

        System.out.println("Nombre: ");
        nom = input.nextLine();

        while (nom != "999") {
            System.out.println("Sexo: ");
            sexo = input.next().charAt(0);
            System.out.println("Edad: ");
            edad = input.nextInt();

            listaPersonas.ingresar(nom, sexo, edad);

            System.out.println("Nombre: ");
            nom = input.nextLine();
        }
    }
}
