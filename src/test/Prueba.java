/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import negocio.Calculadora;

/**
 *
 * @author Cano
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        String expresion = "5+((1+2)×4)";
        Calculadora A = new Calculadora(expresion);
        System.out.println(A.verificarExpresionValida());
        A.resolucion();
        
        System.out.println(A);
    }
}
