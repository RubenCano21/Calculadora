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

    private String conversionPostFija() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int jerarquia(String car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double operacion(double op1, double op2, String car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
