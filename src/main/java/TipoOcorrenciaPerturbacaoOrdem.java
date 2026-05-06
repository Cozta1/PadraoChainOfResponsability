package main.java;

public class TipoOcorrenciaPerturbacaoOrdem implements TipoOcorrencia {

    private static TipoOcorrenciaPerturbacaoOrdem tipoOcorrenciaPerturbacaoOrdem = new TipoOcorrenciaPerturbacaoOrdem();

    private TipoOcorrenciaPerturbacaoOrdem() {};

    public static TipoOcorrenciaPerturbacaoOrdem getTipoOcorrenciaPerturbacaoOrdem() {
        return tipoOcorrenciaPerturbacaoOrdem;
    }

}
