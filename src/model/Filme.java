package model;

public class Filme {

    private Integer id;
    private String titulo;
    private String genero;
    private String informacao;
    private Integer disponivel;
    private Integer quantidade;
    private Double valor;

    public Filme() {
    }

    public Filme(String titulo, String genero, String informacao, Integer disponivel, Integer quantidade, Double valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.informacao = informacao;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Filme(Integer id, String titulo, String genero, String informacao, Integer disponivel, Integer quantidade, Double valor) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.informacao = informacao;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public Integer getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Integer disponivel) {
        this.disponivel = disponivel;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
