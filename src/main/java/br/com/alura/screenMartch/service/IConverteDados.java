package br.com.alura.screenMartch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
