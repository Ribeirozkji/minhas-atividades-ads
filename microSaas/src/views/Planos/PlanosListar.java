package views.Planos;

public class PlanosListar {

	public void listarPlanos(PlanosForm form) {
		  if (form.ids.isEmpty()) {
	            System.out.println("Nenhum Plano foi registrado.");
	            return;
	        }

	        System.out.println("\n--- Planos ---");
	        for (int i = 0; i < form.ids.size(); i++) {
	            System.out.println("Planos " + (i + 1));
	            System.out.println("ID: " + form.ids.get(i));
	            System.out.println("Nome do Plano: " + form.nomes.get(i));
	            System.out.println("Valor do Plano: " + form.valores.get(i));
	            System.out.println("Descrição do Plano: " + form.descricoes.get(i));
	            System.out.println("-----------------------------");
	        }
	
		
	}

}
