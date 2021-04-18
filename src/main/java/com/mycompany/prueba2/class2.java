/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba2;

/**
 *
 * @author ASUS
 */
public class class2 {

    public static void main(String args[]) {
        String saludo = mostrarSaludo("Franco");
    }

    public static String mostrarSaludo(String nombre) {
        String mensaje = "Hola " + nombre;

        System.out.print(mensaje);

        return mensaje;
    }
}
