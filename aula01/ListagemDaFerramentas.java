/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;
import java.util.Arrays;
public class ListagemDaFerramentas {

    public void listar(
        FerramentaManual[] manuais, int contManuais,
        FerramentaEletrica[] eletricas, int contEletricas
    ) {
        System.out.println("Listagem da ferramentas manuais");
        if (contManuais == 0) {
            System.out.println("Ferramenta não cadastrada");
        } else {
            for (int i = 0; i < contManuais; i++) {
                manuais[i].Exibir();
            }
        }

        System.out.println("Listagem da Ferramentas Elétricas");
        if (contEletricas == 0) {
            System.out.println("ferramenta elétrica não cadastrada");
        } else {
            for (int i = 0; i < contEletricas; i++) {
                eletricas[i].Exibir();
            }
        }
    }
}
