package negocio;

/**
 *
 * @author Cano
 */
public class Calculadora {
    
    PilaLista<Double> pila;
    PilaLista<Character> pilaOperaciones;
    String expInfija;
    String expPostFija;
    String Error;
    Double resultado;

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
                
            }
        }
    }

    private String conversionPostFija() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int jerarquia(String car) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
