package com.fisopapp.fisop.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


public class CieloApiService {
    private HardCodedSecretsService secrets = new HardCodedSecretsService();
    private List<Object> orders = new ArrayList<Object>();

    public List<Object> getAllOrders() throws IOException {
        String keys[] = secrets.getConfig();

        URL endpoint = new URL(keys[3]);
        HttpsURLConnection httpsConnection = (HttpsURLConnection)endpoint.openConnection();
        httpsConnection.setRequestProperty("client-id", keys[0]);
        httpsConnection.setRequestProperty("access-token", keys[1]);
        httpsConnection.setRequestProperty("Merchant-Id", keys[2]);
        httpsConnection.setRequestProperty("Content-Type", "application/json");

        if (httpsConnection.getResponseCode() == 200) {
            // Success
            // Further processing here
        } else {
            // Error handling code goes here
        }

        return new ArrayList<Object>();
    }
}
