package main.java;

public class PolicialMilitarTenente extends PolicialMilitar {

    public PolicialMilitarTenente(PolicialMilitar superior) {
        listaOcorrencias.add(TipoOcorrenciaRoubo.getTipoOcorrenciaRoubo());
        setMilitarSuperior(superior);
    }

    public String getPatente() {
        return "Tenente PM";
    }

}
