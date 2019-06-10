package model;

public abstract class Pessoa {

    private Integer id;
    private String nome;
    private String cpf;
    private Endereco endereco = new Endereco();
    private String telefone;

    public Pessoa() {

    }
//
//    public Pessoa(Integer id, String nome, String cpf, String rua, String numero, String complemento, String cidade, String estado, String cep, String telefone) {
//        this.id = id;
//        this.nome = nome;
//        this.cpf = cpf;
//        this.endereco.setRua(rua);
//        this.endereco.setNumero(numero);
//        this.endereco.setComplemento(complemento);
//        this.endereco.setCidade(cidade);
//        this.endereco.setEstado(estado);
//        this.endereco.setCep(cep);
//        this.telefone = telefone;
//    }
//
//    public Pessoa(String nome, String cpf, String rua, String numero, String complemento, String cidade, String estado, String cep, String telefone) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.endereco.setRua(rua);
//        this.endereco.setNumero(numero);
//        this.endereco.setComplemento(complemento);
//        this.endereco.setCidade(cidade);
//        this.endereco.setEstado(estado);
//        this.endereco.setCep(cep);
//        this.telefone = telefone;
//    }

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
