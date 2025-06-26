package views.Clientes;
import java.util.ArrayList;


public class ClientesListar {
	public void listarClientes(ClientesForm form) {
	    if (form.nomes.isEmpty()) {
	        System.out.println("Nenhum Cliente cadastrado.\n");
	        return;
	    }
	    for (int i = 0; i < form.nomes.size(); i++) {
	        System.out.println("Cliente " + (i + 1));
	        System.out.println("ID: " + form.ids.get(i));
	        System.out.println("Nome: " + form.nomes.get(i));
	        System.out.println("CPF: " + form.cpfs.get(i));
	        System.out.println("Email: " + form.emails.get(i));
	        System.out.println("------------------");
	    }
	}

	

}
