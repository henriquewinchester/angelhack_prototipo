package com.fisopapp.fisop.services;

import android.os.AsyncTask;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class CieloApiService {
    private final String BASE_URL = "https://api.cielo.com.br/order-management/v1/orders";
    private List<Object> orders = new ArrayList<Object>();

    public List<Object> getAllOrders() {

//        AsyncTask.execute(new Runnable() {
//            @Override
//            public void run() {
//                URL endpoint = URL;
//                HttpsURLConnection apiConnection = (HttpsURLConnection) endpoint.openConnection();
//        });

        return new ArrayList<Object>();
    }

}
