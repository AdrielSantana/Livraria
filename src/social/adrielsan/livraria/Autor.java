package social.adrielsan.livraria;

public class Autor {
    String nome;
    String email;
    String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        String mensagem = "\nMostrando detalhes do autor\n";
        mensagem += ("\nNome: " + nome);
        mensagem += ("\nEmail: " + email);
        mensagem += ("\nCPF: " + cpf);
        mensagem += ("\n----------------");
        return mensagem;
    }

    @Override
    public boolean equals(Object obj){

        if(!(obj instanceof Autor)) return false;

        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome);
    }
}
