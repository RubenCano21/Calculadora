/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author Cano
 */
class Validacion {
      String expresion;
    
    public Validacion(String expresion) {
        this.expresion = expresion;
    }
    
    public boolean validarParentesis() {
        PilaLista<Character> pilaV = new PilaLista<>();
        char[] ecuacion = expresion.toCharArray();
        for (int i = 0; i < ecuacion.length; i++) {
            char caracter = ecuacion[i];
            if (caracter == '(') {
                pilaV.push(caracter);
            } else if (caracter == ')') {
                if (pilaV.vacia()) {  // Numero de parentesis impares
                    return false;
                } else {
                    pilaV.pop();
                }
            }
        }
        return pilaV.vacia();
    }
    
    public boolean empiezaConOperador() {
        char[] cadena = expresion.toCharArray();
        if (cadena != null && cadena.length > 0) {
            char caracter = cadena[0];
            if (Character.isDigit(caracter)) {
                return false;
            } else if (caracter == '+' || caracter == '-' || caracter == '×' || caracter == '/') {
                return true;
            }
        }
        return false;
    }
    
    public boolean terminaConOperador() {
        char[] cadena = expresion.toCharArray();
        if (cadena != null && cadena.length > 0) {
            char caracter = cadena[cadena.length - 1];
            if (Character.isDigit(caracter)) {
                return false;
            } else if (caracter == '+' || caracter == '-' || caracter == '×' || caracter == '/' || caracter == '^') {                
                return true;
            }
        }
        return false;
    }
    
    public boolean evaluarAlternaciones() {
        char[] cadena = expresion.toCharArray();
        char elementoAnterior = cadena[0];
        for (int i = 1; i < cadena.length; i++) {
            char caracter = cadena[i];
            if (Character.isDigit(caracter)) {
                if (elementoAnterior == ')') {
                    System.out.println("No se puede poner un numero despues de un ')'");
                    return false;
                } else {
                    elementoAnterior = caracter;
                }
            } else if (caracter == '(') {
                switch (elementoAnterior) {
                    case '(' -> elementoAnterior = caracter;
                    case '+', '-', '×', '/' -> elementoAnterior = caracter;
                    default -> {
                        System.out.println("Despues de un '" + elementoAnterior + "' no puede venir un '('");
                        return false;
                    }
                }
            } else if (caracter == ')') {
                if (elementoAnterior == ')') {
                    elementoAnterior = caracter;
                } else if (Character.isDigit(elementoAnterior)) {
                    elementoAnterior = caracter;
                } else {
                    System.out.println("Despues de un '" + elementoAnterior + "' no puede venir un ')'");
                    return false;
                }
            } else if (caracter == '+' || caracter == '-' || caracter == '×' || caracter == '/') {
                if (elementoAnterior == ')') {
                    elementoAnterior = caracter;
                } else if (Character.isDigit(elementoAnterior)) {
                    elementoAnterior = caracter;
                } else {
                    System.out.println("Despues de un '" + elementoAnterior + "' no puede venir un Operador '" + caracter + "'");
                    return false;
                }
            }
        }
        return true;
    }
    
}
