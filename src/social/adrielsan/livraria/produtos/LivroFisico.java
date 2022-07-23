package social.adrielsan.livraria.produtos;

import social.adrielsan.livraria.Livro;
import social.adrielsan.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor){
        super(autor);
        this.setImpresso(true);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no social.adrielsan.livaria.produtos.Livro Fisico");
        return true;
    }
}
