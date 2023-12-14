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

    private int jerarquia(String car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
