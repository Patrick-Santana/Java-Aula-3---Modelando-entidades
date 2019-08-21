/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcelular;

/**
 *
 * @author Patrick 
 */
public class Fcelular {
    
    String marca; 
    String cor; 
    Fabricante Fabricante;
    String nome; 
    String pais;
    float preco;

    public static void main(String[] args) {
        Fabricante a1 = new Fabricante();

        a1.nome ="Skarlett";
        a1.pais ="Suricane";

        Fcelular c1 = new Fcelular();

        c1.marca = "Xiaomi";
        c1.cor = "Azul Perolado";
        c1.preco = (float) 1150.57;

        System.out.println("Marca da Celular: " + c1.marca);
        System.out.println("Cor da Celular: " + c1.cor);
        System.out.println("Nome do Fabricante: " + a1.nome);
        System.out.println("Pais de Origem: " + a1.pais);
        System.out.println("Preço do aparelho: " + c1.preco);
        
    }
    
}
