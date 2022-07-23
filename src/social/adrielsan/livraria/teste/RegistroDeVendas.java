package social.adrielsan.livraria.teste;

import social.adrielsan.livraria.produtos.Ebook;
import social.adrielsan.livraria.produtos.LivroFisico;
import social.adrielsan.livraria.Autor;
import social.adrielsan.livraria.CarrinhoDeCompras;

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

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        if (fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora eh " + fisico.getValor());
        }
        carrinho.adiciona(ebook);



        System.out.println("Total: " + carrinho.getTotal());
    }
}
