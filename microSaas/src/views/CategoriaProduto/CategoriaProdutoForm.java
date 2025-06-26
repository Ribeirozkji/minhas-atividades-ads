package views.CategoriaProduto;
import java.util.Scanner;
import java.util.ArrayList;

public class CategoriaProdutoForm {
	public ArrayList<String> ids = new ArrayList<>();
    public ArrayList<String> nomes = new ArrayList<>();
    public ArrayList<Double> quantidades = new ArrayList<>();
    public ArrayList<String> categorias = new ArrayList<>();
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CategoriaProdutoForm form =new CategoriaProdutoForm();
		CategoriaProdutoListar listador = new CategoriaProdutoListar(); 
		 
		while (true) {
             System.out.println("1 - Cadastrar");
             System.out.println("2 - Listar");
             System.out.println("0 - Sair");
             System.out.print("Escolha uma opção: ");

             int op = scanner.nextInt();
             scanner.nextLine(); 
             if (op == 1) {
                 form.CadastrarProduto(scanner);
             }  else if (op == 2) {
            	 listador.listar(form);
                 break;
             } else {
                 System.out.println("Opção inválida");
           }
       }

	}
		public void CadastrarProduto(Scanner scanner) {
			System.out.println("Informe o id do produto: ");
			ids.add(scanner.nextLine());
			
			System.out.println("Informe o nome do produto: ");
			nomes.add(scanner.nextLine());
			
			System.out.println("Informe a quantidade de produto:");
			quantidades.add(scanner.nextDouble());
			scanner.nextLine();
			
			System.out.println("Informe a categoria do produto:");
			categorias.add(scanner.nextLine());
			
			
		}
}
