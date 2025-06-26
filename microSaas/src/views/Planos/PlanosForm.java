package views.Planos;
import java.util.Scanner;
import java.util.ArrayList;

public class PlanosForm {
	public ArrayList<String> ids = new ArrayList<>();
	public ArrayList<String> nomes = new ArrayList<>();
	public ArrayList<Double> valores = new ArrayList<>();
	public ArrayList<String> descricoes = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PlanosForm form = new PlanosForm();
		PlanosListar listador = new PlanosListar();
		
		while (true) {
            System.out.println("1 - Cadastrar Planos");
            System.out.println("2 - Listar Planos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            if (op == 1) {
                form.CadastrarPlanos(scanner);
            } else if (op == 2) {
                listador.listarPlanos(form);
            } else if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
	}

	public void CadastrarPlanos(Scanner scanner) {
		
		System.out.println("Escreva o nome do plano: ");
		nomes.add(scanner.nextLine());
		
		System.out.println("Escreva o valor do plano: ");
		valores.add(scanner.nextDouble());
		
		System.out.println("Escreva a descrição do plano");
		descricoes.add(scanner.nextLine());
		
		String novoId = String.valueOf(ids.size() + 1);
	    ids.add(novoId);
		
	}

}
