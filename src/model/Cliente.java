package model;

import java.util.Date;

public class Cliente extends Pessoa{
    
    private Date dataNascimento;


    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
