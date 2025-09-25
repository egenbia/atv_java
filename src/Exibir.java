/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatec-dsm2
 */
public class Exibir {

    //metodo padrão para execução
    public static void main(String[] args) {
        // a 1° palavra professor é o nome da class
        // a 2° palavra professor é o nome do construtor
        // o construtor pode ser configurado 
        // pf é o nome do objeto
        professor pf = new professor();

        //armazenar valores no set
        pf.setNome("Bia");
        //demonstrar valor atraves do Get
        System.out.println("Nome: " + pf.getNome() );
    }
}
