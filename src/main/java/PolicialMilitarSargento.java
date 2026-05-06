package main.java;

public class PolicialMilitarSargento extends PolicialMilitar {

    public PolicialMilitarSargento(PolicialMilitar superior) {
        listaOcorrencias.add(TipoOcorrenciaLesaoCorporal.getTipoOcorrenciaLesaoCorporal());
        setMilitarSuperior(superior);
    }

    public String getPatente() {
        return "Sargento PM";
    }
}
