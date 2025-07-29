/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

public class Produto {
    int id;
String nome;
String tipo;
double preco;
int quantidade;

public Produto (int id, String nome, String tipo, double preco, int quantidade){
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.preco = preco;
    this.quantidade = quantidade;
    
    }
public void ProdutoExibir() {
            System.out.println("ID: " + id + 
                    "Nome:" + nome + 
                    "Tipo: " + tipo + 
                    "Preço: " + preco + 
                    "Quantidade: " + quantidade);

}
public double ValorTotal() {
 return preco * quantidade;

}

}
