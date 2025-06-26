package views.Clientes;
import java.util.Scanner;
import java.util.ArrayList;
public class ClientesForm {
	public ArrayList<String> cpfs = new ArrayList<>();
    public ArrayList<String> ids = new ArrayList<>();
    public ArrayList<String> nomes = new ArrayList<>();
    public ArrayList<String> emails = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClientesForm form = new ClientesForm();
		ClientesListar listador = new ClientesListar();
		
		while (true) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int op = scanner.nextInt();
            scanner.nextLine(); 
            if (op == 1) {
                form.CadastrarCliente(scanner);
            }  else if (op == 2) {
           	 listador.listarClientes(form);
                break;
            } else {
                System.out.println("Opção inválida");
          }
      }
	}
	public void CadastrarCliente(Scanner scanner) {
		
		System.out.println("Escreva seu CPF: ");
		cpfs.add(scanner.nextLine());
	
		System.out.println("Escreva seu Nome: ");
		nomes.add(scanner.nextLine());
	
		System.out.println("Escreva seu Email: ");
		emails.add(scanner.nextLine());
		   // isso aqui gera um id sequecial somando 1 ao proxímo na sequência
		  String novoId = String.valueOf(ids.size() + 1);
	        ids.add(novoId);
	        System.out.println("Cadastro realizado com ID" + novoId);
	
	}
}
