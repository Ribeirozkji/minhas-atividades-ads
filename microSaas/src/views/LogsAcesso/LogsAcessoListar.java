package views.LogsAcesso;
import java.util.ArrayList;


public class LogsAcessoListar {

	public void listarLogsAcesso(LogsAcessoForm form) {
		  if (form.ids.isEmpty()) {
	            System.out.println("Nenhum Logout foi registrado.");
	            return;
	        }

	        System.out.println("\n--- Logs de Acesso ---");
	        for (int i = 0; i < form.ids.size(); i++) {
	            System.out.println("Log: " + (i + 1));
	            System.out.println("ID: " + form.ids.get(i));
	            System.out.println("Usuário: " + form.usuarios.get(i));
	            System.out.println("Ação: " + form.acoes.get(i));
	            System.out.println("Data/Horas: " + form.datahoras.get(i));
	            System.out.println("-----------------------------");
	        }
	}
}
