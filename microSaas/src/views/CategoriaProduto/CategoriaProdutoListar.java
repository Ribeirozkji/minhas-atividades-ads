package views.CategoriaProduto;
import java.util.ArrayList;
public class CategoriaProdutoListar {
	public void listar(CategoriaProdutoForm form) {
        if (form.nomes.isEmpty()) {
            System.out.println("Nenhum Produto cadastrado.\n");
            return;
        }
        for (int i = 0; i < form.nomes.size(); i++) {
            System.out.println("Produto " + (i + 1));
            System.out.println("ID: " + form.ids.get(i));
            System.out.println("Nome: " + form.nomes.get(i));
            System.out.println("Quantidade: " + form.quantidades.get(i));
            System.out.println("Categoria: " + form.categorias.get(i));
            System.out.println("------------------");
        }

}

}
