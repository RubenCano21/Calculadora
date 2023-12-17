package negocio;

/**
 *
 * @author José
 */
public class Postfijo {

    PilaLista pilaSalida;
    PilaLista pilaOperadores;
    PilaLista pilaevalua;

    public Postfijo() {
        pilaSalida = new PilaLista();        //numeros de salida
        pilaOperadores = new PilaLista();
        pilaevalua=new PilaLista();
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
        
        Invertir(pilaSalida);
        System.out.println(pilaSalida.toString());
        evaluar(pilaSalida);
    }
    
    public void evaluar(PilaLista infija){
        pilaevalua=new PilaLista();
        pilaevalua.cima=infija.cima;
        String aux="";
        double resultado=0;
        
        
        while (!infija.vacia()) {
            aux=infija.pop().toString();
            if (aux.matches("[a-zA-Z0-9]+")) {
                pilaevalua.push(aux);                  
            } else if ("^".equals(aux) || "*".equals(aux) || "/".equals(aux) || "+".equals(aux) || "-".equals(aux)) { //(2-(2+5)*4)               
                double valor1=Double.valueOf(pilaevalua.pop().toString());
                double valor2=Double.valueOf(pilaevalua.pop().toString());
                resultado=EvaluaExpresion(aux,valor1,valor2);
                pilaevalua.push(resultado );                  
            }
        }
        System.out.println(pilaevalua.toString());
        
    }
    
    
    
    public double EvaluaExpresion(String valor,double valor1,double valor2) {
        double resultado=0;
        if("^".equals(valor)){
            resultado=(int) Math.pow(valor2, valor1);
        }else if("*".equals(valor)){
            resultado=valor1*valor2;
        }else if("/".equals(valor)){
            resultado=valor2/valor1;
        }else if("+".equals(valor)){
            resultado=valor1+valor2;
        }else if("-".equals(valor)){
            resultado=valor2-valor1;
        }
        return resultado;
    }
    
    
    public void Invertir(PilaLista P){
        PilaLista aux=new PilaLista();
        PilaLista aux2=new PilaLista();
        while (!P.vacia()) {            
            aux.push(P.pop());
        }
        while (!aux.vacia()) {            
            aux2.push(aux.pop());
        }
        while (!aux2.vacia()) {            
            P.push(aux2.pop());
        }
        
    }
    
    

    public String getPilaEvalua() {
        return pilaevalua.peek().toString();
    }

    public static void main(String[] args) {
        Postfijo a = new Postfijo();
        String expresion = "(2*3+(2/9)+1*3^5)";
        a.InfijaPostija(expresion);
        //System.out.println(a.getPilaSalida());
        System.out.println("");
        
        System.out.println(a.getPilaEvalua());
        //Postfijo b=new Postfijo();
        //b.Invertir(a);
        
        //String expresion2 = "(2-(2+5)*4) ";
        //a.InfijaPostija(expresion2);
        ///System.out.println(a.getPilaSalida());
        //char caracter='/';
        //String aux = Character.toString(caracter);

        //System.out.println(a.Jerarquia(aux));
    }

    

}
