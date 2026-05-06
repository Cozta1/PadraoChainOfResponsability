package main.java;

public class TipoOcorrenciaCrimeFederal implements TipoOcorrencia {

    private static TipoOcorrenciaCrimeFederal tipoOcorrenciaCrimeFederal = new TipoOcorrenciaCrimeFederal();

    private TipoOcorrenciaCrimeFederal() {};

    public static TipoOcorrenciaCrimeFederal getTipoOcorrenciaCrimeFederal() {
        return tipoOcorrenciaCrimeFederal;
    }
}
