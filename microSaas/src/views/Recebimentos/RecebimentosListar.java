package views.Recebimentos;
import java.util.ArrayList;
public class RecebimentosListar {

	

	public void RecebimentosListar(RecebimentosForm form) {
		 if (form.ids.isEmpty()) {
	            System.out.println("Nenhum Recebimento foi Enviado.");
	            return;
	        }

	        System.out.println("\n--- Recebimento ---");
	        for (int i = 0; i < form.ids.size(); i++) {
	            System.out.println("Recebimento: " + (i + 1));
	            System.out.println("ID: " + form.ids.get(i));
	            System.out.println("Valor do Recebimento: " + form.valores.get(i));
	            System.out.println("A data do recebimento: " + form.datas.get(i));
	            System.out.println("A origem do recebimento: " + form.origens.get(i));
	            System.out.println("-----------------------------");
	        }
		
	}

}
