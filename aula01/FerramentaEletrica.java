/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

public class FerramentaEletrica {
  int id;
String nome;
double preco;
int quantidade;

public FerramentaEletrica (int id, String nome, double preco, int quantidade){

    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
public void Exibir() {
    System.out.println(" | ID: " + id + 
                    " | Nome:" + nome + 
                    " | Preço: " + preco + 
                    " | Quantidade: " + quantidade);
}  
}
