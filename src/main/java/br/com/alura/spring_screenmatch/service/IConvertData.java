package br.com.alura.spring_screenmatch.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> clazz);
}
