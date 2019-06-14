package model;

public class Endereco {

    private String rua;
    private String numero;
    private String cidade;


    @Override
    public String toString() {
        return " RUA: " + rua + "\n Nº: " + numero +  "\n CIDADE: " + cidade; 
    }

     
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
