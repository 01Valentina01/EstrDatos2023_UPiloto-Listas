/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import cosas.persona;


/**
 *
 * @author IRG
 */
public class PersonaList {
    
    private persona lista[];
    private int counter;
    
    public PersonaList(int n){
        
        lista = new persona[n];
        counter = 0;
    }
    
    private void alaDerecha(int pos){
        for(int i = pos; i>=1; i--)
            lista[i]= lista[i-1];
            lista[0]= null;
        
    }
    //insertar
          //inserar al principio (dato aleatorio o dado por el usuario)
          public void insertarPrincipio(persona p){  //addFirst
              if(counter < lista.length){
                  if(counter > 0)
                        alaDerecha(counter);
                  lista[0]=p;
                  counter ++;
              }
          }
          //insertar al final (dato aleatorio o dado por el usuario)
          public void insertarUltimo(persona p){ //addlast
              if(counter < lista.length){
                lista [counter++]= p;  
              }
              
          }
          
        
          
        
    
    //buscar
          public String buscar(persona p){
              for(int i=0; i<counter; i++){
                  if(lista[i].getId().equals(p.getId())){
                     return lista[i] + "Posicion =" + i; 
                  }
              }
                      
              return "No encontrado";
          }
    //eliminar
         //eliminar primer dato
          public boolean eliminarPrimero(){
              if(counter > 0){
                  lista[++counter]= null;
              return true;
          }
          return false;
          }
         //eliminar el ultimo dato
          public boolean eliminarUltimo(){
              if(counter > 0){
                  lista[--counter]= null;
              return true;
          }
          return false;
          }
          
         
         
          
          
    //imprimir el arreglo
          public String imprimirLista(){
           String str = "Total personas = " + counter + "\n"; 
           for(int i=0; i<counter; i++)
               str += lista[i] +"\n";
           return str;
          }
}

