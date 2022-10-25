/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto004;

/**
 *
 * @author Jose
 */
public class Jugador {
    String nombre;
    int fechadeNacimeinto;
    String posicion;
    Seleccion equipo;
    
    public String getInfo(){
     return "EL nombre del jugador es: "+this.nombre+" ,nacio en : "+this.fechadeNacimeinto +" .Pertenece al equipo: "
             +this.equipo.pais +" y su tecnico es: "+this.equipo.Tecnico; 
    }
}

