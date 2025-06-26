package views.notificadores;
import java.util.ArrayList;

import views.LogsAcesso.LogsAcessoForm;
public class NotificadoresListar {

	
	public void listarNotificadores(NotificadoresForm form) {
			  if (form.ids.isEmpty()) {
		            System.out.println("Nenhuma notificação foi registrada.");
		            return;
		        }

		        System.out.println("\n--- Notificadores ---");
		        for (int i = 0; i < form.ids.size(); i++) {
		            System.out.println("Notificação: " + (i + 1));
		            System.out.println("ID: " + form.ids.get(i));
		            System.out.println("Mensagem: " + form.mensagens.get(i));
		            System.out.println("Tipo da mensagem: " + form.tipos.get(i));
		            System.out.println("Data/Horas: " + form.datahoras.get(i));
		            System.out.println("-----------------------------");
		        }
		
		
	}

}
