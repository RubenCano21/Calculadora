package negocio;

/**
 *
 * @author José
 */
public class Postfijo {

    PilaLista pilaSalida;
    PilaLista pilaOperadores;

    public Postfijo() {
        pilaSalida = new PilaLista();        //numeros de salida
        pilaOperadores = new PilaLista();
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
        pilaSalida = new PilaLista();        //numeros de salida
        pilaOperadores = new PilaLista();       //()+-*/
        String aux = "";

        for (char caracter : expresion.toCharArray()) {
            aux = Character.toString(caracter);
            
            if (aux.matches("[a-zA-Z0-9]+")) {
                pilaSalida.push(caracter);                  
            } else if (caracter == '(') { //(2-(2+5)*4)               
                pilaOperadores.push(caracter);                  
            } else if (caracter == ')') {
                while (!pilaOperadores.vacia() ) {                    
                    if ((!"(".equals(pilaOperadores.peek().toString()))) {
                        pilaSalida.push(pilaOperadores.pop());
                    } else {
                        pilaOperadores.pop();
                        break;
                    }
                }
            } else if (caracter == '^' || caracter == '*' || caracter == '/' || caracter == '+' || caracter == '-') {
                
                if (!pilaOperadores.vacia()) //b=pilaOperadores.peek().toString();
                {
                    while (!pilaOperadores.vacia()
                            && (Jerarquia(pilaOperadores.peek().toString()) >= Jerarquia(aux))) {
                        pilaSalida.push(pilaOperadores.pop());
                    }
                }
                pilaOperadores.push(caracter);
            }
        }
        //==========================================================================
          
        while (!pilaOperadores.vacia()) {
            pilaSalida.push(pilaOperadores.pop());
        }
        pilaOperadores = null;
        //System.out.println(pilaSalida.toString());
    }

    public String getPilaSalida() {
        return pilaSalida.toString();
    }

    public static void main(String[] args) {
        Postfijo a = new Postfijo();
        String expresion = "(2-(2+5)*4) ";
        a.InfijaPostija(expresion);
        System.out.println(a.getPilaSalida());
        System.out.println("");
        String expresion2 = "(2-(2+5)*4) ";
        a.InfijaPostija(expresion2);
        System.out.println(a.getPilaSalida());
        //char caracter='/';
        //String aux = Character.toString(caracter);

        //System.out.println(a.Jerarquia(aux));
    }

}
