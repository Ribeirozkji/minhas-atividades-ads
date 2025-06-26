package views.Produtos;
import java.util.Scanner;



import java.util.ArrayList;
public class ProdutosForm {
	public ArrayList<String> ids = new ArrayList<>();
	public ArrayList<String> nomes = new ArrayList<>();
	public ArrayList<Double> valores = new ArrayList<>();
	public ArrayList<String> descricoes = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProdutosForm form = new ProdutosForm();
		ProdutosListar listador = new ProdutosListar();
		
		while (true) {
            System.out.println("1 - Cadastrar Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            if (op == 1) {
                form.CadastrarProduto(scanner);
            } else if (op == 2) {
                listador.ProdutosListar(form);
            } else if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

	}
	public void CadastrarProduto(Scanner scanner) {
		System.out.println("Escreva o nome do produto: ");
		nomes.add(scanner.nextLine());
		
		System.out.println("Escreva o valor do produto: ");
		valores.add(scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Escreva a descrição do produto");
		descricoes.add(scanner.nextLine());
		
		String novoId = String.valueOf(ids.size() + 1);
	    ids.add(novoId);
	}
	
}
