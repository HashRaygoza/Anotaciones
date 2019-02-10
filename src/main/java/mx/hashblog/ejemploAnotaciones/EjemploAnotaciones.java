/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.hashblog.ejemploAnotaciones;

import java.util.ArrayList;
import mx.hashblog.ejemploAnotaciones.anotaciones.Anotacion;
import mx.hashblog.ejemploAnotaciones.clases.Datos;
import mx.hashblog.ejemploAnotaciones.clases.Empleados;
import mx.hashblog.ejemploAnotaciones.clases.ManejoDatos;

/**
 *
 * @author david
 */
public class EjemploAnotaciones {
    static public void main(String[] args){
        System.out.println("Obtenemos los objetos class de nuestras clases");
        Class claseDatos = Datos.class;
        Class claseEmpleados = Empleados.class;
        Class claseManejoDatos = ManejoDatos.class;
        
        ArrayList<Class> clases = new ArrayList<>();
        
        clases.add(claseManejoDatos);
        clases.add(claseEmpleados);
        clases.add(claseDatos);
        
        for(Class clase : clases){
            System.out.println("Obteniendo anotacion de la clase: " + clase.getName() );
            Anotacion anotacion = (Anotacion) clase.getAnnotation( Anotacion.class );
            
            System.out.println("Obtenemos los datos que pusimos en las anotaciones");   
            System.out.println("Clase: " + clase.getName());
            System.out.println("Uso  : " + anotacion.uso());
            System.out.println("Orden  : " + anotacion.orden());
            System.out.println("");            
        }
    }
}
