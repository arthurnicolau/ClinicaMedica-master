package Model;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String dataConsulta,HoraConsulta;
    private String ObservacaoQueixas, ObeservacaoExames, ObservacaoRespostasTratamento;
    private PlanoDeSaude planoDeSaude;

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return HoraConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        HoraConsulta = horaConsulta;
    }

    public String getObservacaoQueixas() {
        return ObservacaoQueixas;
    }

    public void setObservacaoQueixas(String observacaoQueixas) {
        ObservacaoQueixas = observacaoQueixas;
    }

    public String getObeservacaoExames() {
        return ObeservacaoExames;
    }

    public void setObeservacaoExames(String obeservacaoExames) {
        ObeservacaoExames = obeservacaoExames;
    }

    public String getObservacaoRespostasTratamento() {
        return ObservacaoRespostasTratamento;
    }

    public void setObservacaoRespostasTratamento(String observacaoRespostasTratamento) {
        ObservacaoRespostasTratamento = observacaoRespostasTratamento;
    }
}
