package com.italo;

//* Essa é a Classe concreta da Implementação da Estratégia com o Objetivo de Aplicar a Lógica Específica
public class DadosVariáveisAutomatico implements DadosVariáveis {

    @Override
    public void formataDadosVariaveis(Proposta proposta) {
        System.out.println("Recuperando Dados Variáveis de Crediario: " + proposta.getProduto());
    }
}
