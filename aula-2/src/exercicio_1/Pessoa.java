package exercicio_1;

public class Pessoa {
    public String nome;
    public String email;

    public Pessoa(){};

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void logarPessoa(){
        System.out.println("Usuário logado.");
    }

}
