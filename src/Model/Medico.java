package Model;

public class Medico extends Pessoa {
    private Integer CRM;
    private String especialidade;
    private String planosConveniados;
    private String horaInicio, horaFim;

    public String getHoraFim() {
        return horaFim;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public Integer getCRM() {
        return CRM;
    }

    public void setCRM(Integer CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getPlanosConveniados() {
        return planosConveniados;
    }

    public void setPlanosConveniados(String planosConveniados) {
        this.planosConveniados = planosConveniados;
    }
}
