package com.fisopapp.fisop.services;


public class HardCodedSecretsService {
    private String clienteId = "mvKZV3XCNZj3";
    private String accessToken = "CGFxp2hKZf3m";
    private String merchantId = "a662f0a7-ead4-4e78-a042-94e442048d7c";
    private String devBaseUrl = "https://api.cielo.com.br/sandbox-lio/order-management/v1";
    private String prodBaseUrl = "https://api.cielo.com.br/order-management/v1";

    public String[] getConfig() {
        return new String[] { clienteId, accessToken, merchantId, devBaseUrl, prodBaseUrl };
    }
}
