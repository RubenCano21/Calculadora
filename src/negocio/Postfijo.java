package negocio;

/**
 *
 * @author José
 */
public class Postfijo {

    public Postfijo() {

    }

    public int Jerarquia(String signo) {
        if ("+".equals(signo) || "-".equals(signo)) {
        return 1;
    }
    if ("*".equals(signo) || "/".equals(signo)) {
        return 2;
    }
    if ("^".equals(signo)) {
        return 3;
    }
    return 0;
    }

    public void InfijaPostija(String expresion) {
        PilaLista pilaSalida = new PilaLista();        //numeros de salida
        PilaLista pilaOperadores = new PilaLista();       //()+-*/
        String aux = "";

        for (char caracter : expresion.toCharArray()) {
            aux = Character.toString(caracter);
            
            if (aux.matches("[a-zA-Z0-9]+")) {                
                pilaSalida.push(caracter);
                
//======================================================================================================                  
            } else if (caracter == '(') {                
                pilaOperadores.push(caracter);
                
//======================================================================================================                  
            
            } else if (caracter == ')') {
                
                while (!pilaOperadores.vacia() /*&& (pilaOperadores.peek().toString() != "(") && !pilaOperadores.vacia()*/) {
                    String a = pilaOperadores.peek().toString();
                    if ((!"(".equals(pilaOperadores.peek().toString()))) {
                        pilaSalida.push(pilaOperadores.pop());
                    }else {
                        pilaOperadores.pop();
                        break;
                    }
                } 
                
//======================================================================================================                
            } else if (caracter == '^' || caracter == '*' || caracter == '/' || caracter == '+' || caracter == '-') {
                String b;int jer,jer2;
                if(!pilaOperadores.vacia())
                     b=pilaOperadores.peek().toString();
                
                while (!pilaOperadores.vacia() &&                        
                      (Jerarquia(pilaOperadores.peek().toString()) >= Jerarquia(aux))) {
                    jer=Jerarquia(pilaOperadores.peek().toString());
                    jer2=Jerarquia(aux);
                    b=pilaOperadores.peek().toString();
                    pilaSalida.push(pilaOperadores.pop());
                }
                pilaOperadores.push(caracter);
            }
        }
        
        
        //-------------------------------//======================================================================================================-------------------------------------------------------  
        while (!pilaOperadores.vacia()) {
            pilaSalida.push(pilaOperadores.pop());
        }
        pilaOperadores=null;
        

        

        System.out.println(pilaSalida.toString());
        //System.out.println("===============================");
        //System.out.println(pilaOperadores.toString());
    }

    public static void main(String[] args) {
        Postfijo a = new Postfijo();
        String expresion = "(3-5)-(7+2)";
        a.InfijaPostija(expresion);
        //char caracter='/';
        //String aux = Character.toString(caracter);
        
        //System.out.println(a.Jerarquia(aux));
    }

}
