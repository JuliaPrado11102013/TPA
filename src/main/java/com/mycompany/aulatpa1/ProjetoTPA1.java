/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aulatpa1;

/**
 *
 * @aurthor Eu, Julia Prado de Lira, estou fazendo um algoritmo, que irá ter a função de uma calculadora
 */
public class ProjetoTPA1 {
    public static void main(String[] args) {
        // Definição de dois números
        double num1 = 10.5;
        double num2 = 5.9;
        
        // Realizando operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 -num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN;  // Evita que a divisão dê errado
        double resto = num1 % num2;
        
        // Exibindo os resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao: "Indefinido (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
        // TODO code application logic here
    }
    
}
