package views.EstoqueMovimentacao;

public class EstoqueMovimentacaoListar {

	public void listarMovimentacoes(EstoqueMovimentacaoForm form) {
		  if (form.ids.isEmpty()) {
	            System.out.println("Nenhuma movimentação registrada.");
	            return;
	        }

	        System.out.println("\n--- Movimentações de Estoque ---");
	        for (int i = 0; i < form.ids.size(); i++) {
	            System.out.println("Movimentação " + (i + 1));
	            System.out.println("ID: " + form.ids.get(i));
	            System.out.println("Produto: " + form.produtos.get(i));
	            System.out.println("Quantidade: " + form.quantidades.get(i));
	            System.out.println("Tipo: " + form.tipos.get(i));
	            System.out.println("-----------------------------");
	        }
	  
		
	}

}
