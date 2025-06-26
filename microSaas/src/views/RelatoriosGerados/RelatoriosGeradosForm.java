package views.RelatoriosGerados;
import java.util.Scanner;

import views.Recebimentos.RecebimentosForm;
import views.Recebimentos.RecebimentosListar;

import java.util.ArrayList;
public class RelatoriosGeradosForm {
	public ArrayList<String> ids  = new ArrayList<>();
	public ArrayList<Double> tipos = new ArrayList<>();
	public ArrayList<String> datahoras = new ArrayList<>();
	public ArrayList<String> responsaveis = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RelatoriosGeradosForm form = new	RelatoriosGeradosForm();
		RelatoriosGeradosListar listador = new RelatoriosGeradosListar();
	
		while (true) {
            System.out.println("1 - Cadastrar Recebimentos");
            System.out.println("2 - Listar Recebimentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            if (op == 1) {
                form.RelatoriosGerados(scanner);
            } else if (op == 2) {
                listador.RelatoriosGerados(form);
            } else if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
	
	}


	public void RelatoriosGerados(Scanner scanner) {
		System.out.println("Escreva o Tipo do relatório: ");
		tipos.add(scanner.nextDouble());
		
		System.out.println("Escreva a data do Relatório: ");
		datahoras.add(scanner.nextLine());
		scanner.nextLine();
		
		System.out.println("Informe o responsável do Relatório");
		responsaveis.add(scanner.nextLine());
		
		String novoId = String.valueOf(ids.size() + 1);
	    ids.add(novoId);
		
	}

}
