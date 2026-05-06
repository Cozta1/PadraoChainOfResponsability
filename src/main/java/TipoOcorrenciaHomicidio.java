package main.java;

public class TipoOcorrenciaHomicidio implements TipoOcorrencia {

    private static TipoOcorrenciaHomicidio tipoOcorrenciaHomicidio = new TipoOcorrenciaHomicidio();

    private TipoOcorrenciaHomicidio() {};

    public static TipoOcorrenciaHomicidio getTipoOcorrenciaHomicidio() {
        return tipoOcorrenciaHomicidio;
    }
}
