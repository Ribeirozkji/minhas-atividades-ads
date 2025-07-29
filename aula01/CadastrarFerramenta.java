/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

import java.util.Scanner;
import java.util.Arrays;
public class CadastrarFerramenta {
  
    Scanner scanner = new Scanner(System.in);
    public void cadastrar(
        FerramentaManual[] manuais, int[] contManuais,
        FerramentaEletrica[] eletricas, int[] contEletricas,
        int[] proximoId
    ) {
        System.out.print("Tipo 1 - Manual / 2 - Elétrica");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Nome:");
        String nome = scanner.nextLine();

        System.out.print("Preço:");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();
        scanner.nextLine(); 

        
        if (preco <= 0 || qtd < 0) {
            System.out.println("Erro: preço ou quantidade inválidos");
            return;
        }

        
        if (tipo == 1) {
            FerramentaManual nova = new FerramentaManual(proximoId[0], nome, preco, qtd);
            manuais[contManuais[0]] = nova;
            contManuais[0]++;
            proximoId[0]++;
            System.out.println("Ferramenta Cadastrada");
        
        
        } else if (tipo == 2) {
            FerramentaEletrica nova = new FerramentaEletrica(proximoId[0], nome, preco, qtd);
            eletricas[contEletricas[0]] = nova;
            contEletricas[0]++;
            proximoId[0]++;
            System.out.println("Ferramenta elétrica Cadastrda");

        } else {
            System.out.println("Tipo inexistente");
        }
    }
}