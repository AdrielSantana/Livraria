package social.adrielsan.livraria.teste;

import social.adrielsan.livraria.Autor;
import social.adrielsan.livraria.ComparadorPorNome;
import social.adrielsan.livraria.Livro;
import social.adrielsan.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class NovidadesDoJava8 {
    public static void main(String[] args){
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java 0.0");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Pratico");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

        Stream<Livro> stream = livros.stream();

        stream.filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));

    }
}