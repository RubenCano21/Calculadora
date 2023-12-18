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
        pilaSalida = new PilaLista();        //donde va almacenar posfijo
        pilaOperadores = new PilaLista();   //donde almacena los signos y ( ), una pila auxiliar
        pilaevalua=new PilaLista();         //pila que contiene la pila posfija y el resultado
    }

    //funcion que retorrna su la jerarquia a la que pertenece
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

    
    //le pasamos lo que queremos calcular y lo convierte de infija a posfija
    public void InfijaPostija(String expresion) {
        pilaSalida = new PilaLista();        //numeros de salida
        pilaOperadores = new PilaLista();       //()+-*/
        String aux = "";
        String num="";          

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            aux = Character.toString(caracter);            
            
            
            if (aux.matches("[a-zA-Z0-9]+") || aux.equals(".")) {
                num+=aux; 
            }else if(!aux.matches("[a-zA-Z0-9]+") && !num.equals("")){
                pilaSalida.push(num);
                num="";
            }
            if(i==expresion.length()-1 && !num.equals("")){
                pilaSalida.push(num);   //mete num si en la siguiente vuelta hay un ")" y es el final del String
            }
            
            
            
            if (caracter == '(') {             
                pilaOperadores.push(caracter);    
                
            } else if (caracter == ')'){
                while (!pilaOperadores.vacia() ) {  //hace un bucle por la pilaOperador hasta encontrarse con un parentesis abierto                 
                    if ((!"(".equals(pilaOperadores.peek().toString()))) {
                        pilaSalida.push(pilaOperadores.pop().toString());
                    } else {
                        pilaOperadores.pop();   //si se encunetra con un parentesis abierto lo elimina y rompe el ciclo
                        break;
                    }
                }
            } else if (caracter == '^' || caracter == '*' || caracter == '/' || caracter == '+' || caracter == '-') {
                
                if (!pilaOperadores.vacia()) 
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
        
        //por si quedo algun signo no leido
        while (!pilaOperadores.vacia()) {
            pilaSalida.push(pilaOperadores.pop());
        }
        pilaOperadores = null;
        //System.out.println(pilaSalida.toString());
        
        
        Invertir(pilaSalida);
        System.out.println(pilaSalida.toString());
        evaluar(pilaSalida);
    }
    
    
    
    //le pasamos una pila posfija ya invertida para calcular el resultado
    public void evaluar(PilaLista infija){
        pilaevalua=new PilaLista();
        pilaevalua.cima=infija.cima;    //copia a infija osea toma todos sus valores
        String aux="";
        double resultado=0;       
        
        while (!infija.vacia()) {
            aux=infija.pop().toString();
            if (aux.matches("[a-zA-Z0-9.]+")) {
                pilaevalua.push(aux);                  
            } else if ("^".equals(aux) || "*".equals(aux) || "/".equals(aux) || "+".equals(aux) || "-".equals(aux)) { //(2-(2+5)*4)               
                double valor1=Double.valueOf(pilaevalua.pop().toString());
                double valor2=Double.valueOf(pilaevalua.pop().toString());
                resultado=EvaluaExpresion(aux,valor1,valor2);
                pilaevalua.push(resultado);                 
            }
        }
        // al final tiene todos los valores de infija y en la cima agrega el resultado
        System.out.println(pilaevalua.toString());
        
    }
    
    
    //toma dos valores mas signo y lo opera
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
    
    
    //invierte la pila para evaluarla 
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
    
    
    //devuelve el resultado que esta en la cima de la pilaEvalua
    public String getResultado() {
        return pilaevalua.peek().toString();
    }

    public static void main(String[] args) {
        Postfijo a = new Postfijo();
        //String expresion = "((5.2+3.1)*2)-(4^2+1)";
        String expresion = "(3.5+2.2)-1.8/((5.2+3.1)*2)-(4^2+1)";
        a.InfijaPostija(expresion);
        //System.out.println(a.getPilaSalida());
        System.out.println("");
        
        System.out.println(a.getResultado());
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
