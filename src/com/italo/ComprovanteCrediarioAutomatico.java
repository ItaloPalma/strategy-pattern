package com.italo;

//* Essa é a implementação concreta da Classe. Aqui é indicado o comportamento específico e consequentemente
//* as demais ações comuns são reaproveitadas
public class ComprovanteCrediarioAutomatico extends Comprovante {

    public ComprovanteCrediarioAutomatico(Proposta proposta){
        dadosVariáveis = new DadosVariáveisAutomatico();
    }


}
