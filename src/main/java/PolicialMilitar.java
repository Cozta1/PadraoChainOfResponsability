package main.java;

import java.util.ArrayList;

public abstract class PolicialMilitar {

    protected ArrayList listaOcorrencias = new ArrayList();
    private PolicialMilitar militarSuperior;

    public PolicialMilitar getMilitarSuperior() {
        return militarSuperior;
    }

    public void setMilitarSuperior(PolicialMilitar militarSuperior) {
        this.militarSuperior = militarSuperior;
    }

    public abstract String getPatente();

    public String atenderOcorrencia(BoletimOcorrencia boletim) {
        if (listaOcorrencias.contains(boletim.getTipoOcorrencia())) {
            return getPatente();
        }
        else {
            if (militarSuperior != null) {
                return militarSuperior.atenderOcorrencia(boletim);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}
