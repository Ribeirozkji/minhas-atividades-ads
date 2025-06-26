package views.EstoqueMovimentacao;
import java.util.Scanner;
import java.util.ArrayList;
public class EstoqueMovimentacaoForm {
	 	public ArrayList<String> ids = new ArrayList<>();
	    public ArrayList<String> produtos = new ArrayList<>();
	    public ArrayList<Integer> quantidades = new ArrayList<>();
	    public ArrayList<String> tipos = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   EstoqueMovimentacaoForm form = new EstoqueMovimentacaoForm();
	       EstoqueMovimentacaoListar listador = new EstoqueMovimentacaoListar();
	        while (true) {
	            System.out.println("\n1 - Cadastrar Movimentação");
	            System.out.println("2 - Listar Movimentações");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int op = scanner.nextInt();
	            scanner.nextLine(); 

	            if (op == 1) {
	                form.cadastrarMovimentacao(scanner);
	            } else if (op == 2) {
	                listador.listarMovimentacoes(form);
	            } else if (op == 0) {
	                System.out.println("Encerrando...");
	                break;
	            } else {
	                System.out.println("Opção inválida.");
	            }
	        }
	}
	public void cadastrarMovimentacao(Scanner scanner) {
		System.out.println("Informe o nome do produto:");
        produtos.add(scanner.nextLine());

        System.out.println("Informe a quantidade:");
        quantidades.add(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Informe o tipo (entrada/saida):");
        tipos.add(scanner.nextLine().toLowerCase());

        String novoId = String.valueOf(ids.size() + 1);
        ids.add(novoId);
		
	}

}
