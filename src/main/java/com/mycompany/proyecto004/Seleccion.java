/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto004;

/**
 *
 * @author Jose
 */
public class Seleccion {
    String codigoFIFA;
    String nombre;
    String pais;
    String jugador;
    int participacionMundial;
    String Tecnico;
    
 public String obtienePais(){
    var retorno="Desconocido";
    switch(codigoFIFA){
        case "ECU":
            retorno="Ecuador";
            break;
        case "ARG":
            retorno="Aregentina";
            break;
        case "CHL":
            retorno="Chile";
            break;
        case "HON":
            retorno="Honduras";
            break;
        default :
            break;
    }
    return retorno;}}

 