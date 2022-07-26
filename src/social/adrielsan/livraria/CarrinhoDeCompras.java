package social.adrielsan.livraria;

import social.adrielsan.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras(Produto[] produtos){
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }
}
