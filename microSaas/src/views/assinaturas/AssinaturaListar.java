package views.assinaturas;
import java.util.ArrayList;
import java.util.Scanner;
public class AssinaturaListar {

	public void listar(AssinaturaForm form) {
        if (form.nomes.isEmpty()) {
            System.out.println("Nenhuma assinatura cadastrada.\n");
            return;
        }
        for (int i = 0; i < form.nomes.size(); i++) {
            System.out.println("Assinatura " + (i + 1));
            System.out.println("Nome: " + form.nomes.get(i));
            System.out.println("Plano: " + form.planos.get(i));
            System.out.println("Valor: " + form.valores.get(i));
            System.out.println("Data: " + form.datas.get(i));
            System.out.println("------------------");
        }

}}
