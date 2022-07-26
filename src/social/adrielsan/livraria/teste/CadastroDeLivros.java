package social.adrielsan.livraria.teste;

import social.adrielsan.livraria.Livro;
import social.adrielsan.livraria.produtos.LivroFisico;
import social.adrielsan.livraria.Autor;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.urini@caelum.com.br");
        autor.setCpf("123.456.789.10-1");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Pratico");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("799837242342304823");

        System.out.println(livro);

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10-2");

        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Logica de Programacao");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("799837242342304824");

        System.out.println(outroLivro);
    }
}
