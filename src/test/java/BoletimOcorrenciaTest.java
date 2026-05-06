package test.java;

import main.java.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletimOcorrenciaTest {

    PolicialMilitarCoronel coronel;
    PolicialMilitarTenente tenente;
    PolicialMilitarSargento sargento;
    PolicialMilitarSoldado soldado;

    @BeforeEach
    void setUp() {
        coronel = new PolicialMilitarCoronel(null);
        tenente = new PolicialMilitarTenente(coronel);
        sargento = new PolicialMilitarSargento(tenente);
        soldado = new PolicialMilitarSoldado(sargento);
    }

    @Test
    void deveRetornarSoldadoParaAtendimentoPerturbacaoOrdem() {
        assertEquals("Soldado PM", soldado.atenderOcorrencia(new BoletimOcorrencia(TipoOcorrenciaPerturbacaoOrdem.getTipoOcorrenciaPerturbacaoOrdem())));
    }

    @Test
    void deveRetornarSargentoParaAtendimentoLesaoCorporal() {
        assertEquals("Sargento PM", soldado.atenderOcorrencia(new BoletimOcorrencia(TipoOcorrenciaLesaoCorporal.getTipoOcorrenciaLesaoCorporal())));
    }

    @Test
    void deveRetornarTenenteParaAtendimentoRoubo() {
        assertEquals("Tenente PM", soldado.atenderOcorrencia(new BoletimOcorrencia(TipoOcorrenciaRoubo.getTipoOcorrenciaRoubo())));
    }

    @Test
    void deveRetornarCoronelParaAtendimentoHomicidio() {
        assertEquals("Coronel PM", soldado.atenderOcorrencia(new BoletimOcorrencia(TipoOcorrenciaHomicidio.getTipoOcorrenciaHomicidio())));
    }

    @Test
    void deveRetornarSemAtendimentoParaAtendimentoCrimeFederal() {
        assertEquals("Sem atendimento", soldado.atenderOcorrencia(new BoletimOcorrencia(TipoOcorrenciaCrimeFederal.getTipoOcorrenciaCrimeFederal())));
    }

}
