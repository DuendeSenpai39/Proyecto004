/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto004;

/**
 *
 * @author Jose
 */
public class Proyecto004 {

    public static void main(String[] args){
        
    var Ecuador =new Seleccion();
    Ecuador.codigoFIFA="FEF";
    Ecuador.nombre="Angel Mena";
    Ecuador.pais="ECU";
    Ecuador.participacionMundial=8;
    Ecuador.Tecnico="Gustavo Alfaro";
    
    var Chile = new Seleccion ();
    Chile.codigoFIFA="CHL";
    Chile.nombre="Carlos";
    Chile.pais="CHE";
    Chile.participacionMundial=2;
    Chile.Tecnico="Eduardo Berrizo";
    
    var enner=new Jugador();
    enner.nombre ="Enner Valencia";
    enner.posicion="Delantero";
    enner.fechadeNacimeinto=1980;
    enner.equipo= Ecuador;
    
    
    var byron=new Jugador();
    byron.nombre="Byron Castillo";
    byron.posicion="Defensa";
    byron.fechadeNacimeinto=1988;
    byron.equipo= Ecuador;

    
    var vidal=new Jugador();
    vidal.nombre="Arturo Vidal";
    vidal.posicion="Delantero";
    vidal.fechadeNacimeinto=1993;
    vidal.equipo= Chile;
    
    System.out.println(vidal.getInfo());
    System.out.println(byron.getInfo());  
    System.out.println(enner.getInfo());
    }
}
 
