package negocio;

/**
 *
 * @author Cano
 */
public class Calculadora {
    
    PilaLista<Double> pila;// operando
    PilaLista<Character> pilaOperaciones; // operadores
    String expInfija;
    String expPostFija;
    String Error;
    Double resultado;

    // Constructor
    public Calculadora(String expresion) {
        this.expInfija = expresion;
        this.pila = new PilaLista<>();
        this.pilaOperaciones = new PilaLista<>();
    }
    
    public Double resolucion(){
        this.expPostFija = conversionPostFija();
        String concatenar[] = this.expPostFija.split(" ");
        for(String car: concatenar){
            if (jerarquia( car) > 0) {
                double op1 = pila.pop();
                double op2 = pila.pop();
                double aux = operacion(op1, op2, car );
                pila.push(aux);
            }else {
                pila.push(Double.valueOf(car));
            }
        }
        this.resultado = pila.pop();
        return resultado;
    }
    
    private double operacion(double op1, double op2, String operador) {
        double result = 0.0;
        switch (operador) {
            case "+" -> result = op1 + op2;
            case "-" -> result = op1 - op2;
            case "x" -> result = op1 * op2;
            case "/" -> result = op1 / op2;
        }
        return result;
    }
    
    private String conversionPostFija() {
        String postfija = "";
        char []cadena = this.expInfija.toCharArray();
        for (int i = 0; i < cadena.length; i++) {
            char car = cadena[i];
            if (jerarquia(String.valueOf(car)) > 0) {
                while (!pilaOperaciones.vacia() && jerarquia(String.valueOf(pilaOperaciones.peek())) 
                        >= jerarquia(String.valueOf(car))) {                    
                    postfija += " " + pilaOperaciones.pop();
                }
                pilaOperaciones.push(car);
            }else if (car == ')') {
                char aux = pilaOperaciones.pop();
                while (aux != '(') {                    
                    postfija += " " + aux;
                    aux = pilaOperaciones.pop();
                }
            }else if (car == '(') {
                pilaOperaciones.push(car);
            }else if (Character.isDigit(cadena[i])) {
                postfija += " " + car;
                i++;
                while (i < cadena.length) {                    
                    if (Character.isDigit(cadena[i])) {
                        postfija += cadena[i]; 
                    }else {
                        i--;
                        break;
                    }
                    i++;
                }
            }
        }
        while (!pilaOperaciones.vacia()) {            
            postfija += " " + pilaOperaciones.pop();
        }
        return postfija.trim();
    }

    private int jerarquia(String operador) {
        int jerarquia = 0;
        if (operador.equals("×") || operador.equals("/")) {
             jerarquia = 2;
        } 
        if (operador.equals("+") || operador.equals("-")) {
            jerarquia = 1;
        }
        return jerarquia;
    }
    
    public String getExpresionInfija() {
        return expInfija;
    }

    public String getExpresionPostfija() {
        return expPostFija;
    }

    public String getError() {
        return Error;
    }

    public Double getResultado() {
        return resultado;
    }
    
    public boolean verificarExpresionValida() {
        Validacion A = new Validacion(expInfija);
        if (expInfija.equals("")) {
            Error = "NO PUEDE SER VACIA LA EXPRESIÓN INFIJA";
            return false;
        }
        if (!A.validarParentesis()) {
            Error = "PARENTESIS INVALIDOS";
            return false;
        }
        if (A.empiezaConOperador()) {
            Error = "NO PUEDE EMPEZAR CON UN OPERADOR";
            return false;
        }
        if (A.terminaConOperador()) {
            Error = "NO PUEDE TERMINAR CON UN OPERADOR";
            return false;
        }
        if (!A.evaluarAlternaciones()) {
            Error = ("ORDEN DE EXPRESIÓN INCORRECTA");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Expresión Infija = " + getExpresionInfija() + "\nExpresión Postfija = " 
                + getExpresionPostfija() + "\nResultado = " + getResultado();
    }
    
    public static void main(String[] args) {
        
    }

}
