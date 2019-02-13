/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.hashblog.ejemploAnotaciones.anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Indicamos en que contexto existira la anotacion
@Retention(RetentionPolicy.RUNTIME)
public @interface Anotacion {
    public String uso() default ""; // elemento uso y su valor por defecto
    public int orden() default 0; // elemento orden y su valor por defecto
}
