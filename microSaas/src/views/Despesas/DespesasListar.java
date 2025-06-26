package views.Despesas;
import java.util.ArrayList;
public class DespesasListar {
	public void listarDespesas(DespesasForm form) {
        if (form.ids.isEmpty()) {
            System.out.println("Nenhuma despesa cadastrada.");
            return;
        }
        System.out.println("\n--- Lista de Despesas ---");
        for (int i = 0; i < form.ids.size(); i++) {
            System.out.println("ID: " + form.ids.get(i));
            System.out.println("Descrição: " + form.descricaos.get(i));
            System.out.println("Valor: R$" + form.valores.get(i));
            System.out.println("Data: " + form.datas.get(i));
            System.out.println("------------------------");
        }
    }

	

}
