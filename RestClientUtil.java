package com.ubk.bank.money.transfer.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClientUtil {

    private final RestTemplate restTemplate;

    @Autowired
    public RestClientUtil(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> T getForObject(String url, Class<T> responseType) {
        return restTemplate.getForObject(url, responseType);
    }

    public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType) {
        return restTemplate.getForEntity(url, responseType);
    }

    public <T> T postForObject(String url, Object request, Class<T> responseType) {
        return restTemplate.postForObject(url, request, responseType);
    }

    public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType) {
        return restTemplate.postForEntity(url, request, responseType);
    }

    public void put(String url, Object request) {
        restTemplate.put(url, request);
    }

    public void delete(String url) {
        restTemplate.delete(url);
    }
}
