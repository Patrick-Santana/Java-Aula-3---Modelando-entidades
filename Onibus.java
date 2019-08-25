/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patric
 */
public class Onibus {
    int preco;
    Empresa Empresa;
    float Temp;
    int Carros;
    String motor;
    String carroceria;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Onibus a2 = new Onibus();
        
        a2.preco = 1152;
        a2.Temp = (float) 16.2;
        a2.Carros = 324;
        a2.motor = "Volvo";
        a2.carroceria ="marcopolo";
        
        Empresa c2 = new Empresa();
        
        c2.valor = (float)2416442;
        c2.Nome = "Organizações Tabajara";
        c2.funcionarios = 532;
        c2.cnpj = 172458265;
        
        System.out.println("Preço do onibus: " + a2.preco);
        System.out.println("Temperatura do Ar-condicionado: " + a2.Temp);
        System.out.println("Quantidade de Carros disponiveis: " + a2.Carros);
        System.out.println("Nome Do motor: " + a2.motor);
        System.out.println("Nome Da Carroceria: " + a2.carroceria);
        System.out.println("\n");
        System.out.println("Patrimonio da empresa: " + c2.valor);
        System.out.println("Nome da empresa: " + c2.Nome);
        System.out.println("Número de funcionários: " + c2.funcionarios);
        System.out.println("cnpj da empresa: " + c2.cnpj);
        
                
        // TODO code application logic here
    }
    
}
