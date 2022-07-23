package social.adrielsan.livraria.produtos;

import social.adrielsan.livraria.Autor;
import social.adrielsan.livraria.Livro;

public class Ebook extends Livro implements Promocional {
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
        this.setImpresso(false);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.15){
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no social.adrielsan.livaria.produtos.Ebook");
        return true;
    }
}
