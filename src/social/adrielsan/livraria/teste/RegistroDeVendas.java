package social.adrielsan.livraria.teste;

import social.adrielsan.livraria.produtos.Ebook;
import social.adrielsan.livraria.produtos.LivroFisico;
import social.adrielsan.livraria.Autor;
import social.adrielsan.livraria.CarrinhoDeCompras;
import social.adrielsan.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new Produto[10]);

        carrinho.adiciona(fisico);
        if (fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora eh " + fisico.getValor());
        }
        carrinho.adiciona(ebook);

        List<Produto> produtos = carrinho.getProdutos();

        for (Produto produto: produtos){
            System.out.println(produto.getValor());
        }

        System.out.println("Total: " + carrinho.getTotal());
    }
}
