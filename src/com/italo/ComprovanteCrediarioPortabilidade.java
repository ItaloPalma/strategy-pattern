package com.italo;

//* Essa é a implementação concreta da Classe. Aqui é indicado o comportamento específico e consequentemente
//* as demais ações comuns são reaproveitadas
public class ComprovanteCrediarioPortabilidade extends Comprovante {

    public ComprovanteCrediarioPortabilidade(){
        dadosVariáveis = new DadosVariáveisPortabilidade();
    }

}
