package main.java;

public class PolicialMilitarSoldado extends PolicialMilitar {

    public PolicialMilitarSoldado(PolicialMilitar superior) {
        listaOcorrencias.add(TipoOcorrenciaPerturbacaoOrdem.getTipoOcorrenciaPerturbacaoOrdem());
        setMilitarSuperior(superior);
    }

    public String getPatente() {
        return "Soldado PM";
    }

}
