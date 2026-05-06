package main.java;

public class PolicialMilitarCoronel extends PolicialMilitar {

    public PolicialMilitarCoronel(PolicialMilitar superior) {
        listaOcorrencias.add(TipoOcorrenciaHomicidio.getTipoOcorrenciaHomicidio());
        setMilitarSuperior(superior);
    }

    public String getPatente() {
        return "Coronel PM";
    }

}
