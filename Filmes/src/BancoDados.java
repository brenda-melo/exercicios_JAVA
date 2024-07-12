import java.util.List;
import java.util.Scanner;

public class BancoDados {
    
	static Scanner teclado = new Scanner(System.in);
	
    public static void main(String[] args) {
        
    	int opcao;
    	
        System.out.println("Bem-vindo! Escolha uma opção.");
    	System.out.println("1 - Adicionar Filme\n2 - Remover Filme\n3 - Listar Filmes\n4 - Encerrar programa.");
    	opcao = teclado.nextInt();
    	while(opcao != 4) {
    		switch(opcao) {
    		case 1:
    			adicionar();
    			break;
    		case 2:
    			remover();
    			break;
    		case 3:
    			listar();
    			break;
    		default:
    			System.out.println("Opção inválida!");
    			
    		}
    		
    		System.out.println("1 - Adicionar Filme\n2 - Remover Filme\n3 - Listar Filmes\n4 - Encerrar programa.");
    		opcao = teclado.nextInt();
    	}
    	
    	System.out.println("Programa encerrado.");
    	
    }

		public static void adicionar() {
			System.out.println("Titulo do filme:");
			String titulo = teclado.next();
			System.out.println("Ano de lançamento:");
			int ano = teclado.nextInt();
			Filme filme = new Filme();
	    	filme.setTitulo(titulo);
	    	filme.setAno(ano);
	    	new FilmeDAO().cadastrarFilme(filme);
	    	System.out.println("Filme adicionado.");
		}
		
		public static void remover() {
			System.out.println("Id do filme:");
			int id = teclado.nextInt();
			Filme filme = new Filme();
			filme.setId(id);
			new FilmeDAO().removerFilme(filme);
			System.out.println("Filme removido.");
		}
		
		public static void listar() {
			List<Filme> filmes = new FilmeDAO().getFilmes();
			for (Filme filme : filmes) {
				System.out.println("ID: " + filme.getId() + " Titulo: " + filme.getTitulo() + " Ano: " + filme.getAno());
			}
			
		}
}