package model;

import java.util.Date;

public class Locacao {

    private Integer id;
    private Cliente cliente;
    private Filme filme;
    private Date dataLocacao;
    private Date dataDevolucao;
    private String status;

    @Override
    public String toString() {
        return "Id Locação: " + id + "\n Cliente: " + cliente + "\n Filme: " + filme.getTitulo() + "\n Informação: " + filme.getInformacao()
                + "\n Data de Locação: " + dataLocacao + "\n Data de Devolução: " + dataDevolucao +"\n ";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
