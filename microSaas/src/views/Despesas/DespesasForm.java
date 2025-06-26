package views.Despesas;
import java.util.Scanner;
import java.util.ArrayList;
public class DespesasForm {
	public ArrayList<String> ids = new ArrayList<>();
    public ArrayList<String> descricaos = new ArrayList<>();
    public ArrayList<Double> valores = new ArrayList<>();
    public ArrayList<String> datas = new ArrayList<>();
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DespesasForm form = new DespesasForm();
		DespesasListar listador = new DespesasListar();
		
		while (true) {
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int op = scanner.nextInt();
            scanner.nextLine(); 
            if (op == 1) {
                form.CadastrarDespesa(scanner);
            }  else if (op == 2) {
           	 listador.listarDespesas(form);
                break;
            } else {
                System.out.println("Opção inválida");
          }
      }
	}
    public void  CadastrarDespesa(Scanner scanner) {
    	
    	System.out.println("Escreva a Descrição: ");
    	descricaos.add(scanner.nextLine());
    	
    	System.out.println("Escreva o valor da Despesa: ");
    	valores.add(scanner.nextDouble());
    	scanner.nextLine();
    	
    	System.out.println("Escreva a data da Despesa: ");
    	datas.add(scanner.nextLine());
    	
    	String novoId = String.valueOf(ids.size() + 1);
    	ids.add(novoId);

    }
}
