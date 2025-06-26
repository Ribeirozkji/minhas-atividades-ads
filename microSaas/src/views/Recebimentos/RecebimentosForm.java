package views.Recebimentos;

import java.util.ArrayList;
import java.util.Scanner;



public class RecebimentosForm {
	public ArrayList<String> ids  = new ArrayList<>();
	public ArrayList<Double> valores = new ArrayList<>();
	public ArrayList<String> datas = new ArrayList<>();
	public ArrayList<String> origens = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RecebimentosForm form = new	RecebimentosForm();
		RecebimentosListar listador = new RecebimentosListar();
		
		
		while (true) {
            System.out.println("1 - Cadastrar Recebimentos");
            System.out.println("2 - Listar Recebimentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            scanner.nextLine(); 

            if (op == 1) {
                form.CadastrarRecebimentos(scanner);
            } else if (op == 2) {
                listador.RecebimentosListar(form);
            } else if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

	}


	public void CadastrarRecebimentos(Scanner scanner) {
		System.out.println("Escreva o Valor do Recebimento: ");
		valores.add(scanner.nextDouble());
		
		System.out.println("Escreva a data do Recebimento: ");
		datas.add(scanner.nextLine());
		scanner.nextLine();
		
		System.out.println("Escreva a Origem do Recebimento");
		origens.add(scanner.nextLine());
		
		String novoId = String.valueOf(ids.size() + 1);
	    ids.add(novoId);
		
	}

}
