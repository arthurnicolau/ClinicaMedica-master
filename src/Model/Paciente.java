package Model;

import java.util.List;

public class Paciente extends Pessoa {
    private String dataNascimento,profissao, endereco;
    private Integer numeroConsultas=0;
    private Consulta consulta;

    public Integer getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(Integer numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
