/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.hashblog.ejemploAnotaciones.clases;

import mx.hashblog.ejemploAnotaciones.anotaciones.Anotacion;

/**
 *
 * @author david
 */
@Anotacion(uso="Clase para empleados", orden=2)
public class Empleados {
    private String nombre;
    private Integer numeroEmpleado;
    private String posicion;
    
}
