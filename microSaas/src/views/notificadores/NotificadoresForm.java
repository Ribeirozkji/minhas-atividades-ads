package views.notificadores;
import java.util.Scanner;
import java.util.ArrayList;

public class NotificadoresForm {
	public ArrayList<String> ids = new ArrayList<>();
	public ArrayList<String> mensagens = new ArrayList<>();
	public ArrayList<String> tipos = new ArrayList<>();
	public ArrayList<String> datahoras = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		NotificadoresForm form = new NotificadoresForm();
	 NotificadoresListar listador = new NotificadoresListar();
	 
	 while (true) {
         System.out.println("1 - Registrar Notificações");
         System.out.println("2 - Listar Notificações");
         System.out.println("0 - Sair");
         System.out.print("Escolha uma opção: ");
         int op = scanner.nextInt();
         scanner.nextLine(); 

         if (op == 1) {
             form.RegistrarNotificadores(scanner);
         } else if (op == 2) {
             listador.listarNotificadores(form);
         } else if (op == 0) {
             System.out.println("Encerrando...");
             break;
         } else {
             System.out.println("Opção inválida.");
         }
     }
	
	}



	public void RegistrarNotificadores(Scanner scanner) {
		System.out.println("Informe a Mensagem:");
	    mensagens.add(scanner.nextLine());

	    System.out.println("Informe o tipo da mensagem:");
	    tipos.add(scanner.nextLine());

	    System.out.println("Informe a data e hora:");
	    datahoras.add(scanner.nextLine());
	 
	    String novoId = String.valueOf(ids.size() + 1);
	    ids.add(novoId);
		
	}
	

}
