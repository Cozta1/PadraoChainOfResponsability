package main.java;

public class TipoOcorrenciaLesaoCorporal implements TipoOcorrencia {

    private static TipoOcorrenciaLesaoCorporal tipoOcorrenciaLesaoCorporal = new TipoOcorrenciaLesaoCorporal();

    private TipoOcorrenciaLesaoCorporal() {};

    public static TipoOcorrenciaLesaoCorporal getTipoOcorrenciaLesaoCorporal() {
        return tipoOcorrenciaLesaoCorporal;
    }

}
