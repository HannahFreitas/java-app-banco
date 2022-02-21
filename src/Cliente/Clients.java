package Cliente;

public abstract class Clients {

    protected String nome;
    protected String email;
    
    

    public Clients(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Clients{" +
                "nome='" + nome  + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
