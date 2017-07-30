package com.fisopapp.fisop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.fisopapp.fisop.services.CieloApiService;
import com.fisopapp.fisop.services.HardCodedSecretsService;

import org.json.JSONArray;
import org.json.JSONObject;

import cielo.orders.domain.Credentials;
import cielo.sdk.order.OrderManager;

public class Analisis extends AppCompatActivity {

    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
        TextView txtMsg = (TextView)findViewById(R.id.txtMsg);

        // Cielo LIO config
        String[] secrests = (new HardCodedSecretsService()).getConfig();
        Credentials credentials = new Credentials(secrests[0], secrests[1]);
        OrderManager orderManager = new OrderManager(credentials, this.getBaseContext());
        orderManager.retrieveOrders(12, 89900);

        try {
            Thread.sleep(6000);
            txtMsg.setText("Aprovado!");
        } catch (InterruptedException e) {
            txtMsg.setText("Não Aprovado!");
        }

//        try {
//            CieloApiService cieloApiService = new CieloApiService();
//
//            JSONArray json = cieloApiService.getAllOrders();
//            JSONObject trendList = json.getJSONObject(0);
//            JSONArray transactionsArray = trendList.getJSONArray("transaction");
//            JSONObject transaction;
//            this.total = 0.0;
//
//            for (int i = 0; i < transactionsArray.length(); i++) {
//                transaction = new JSONObject(transactionsArray.getString(i));
//
//                if(transaction.getString("status").equals("CONFIRMED")) {
//                    this.total += Double.parseDouble(transaction.getString("amount"));
//                }
//            }
//
//            txtMsg.setText("_/_");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

    }
}
