/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.io.Serializable;

/**
 *
 * @author Cano
 */
public class PilaLista<T> implements Serializable{
    
    NodoG<T> cima;
    int cant;

    public PilaLista() {
        this.cima = null;
        this.cant = 0;
    }
    
    public boolean vacia(){
        return (cima == null);
    }
    
    public void push(T elem){
        NodoG<T> pila = new NodoG<>();
        pila.setDato(elem);
        pila.setEnlace(cima);
        cima = pila;
        cant++;
    }
    
    public T pop(){
        T x = cima.getDato();
        cima = cima.getEnlace();
        cant--;
        return x;
    }
    
    public T peek(){ // get
        return (cima.getDato());
    }
    
    public int size(){ // tamaño 
        return cant;
    }
    
    @Override
    public String toString(){
        NodoG<T> aux = cima;
        String s = "";
        while (aux != null){
            s += "[" + aux.getDato() + "]" + "\n";
            aux = aux.getEnlace();
        } 
        return s;
    }
    
    public static void main(String[] args) {
        
        PilaLista A = new PilaLista<Character>();
        PilaLista B = new PilaLista<Integer>();
        
        A.push('+');
        A.push('-');
        A.push('*');
        A.push('/');
        
        B.push(2);
        B.push(1);
        B.push(5);
        B.push(3);
        
        System.out.println(A);
        System.out.println(B);
    }
}
