/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import array.PersonaList;
import cosas.persona;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author IRG
 */
public class interfazApp {

    PersonaList lista;
    
    public interfazApp(int tamañoLista){
        lista = new PersonaList(tamañoLista);
    }
    
    private void menu(){
        System.out.println("Selecione una opcion:\n " +
                "1. Insertar al principio\n" +
                "2. Insertar al final\n" +
                "3. Insertar ordenadamente\n" +
                "4. Rellenar arreglo\n" +
                "5. Buscar\n" +
                "6. Eliminar al principio\n" +
                "7. Eliminar al final\n" +
                "8. Eliminar un dato\n" +
                "9. Imprimir lista\n" +
                "0. Salir\n");
        
    }
    
    private persona crearPersona(){
        final String nombres[] = {"Juan", "Martha", "Fidel", "Rosa"};
        final String apellido[] = {"Garcia","Marinez","Perez", "Alarcon"};
        final String generos[] = {"Hombre", "Mujer"};      
        
        String id = (int)(Math.random()*99000000+1000000)+ "";
        String nombre = nombres[(int)(Math.random()*4)]+ " " + apellido[(int)(Math.random()*4)];
        String genero = generos[(int)(Math.random()*2)];
        int edad = (int)(Math.random()* 121);
        
        return new persona(id,nombre, genero,edad);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Ingrese el tamaño de la lista");
       int tamañoLista = sc.nextInt();
       sc.nextLine();
       
       interfazApp iApp= new interfazApp(tamañoLista);
       
       int opcion;
       String id;
       
       while(true){
           iApp.menu();
           opcion = sc.nextInt();
           sc.nextLine();
           switch(opcion){
               case 1:
                   iApp.lista.insertarPrincipio(iApp.crearPersona());
                break;
               case 2:
                   iApp.lista.insertarUltimo(iApp.crearPersona());
                break;
               case 3:
                   
                break;
               case 4:
                   
                break;
               case 5:
                   System.out.print("Ingrese el numero de identificacion de la persona a buscar:");
                   id = sc.nextLine();
                   System.out.println(iApp.lista.buscar(new persona(id,"" ,"",0)));
                break; 
               case 6:
                   if(iApp.lista.eliminarPrimero())
                     System.out.println("El primer dato fue eliminado");
                   else
                       System.out.println("No hay datos para eliminar");
                break;
               case 7:
                   if(iApp.lista.eliminarUltimo())
                       System.out.println("El ultimo dato fue eliminado");
                   else
                       System.out.println("No hay datos para eliminar");
                break;
               case 8:
                   
                break;
               case 9:
                   System.out.println(iApp.lista.imprimirLista());
                break;
               case 0:
                   System.out.println("Gracias por usar esta aplicacion");
                   System.exit(0);
               default:
                   System.out.println("Opcion no valida!");
           }
       }
    }
    
}
