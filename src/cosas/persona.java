/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosas;

/**
 *
 * @author IRG
 */
public class persona {
    
    private final String id;
    private final String nombre;
    private final boolean genero; //Hombre= true, Mujer = false
    private int edad;

    public persona(String id, String nombre, String genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero.equalsIgnoreCase("Hombre");
        this.edad = (edad>=0 && edad <= 120)?edad: 0;
    }

    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getGenero() {
        return genero ? "Hombre": "Mujer";
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad >= 0 && edad <= 120? edad : 0;
    }

    @Override
    public String toString() {
        return "id = " +id + ", nombre = " + nombre + ", genero = " + getGenero() + ", edad = " +edad; 
    }

   
    

    

    

  
    

    
    
    
    
}
