package model;

public class Filme {

    private Integer id;
    private String titulo;
    private String genero;
    private String informacao;
    private String disponivel;
    private Integer quantidade;
    private Double valor;

    public Filme() {
    }

    public Filme(String titulo, String genero, String informacao, Integer quantidade, Double valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.informacao = informacao;
        this.quantidade = quantidade;
        this.valor = valor;
        filmeDisponivel();
    }

    public Filme(Integer id, String titulo, String genero, String informacao, Integer quantidade, Double valor) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.informacao = informacao;
        this.quantidade = quantidade;
        this.valor = valor;
        filmeDisponivel();
    }

    @Override
    public String toString() {
        return " ID: " + id + "\n TITULO: " + titulo + "\n GENERO: " + genero + "\n INFORMAÇÃO: " + informacao
                + "\n DISPONIVEL: " + disponivel + "\n QUANTIDADE: " + quantidade + "\n VALOR: " + valor
                + "\n -------------------------------\n";
    }

    public void filmeDisponivel() {
        if (this.quantidade > 0) {
            this.disponivel = "Filme disponivel";

        } else if (quantidade <= 0) {
            this.disponivel = "Filme indisponivel";

        }
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

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
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
