package com.faculdade.buspointbackend.domain.dto;

import lombok.Getter;

@Getter
public class ResponseBase<T> {

    public ResponseBase(T objeto) {
        this.sucesso = true;
        this.mensagem = "";
        this.objetoRetorno = objeto;
    }

    public ResponseBase(String message) {
        this.sucesso = false;
        this.mensagem = message;
        this.objetoRetorno = null;
    }

    private boolean sucesso;
    private String mensagem;
    private T objetoRetorno;

}
