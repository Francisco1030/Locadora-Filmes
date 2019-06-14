package model;

public class Cliente  {
    
     private Integer id;
    private String nome;
    private String cpf;
    private Endereco endereco = new Endereco();
    private String telefone;
    
    public Cliente() {

    }


  @Override
    public String toString() {
        return " ID: " + id + "\n NOME: " + nome + "\n CPF: " + cpf + "\n " + endereco + "\n TELEFONE: " + telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
