package social.adrielsan.livraria;

import social.adrielsan.livraria.exception.AutorNuloException;
import social.adrielsan.livraria.produtos.Produto;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }

    public Livro(Autor autor){
//        if (autor == null){
//            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
//        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    boolean temAutor(){
        return this.autor != null;
    }

    @Override
    public String toString(){
        String mensagem = "Mostrando detalhes do livro\n";
        if(this.temAutor()){
            mensagem += ("\nAutor: " + autor.getNome());
        }
        mensagem += ("\nNome: " + nome);
        mensagem += ("\nDescricao: " + descricao);
        mensagem += ("\nValor: " + valor);
        mensagem += ("\nISBN: " + isbn);
        mensagem += ("\n----------------");
        if(this.temAutor()){
            mensagem += autor.toString();
        }
        return mensagem;
    }

    @Override public int compareTo(Produto outro){
        return Double.compare(this.getValor(), outro.getValor());
    }
}
