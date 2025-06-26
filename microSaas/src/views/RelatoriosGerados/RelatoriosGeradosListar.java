package views.RelatoriosGerados;
import java.util.ArrayList;
public class RelatoriosGeradosListar {

	

	public void RelatoriosGerados(RelatoriosGeradosForm form) {
		if (form.ids.isEmpty()) {
            System.out.println("Nenhum Relatório foi Gerado.");
            return;
        }

        System.out.println("\n--- Relatório Gerado ---");
        for (int i = 0; i < form.ids.size(); i++) {
            System.out.println("Relatório Gerado: " + (i + 1));
            System.out.println("ID: " + form.ids.get(i));
            System.out.println("tipo do relatório: " + form.tipos.get(i));
            System.out.println("Data do relatório: " + form.datahoras.get(i));
            System.out.println("Responsável do Relatório: " + form.responsaveis.get(i));
            System.out.println("-----------------------------");
        }
	}

}
