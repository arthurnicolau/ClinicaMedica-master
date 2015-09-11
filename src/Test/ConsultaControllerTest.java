package Test;

import Controller.ConsultaController;
import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.PlanoDeSaude;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ConsultaControllerTest {

    private ConsultaController consultaController = new ConsultaController();

    @Test
    public void testConsultarInformacoesTratamentoPaciente() {
        ConsultaController consultaController = new ConsultaController();
        Paciente paciente =new Paciente();
        Consulta consulta = new Consulta();
        consulta.setObservacaoRespostasTratamento("bom");
        paciente.setNome("Arthur");
        paciente.setConsulta(consulta);
        String resultado = consultaController.consultarInformacoesTratamentoPaciente(paciente);
        assertEquals(consulta.getObservacaoRespostasTratamento(),resultado);
    }

    @Test
    public void consultarInformacoesMedicamentosExamesTest(){
        Paciente paciente =new Paciente();
        Consulta consulta = new Consulta();
        consulta.setObeservacaoExames("Paracetamol");
        paciente.setNome("Arthur");
        paciente.setConsulta(consulta);
        assertEquals(consultaController.consultarInformacoesMedicamentosExames(paciente), consulta.getObeservacaoExames());
    }

    @Test
    public void consultarInformacoesQueixasPacienteTest(){
        Paciente paciente =new Paciente();
        Consulta consulta = new Consulta();
        consulta.setObservacaoQueixas("Dor de cabeça");
        paciente.setNome("Arthur");
        paciente.setConsulta(consulta);
        assertEquals(consultaController.consultarInformacoesQueixasPaciente(paciente),consulta.getObservacaoQueixas());
    }

    @Test
    public void registrarRespostaTratamentoPacienteTest(){
        Paciente paciente =new Paciente();
        paciente.setNome("Arthur");
        String respostaTraamento = "muito bem";
        consultaController.registrarRespostaTratamentoPaciente(paciente,respostaTraamento);
        assertEquals(paciente.getConsulta().getObservacaoRespostasTratamento(),respostaTraamento);
    }

    @Test
    public void registrarMedicamentosExamesPacienteTest(){
        Paciente paciente =new Paciente();
        paciente.setNome("Arthur");
        String medicamentos = "paracetamol";
        consultaController.registrarMedicamentosExamesPaciente(paciente, medicamentos);
        assertEquals(paciente.getConsulta().getObeservacaoExames(),medicamentos);
    }

    @Test
    public void registrarQueixasPacienteTest(){
        Paciente paciente =new Paciente();
        paciente.setNome("Arthur");
        String queixa = "Dor de Cabeça";
        consultaController.registrarQueixasPaciente(paciente, queixa);
        assertEquals(paciente.getConsulta().getObservacaoQueixas(),queixa);
    }

    @Test
    public void cadastraPacienteTest(){
        Paciente paciente = new Paciente();
        paciente.setNome("Arthur");
        paciente.setTelefone("333");
        Paciente pacienteResult = consultaController.cadastraPaciente("Arthur", "333");
        assertEquals(pacienteResult.getNome(),paciente.getNome());
    }

    @Test
    public void completaRegistroPacienteTest(){
        Paciente paciente = new Paciente();
        paciente.setNome("Arthur");
        paciente.setTelefone("333");
        String data = "30/03/1990";
        String endereco = "ENDERECO";
        String profissao = "desenvolvedor";
        Paciente pacienteResult = consultaController.completaRegistroPaciente(paciente,data,endereco,profissao);
        assertEquals(pacienteResult.getDataNascimento(),data);
        assertEquals(pacienteResult.getEndereco(),endereco);
        assertEquals(pacienteResult.getProfissao(),profissao);
    }

    @Test
    public void cadastraMedicoTest(){
        Integer CRM = 123;
        String especialidade = "cirurgião";
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setNome("samp");
        String horaini = "10horas";
        String horaFim = "16horas";
        Medico medico = consultaController.cadastraMedico(CRM,especialidade,planoDeSaude,horaini,horaFim);
        assertEquals(medico.getCRM(),CRM);
        assertEquals(medico.getEspecialidade(),especialidade);
    }



}