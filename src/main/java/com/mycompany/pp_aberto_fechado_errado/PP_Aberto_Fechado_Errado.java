/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_aberto_fechado_errado;

/**
 *
 * @author nando
 */
public class PP_Aberto_Fechado_Errado {

    public static void main(String[] args) {
        Car sedan = new Car("Monza","Chevrolet",1988,"Vermelho");
        
        sedan.imprimeDados(sedan);
        
        CarService pintura = new CarService();
        
        pintura.paintCar(sedan,"vinho");
        
        sedan.imprimeDados(sedan);;
        
    }
}
