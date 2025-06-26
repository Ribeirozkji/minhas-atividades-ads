package views.assinaturas;
import java.util.Scanner;
import java.util.ArrayList;
public class AssinaturaForm {
	public ArrayList<String> nomes = new ArrayList<>();
    public ArrayList<String> planos = new ArrayList<>();
    public ArrayList<Double> valores = new ArrayList<>();
    public ArrayList<String> datas = new ArrayList<>();
	
    
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         AssinaturaForm form = new AssinaturaForm();
         AssinaturaListar listador = new AssinaturaListar(); 
      
         
         while (true) {
             System.out.println("1 - Cadastrar");
             System.out.println("2 - Listar");
             System.out.println("0 - Sair");
             System.out.print("Escolha uma opção: ");

             int op = scanner.nextInt();
             scanner.nextLine(); 
             if (op == 1) {
                 form.cadastrar(scanner);
             }  else if (op == 2) {
            	 listador.listar(form);
                 break;
             } else {
                 System.out.println("Opção inválida");
           }
       }
	}
    public void cadastrar(Scanner scanner) {
        System.out.print("Nome do cliente: ");
        nomes.add(scanner.nextLine());

        System.out.print("Plano: ");
        planos.add(scanner.nextLine());

        System.out.print("Valor mensal: ");
        valores.add(scanner.nextDouble());
        scanner.nextLine(); 

        System.out.print("Data de início: ");
        datas.add(scanner.nextLine());

        System.out.println("Cadastro realizado com sucesso\n");
    }
    
    
    
	
		 
	 



}

