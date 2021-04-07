package com.italo;

//*Essa classe é o Contexto, no caso ações de gerar o comprovante
public abstract class Comprovante {

    //*Essa é interface de aplicação da estratégia, é onde ocorrem variações de lógica
    //*Será sempre o comportamento que não é comum
    DadosVariáveis dadosVariáveis;

    //* Comportamento exclusivo da Classe, deve ser implementado uma lógica para cada tipo de proposta de crediário
    //* Aqui eu delego esse comportamento exclusivo para ser implementado
    public void formatarDadosVariaveis(Proposta proposta){
        dadosVariáveis.formataDadosVariaveis(proposta);
    }

    //* Comportamento Comum da Classe
    //*  Deve atender qualquer crediário
    public void formatarDadosFixos(Proposta proposta){
        System.out.println("Formatando Dados Fixos!");
    }

    //* Comportamento Comum da Classe
    //* Após recuperar os dados deve chamar o T3 com a parte fixa e a parte variável
    public void chamarT3(){
        System.out.println("Estou chamando o T3!");
    }

}
