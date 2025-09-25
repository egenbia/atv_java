/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatec-dsm2
 */
public class professor {
    private String rm;
    private String nome;
    private String endereco;
    
    //encapsulamento
    //criação de metodos
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    /* public e a visibilidade do metdo, cada atributo possui dois metodos get/set
    void indica que o metodo não precisa retornar algo 
    setNome -> é o nome do método, regra para criação do nome do método (set + nome do atributo em Maiusculo)
    o conteudo entre (   ) e o parametro necessario para funcionamento do metodo set.
    o parametro sera digitado/definido pelo usuario em algum momento
    a palavra this permite definir o que é parametro e o que atributo
    o metodo responsavel armazenar valor digitado pelo usuario
    (parametro nome) e repasse ao atributo nome;
    */
    
    public String getNome()
    {
    /* string é o tipo do retorno do metodo
        getNome é o nome do metodo
        getNome -> é o nome do metodo, regra para criacao do nome do metodo (get + nome do atributo em Maiusculo) 
        */
        
        return nome;
        /*o return nome esta retornando o valor armazenado no atributo nome que foi armazenado quandop o metodo set foi chamado    */
    }
}
