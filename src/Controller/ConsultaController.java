package Controller;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.PlanoDeSaude;

public class ConsultaController {


    /**
     * Registra paciente
     * @param nome nome do paciente
     * @param telefoneContato telefone para contato
     * @return retorna paciente.
     */
    public Paciente cadastraPaciente(String nome, String telefoneContato){
        Paciente paciente = new Paciente();
        paciente.setNome(nome);
        paciente.setTelefone(telefoneContato);
        return paciente;
    }

    /**
     * Completa Registro do paciente
     * @param paciente paciente a ser completado o registro
     * @param dataNascimento data de nascimento
     * @param endereco endereco
     * @param profissao profissao
     * @return paciente com registros.
     */
    public Paciente completaRegistroPaciente(Paciente paciente, String dataNascimento, String endereco, String profissao){
        paciente.setDataNascimento(dataNascimento);
        paciente.setEndereco(endereco);
        paciente.setProfissao(profissao);
        return paciente;
    }

    /**
     * Marca consulta de paciente com um medico que atende um plano de saude.
     * @param paciente paciente que deseja marcar consulta
     * @param medico medico que atenderá a consulta
     * @param data data da consulta
     * @param hora hora da consulta
     * @param planoDeSaude plano de saude
     */
    public void marcarConsultaPlano(Paciente paciente, Medico medico, String data, String hora, PlanoDeSaude planoDeSaude){
        Consulta consulta = new Consulta();
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setDataConsulta(data);
        consulta.setHoraConsulta(hora);
        consulta.setPlanoDeSaude(planoDeSaude);
    }


    /**
     * Cadastra medico
     * @param CRM numero do crm
     * @param especialidade especialidade medico
     * @param planoDeSaude palano que atende
     * @param horaini horario de inicio de atendimento
     * @param horaFim horario fim de atendimento
     * @return medico cadastrado
     */
    public Medico cadastraMedico(Integer CRM, String especialidade, PlanoDeSaude planoDeSaude, String horaini, String horaFim){
        Medico medico = new Medico();
        medico.setCRM(CRM);
        medico.setEspecialidade(especialidade);
        medico.setPlanosConveniados(planoDeSaude.toString());
        medico.setHoraInicio(horaini);
        medico.setHoraFim(horaFim);
        return medico;
    }



    /**
     * Marca consulta com médico sem plano de saude
     * @param paciente
     * @param medico paciente que deseja marcar a consulta
     * @param data data da consulta.
     * @param hora hora da consulta.
     */
    public void marcarConsultaSemPlano(Paciente paciente, Medico medico, String data, String hora){
        Consulta consulta = new Consulta();
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setDataConsulta(data);
        consulta.setHoraConsulta(hora);
    }

    /**
     * Verifica se é a primeira consulta do paciente, se a lista de consultas estiver vazia retornará true se não retornará false
     * @param paciente paciente que deseja verficar
     * @return retorna um valor booleano
     */
    private boolean verificaPrimeiraVezPaciente(Paciente paciente) {
        if (paciente.getNumeroConsultas().equals(0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param paciente paciente
     * @param queixas queixa do paciente.
     */
    public void registrarQueixasPaciente(Paciente paciente,String queixas){
        Consulta consulta = new Consulta();
        consulta.setObservacaoQueixas(queixas);
        paciente.setConsulta(consulta);
    }

    /**
     * Registra medicamento e exames do paciente
     * @param paciente paciente
     * @param medicamenosExames observações de medicamentos e exames.
     */
    public void registrarMedicamentosExamesPaciente(Paciente paciente, String medicamenosExames){
        Consulta consulta = new Consulta();
        consulta.setObeservacaoExames(medicamenosExames);
        paciente.setConsulta(consulta);
    }

    /**
     * Registra resposta do tratamento do paciente
     * @param paciente paciente
     * @param respostaTratamento observação de resposta ao tratamento.
     */
    public void registrarRespostaTratamentoPaciente(Paciente paciente, String respostaTratamento){
        Consulta consulta = new Consulta();
        consulta.setObservacaoRespostasTratamento(respostaTratamento);
        paciente.setConsulta(consulta);
    }

    /**
     * Consulta queixas paciente
     * @param paciente paciente
     * @return retorna as queixas do paciente.
     */
    public String consultarInformacoesQueixasPaciente(Paciente paciente){
        return paciente.getConsulta().getObservacaoQueixas();
    }

    /**
     * Consulta informações de medicamento e exames do paciente
     * @param paciente paciente
     * @return retorna as observaçoes de meicamentos e exames.
     */
    public String consultarInformacoesMedicamentosExames(Paciente paciente){
        return paciente.getConsulta().getObeservacaoExames();
    }

    /**
     * Consulta Informações de tratamento de paciente
     * @param paciente paciente
     * @return retorna as observações de tratamento do paciente.
     */
    public String consultarInformacoesTratamentoPaciente(Paciente paciente){
        return paciente.getConsulta().getObservacaoRespostasTratamento();
    }
}
