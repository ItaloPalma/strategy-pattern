package com.italo;

public class Main {

    public static void main(String[] args) {


            Proposta proposta = new Proposta("Automático");

            //* Aqui a partir da proposta um factory deveria saber que estamos lidando com um Automático
            //* Então ele sabe que deve acionar a mecânica de Geração de Comprovante de Crediário Automático
            Comprovante comprovante = new ComprovanteCrediarioAutomatico(proposta);

            //* Pode estar dentro de um método gerarComprovante();
            comprovante.formatarDadosVariaveis(proposta);
            comprovante.formatarDadosFixos(proposta);
            comprovante.chamarT3();
    }
}
