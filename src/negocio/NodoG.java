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
public class NodoG<T> implements Serializable{
    
    T dato;
    NodoG<T> enlace;

    public NodoG() {
        this.enlace = null;
    }
    
    public NodoG(T dato){
        this.dato = dato;
        this.enlace = null;
    }
    
    public T getDato(){
        return this.dato;
    }
    
    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public NodoG<T> getEnlace(){
        return this.enlace;
    }
    
    public void setEnlace(NodoG<T> enlace){
        this.enlace = enlace;
    }
    
    @Override
    public String toString(){
        return (dato + "" + '\n');
    }
    
    public static void main(String[] args) {
        
        NodoG a = new NodoG();
        
        a.setDato(1);
        a.setDato("juan");
        
        System.out.println(a.toString());
    }
}
