/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_aberto_fechado_errado;

/**
 *
 * @author nando
 */
public class Car {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    
    public Car(String model, String make, int year, String color) {
        this.modelo = model;
        this.marca = make;
        this.ano = year;
        this.cor = color;
    }
    
    public void setColor(String color) {
        this.cor = color;
    }
    
    public void imprimeDados(Car carro){
        System.out.println(":..Dados do Carro..:");
        System.out.println("Modelo..: "+carro.modelo);
        System.out.println("Marca..: "+carro.marca);
        System.out.println("Ano..: "+carro.ano);
        System.out.println("Cor..: "+carro.cor);
    }
}
