package views.LogsAcesso;
import java.util.Scanner;
import java.util.ArrayList;
public class LogsAcessoForm {
	public ArrayList<String> ids = new ArrayList<>();
	public ArrayList<String> usuarios = new ArrayList<>();
	public ArrayList<String> acoes = new ArrayList<>();
	public ArrayList<String> datahoras = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LogsAcessoForm form = new LogsAcessoForm();
		LogsAcessoListar listador = new LogsAcessoListar();
		  while (true) {
	            System.out.println("1 - Registrar Logs");
	            System.out.println("2 - Listar Logs");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int op = scanner.nextInt();
	            scanner.nextLine(); 

	            if (op == 1) {
	                form.RegistrarLogsAcesso(scanner);
	            } else if (op == 2) {
	                listador.listarLogsAcesso(form);
	            } else if (op == 0) {
	                System.out.println("Encerrando...");
	                break;
	            } else {
	                System.out.println("Opção inválida.");
	            }
	        }
	}
	
public void RegistrarLogsAcesso (Scanner scanner) {
		 System.out.println("Informe o nome do usuário:");
		    usuarios.add(scanner.nextLine());

		    System.out.println("Informe a ação:");
		    acoes.add(scanner.nextLine());

		    System.out.println("Informe a data e hora:");
		    datahoras.add(scanner.nextLine());
		 
		    String novoId = String.valueOf(ids.size() + 1);
		    ids.add(novoId);
	} 
}
