/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

/**
 *
 * 
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario(100, 2000.0f, "Vendedor");
        
        System.out.print("Funcionário 1: ");
        func1.setCargo("Gerente");
        func1.setSalario(5000.0f);
        System.out.println(func1.getCargo());
        System.out.println("O salário atual é: " + func1.getSalario());
        func1.calculaAumento(10f);
        
        System.out.print("\nFuncionário 2: ");  
        System.out.println(func2.getCargo());
        System.out.println("O salário atual é: " + func2.getSalario());
        func2.calculaAumento(10);
    }
    
}
