package views.Produtos;
import java.util.ArrayList;
public class ProdutosListar {

	public void ProdutosListar(ProdutosForm form) {
		 if (form.ids.isEmpty()) {
	            System.out.println("Nenhum Produto foi registrado.");
	            return;
	        }

	        System.out.println("\n--- Produtos ---");
	        for (int i = 0; i < form.ids.size(); i++) {
	            System.out.println("Produto: " + (i + 1));
	            System.out.println("ID: " + form.ids.get(i));
	            System.out.println("Nome do Produto: " + form.nomes.get(i));
	            System.out.println("O valor do Produto: " + form.valores.get(i));
	            System.out.println("Descrição do Produto: " + form.descricoes.get(i));
	            System.out.println("-----------------------------");
	        }
	
		
	}

	

}
