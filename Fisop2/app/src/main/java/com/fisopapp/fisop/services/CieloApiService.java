package com.fisopapp.fisop.services;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


public class CieloApiService {
    private HardCodedSecretsService secrets = new HardCodedSecretsService();
    private List<Object> orders = new ArrayList<Object>();

    public JSONArray getAllOrders() throws IOException, JSONException {
        // Fuzzy CODE
//        String keys[] = secrets.getConfig();
//
//        URL endpoint = new URL(keys[4]);
//        HttpsURLConnection httpsConnection = (HttpsURLConnection)endpoint.openConnection();
//        httpsConnection.setRequestProperty("client-id", keys[0]);
//        httpsConnection.setRequestProperty("access-token", keys[1]);
//        httpsConnection.setRequestProperty("Merchant-Id", keys[2]);
//        httpsConnection.setRequestProperty("Content-Type", "application/json");
//
//        if (httpsConnection.getResponseCode() == 200) {
//            InputStream responseBody = httpsConnection.getInputStream();
//            InputStreamReader responseBodyReader = new InputStreamReader(responseBody, "UTF-8");
//            JsonReader jsonReader = new JsonReader(responseBodyReader);
//            String data = jsonReader.toString();
//            return data;
//        }
//
//        return "None";

        String theJson = "[\n" +
                "    {\n" +
                "        \"id\": \"3014640f-1483-41ec-ad75-d1161ef3398f\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"PEDIDO APIx\",\n" +
                "        \"status\": \"ENTERED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T23:57:51Z\",\n" +
                "        \"updated_at\": \"2017-07-29T23:57:51Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"4fd63bd1-72ae-4590-a4b1-4e09528341ec\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"61aea321-a506-4987-8ff0-9d79be3c0c7a\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"ca4ea673-d4ae-4698-ab40-b35662b82926\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"727bcef4-35d2-431d-af2a-d6e9db670abb\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"a2605576-01e0-4ab1-bc09-7ede75f2546f\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"PEDIDO APIx\",\n" +
                "        \"status\": \"ENTERED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T23:16:10Z\",\n" +
                "        \"updated_at\": \"2017-07-29T23:16:10Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"5ade55ec-65f5-48fc-a3ce-cdad37c231f1\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"10fb5593-64b0-4db1-8892-7be6bf3e7894\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"20f09daf-5355-4b77-af53-eba2564311f6\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"ae4cc078-46e7-4b10-9e96-f97644e4572d\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"dc1aa3fd-e774-4a7c-a959-b7ebab007a0a\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-06-14T17:59:04Z\",\n" +
                "        \"updated_at\": \"2017-07-29T22:30:15Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"23844dc8-fdfa-4e1d-86c3-42d62322bf72\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"09102582-78f6-421f-bbf4-5c8c56636b9f\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"PEDIDO APIx\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T20:06:35Z\",\n" +
                "        \"updated_at\": \"2017-07-29T22:30:14Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"7bd9044a-fbb6-4b7d-806f-9d62d4e87f9a\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"5e381ba3-0adc-45b9-9fee-76c6f31ebfa5\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"35363a00-4b1f-497f-91e4-c284cb2b8245\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"1fd175ef-0657-47cf-94e4-aaf82de8c379\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"b19a0776-487f-4a05-9a5f-dd6b2a32f4b5\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-06-16T14:13:14Z\",\n" +
                "        \"updated_at\": \"2017-07-29T22:30:12Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"f6998fe1-a213-4891-b473-7f44473a4f2f\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"e7f1c485-a5ff-4717-b3c0-047817843f93\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-06-21T12:19:47Z\",\n" +
                "        \"updated_at\": \"2017-07-29T22:30:12Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"1789772a-efc5-4648-84e4-577dcc1c67ef\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"5e4f972d-5d60-4db1-a2b9-fc92a3f19301\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-07-21T15:23:22Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:24:06Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"dcfd7518-1d44-4660-bf9a-ee4cc3f476c3\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"0521dc9c-c3d9-4f71-a4a6-06e5f190654a\",\n" +
                "        \"number\": \"Pedido #7\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-07-19T21:01:34Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:24:03Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"0d497a33-70d1-4612-8c5c-1a909fde568e\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"0538658e-d51f-4f64-8903-2367729034fc\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-06-30T17:06:42Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:56Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"8b64e37b-11d0-4026-9f9a-349a3b414b37\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"a3c82da1-2bbd-451f-aa20-2575175e75c9\",\n" +
                "                \"external_id\": \"ec6e4967-d6de-4e92-bca6-070c309dbdbd\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311404\",\n" +
                "                \"authorization_code\": \"AJAANH\",\n" +
                "                \"number\": \"878354\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"a2a82e0e-6b89-49f3-872d-20bbae4b8cab\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-25T17:13:35Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:49Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"3ed4fed4-bd9d-45bb-bb61-9c49dda1c0be\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"b19424aa-5308-41ea-8d6b-926bcfa8bd5d\",\n" +
                "                \"external_id\": \"74462.86270923851\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"I04XDE\",\n" +
                "                \"number\": \"736746\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"66e3d918-e468-4307-a20e-db18b6bf9581\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-10T20:00:49Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:47Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"9b9400f8-8a13-4c86-a1b8-12179ed116c1\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"469e2d84-7893-4677-b329-6068a915e9f9\",\n" +
                "                \"external_id\": \"33449.630935384586\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"QJP4PA\",\n" +
                "                \"number\": \"307795\",\n" +
                "                \"amount\": 1,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"c160096d-089e-4e3f-a52f-bfedef3c4e24\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-06-22T16:14:10Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:36Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"fdd328f2-180a-4e5d-9a67-2324117cc685\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"3a1fd409-1e92-4238-b0a8-26b77f386efd\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-06-21T12:58:11Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:32Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"4f223551-1fdc-4760-9335-fe7b74320f48\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"0a293183-2883-46a2-847c-69f090b8c279\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-27T18:47:35Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:12Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"04a2e12d-7cae-4ebf-a9d8-60dee1fd3805\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"c74ecb06-9311-4139-9e86-ceb7062f2dc8\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"PEDIDO APIx\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T18:46:07Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:11Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"f7bd62cf-aa88-49fd-9e13-bf57c7af2389\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"89e06eac-8832-4a09-9430-7f2e8f1f9def\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"5e769b2b-2e99-4e01-ad95-f68f728fc527\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"b67d8d59-e3ea-4218-bbb7-47304157180b\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"cf2cd0e1-3f92-4e7c-9572-6e0348fe7bc7\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"Teste Rafa\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T18:48:24Z\",\n" +
                "        \"updated_at\": \"2017-07-29T19:23:06Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"f5e8747b-33c5-4f29-8818-11041bdaa80b\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"b4989553-4832-4565-b7e1-95dc17d43c5c\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"ff0df000-7cba-4c6d-908f-4357e78fa32d\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"5d198697-115e-434c-8697-fec147f646fd\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"23b82174-cd4d-4119-b8c0-ba0355f5abfc\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 20,\n" +
                "        \"created_at\": \"2017-07-29T17:21:33Z\",\n" +
                "        \"updated_at\": \"2017-07-29T17:21:33Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"25d0c72e-8d88-4719-88d4-dd8c37daa6c6\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 20,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"d0cd9dca-562f-4775-899c-f71f132e1dde\",\n" +
                "                \"external_id\": \"62045.69065861736\",\n" +
                "                \"description\": \"DEBITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"381100957\",\n" +
                "                \"authorization_code\": \"347697\",\n" +
                "                \"number\": \"824447\",\n" +
                "                \"amount\": 20,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************9456\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"5332e3af-c270-45ed-90f8-ec92460b2057\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"PEDIDO APIx\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-28T13:46:42Z\",\n" +
                "        \"updated_at\": \"2017-07-29T17:07:11Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"63a36e55-db31-4f0b-ae60-36c5f715b0a3\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"d865c08c-1d80-465c-943f-71b8fa7a393f\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"faf5c31a-58c6-48c7-b9d3-49730e0331fc\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"9e323c66-7903-4bd5-be2d-d22aee36da28\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"15dcd944-a773-47da-ba05-641dc1bfd27e\",\n" +
                "        \"number\": \"0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6\",\n" +
                "        \"reference\": \"Hack Cielo\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"notes\": \"Mesa 1\",\n" +
                "        \"price\": 9155,\n" +
                "        \"created_at\": \"2017-07-29T16:21:10Z\",\n" +
                "        \"updated_at\": \"2017-07-29T16:45:39Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"020bc1ac-f95b-4f94-9349-bbbdb95ac728\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso 2\",\n" +
                "                \"unit_price\": 2005,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"52fc2855-e476-4b55-851e-1a820aa618c4\",\n" +
                "                \"sku\": \"ede8f84a-8b86-45cb-8e57-6a593c25c6ed\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 500,\n" +
                "                \"quantity\": 2,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"7880b402-925c-4d66-b000-c667d1e4346b\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cda8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 1500,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"ebfa2771-0ab7-4324-a7a5-1591883e06e4\",\n" +
                "                \"sku\": \"c2f5fb9a-5542-406e-8b79-17892329cdf8\",\n" +
                "                \"name\": \"Valor avulso\",\n" +
                "                \"unit_price\": 550,\n" +
                "                \"quantity\": 3,\n" +
                "                \"unit_of_measure\": \"EACH\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"09755c87-541e-41e8-83ae-e8069cc450f6\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-27T19:16:28Z\",\n" +
                "        \"updated_at\": \"2017-07-29T15:25:15Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"812458a7-2c4c-4a2b-9e41-d4be1f1c0330\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"cd2a90fb-766a-4a1b-a8fe-00976caf8b92\",\n" +
                "        \"number\": \"Pedido #3\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-27T20:03:40Z\",\n" +
                "        \"updated_at\": \"2017-07-27T20:03:40Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"6cafb3d7-1bc2-4d0d-bf4f-2806d43ee5b4\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"baecc49a-f7d3-4167-8fb4-44fced237b84\",\n" +
                "                \"external_id\": \"5a9b32e2-85cb-409a-bbaa-abfd204186ad\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311403\",\n" +
                "                \"authorization_code\": \"M5PLDS\",\n" +
                "                \"number\": \"797929\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************3972\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"a74141a4-a2d0-448d-8bdc-b375bc18f031\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-27T20:02:25Z\",\n" +
                "        \"updated_at\": \"2017-07-27T20:02:25Z\",\n" +
                "        \"order_type\": \"AUTHORIZATION\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"18b5ecaa-30d5-46fb-aa00-a642a129fe81\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"bd88e419-6149-4c6a-92da-3289badbfca4\",\n" +
                "                \"external_id\": \"06d00c4a-e9bb-4f03-bde3-3d70b362b8e2\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311403\",\n" +
                "                \"authorization_code\": \"M5PLDS\",\n" +
                "                \"number\": \"797928\",\n" +
                "                \"amount\": 3,\n" +
                "                \"transaction_type\": \"AUTHORIZATION\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************3972\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"0ec7667f-fc17-4e48-9b9d-70b6d775e4fb\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-27T20:00:08Z\",\n" +
                "        \"updated_at\": \"2017-07-27T20:00:08Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"466ce6c0-c1d6-4321-905e-737ce98a9004\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"1bec505b-4a2a-4f90-a0eb-0ddae935d01b\",\n" +
                "                \"external_id\": \"3067a0d1-356f-4771-8fd5-73e2fb64ec3b\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311403\",\n" +
                "                \"authorization_code\": \"NDN2N2\",\n" +
                "                \"number\": \"797927\",\n" +
                "                \"amount\": 1,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************3972\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"f7dae9c4-f107-4599-8507-75d053f0e5f4\",\n" +
                "        \"number\": \"Pedido #3\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-27T13:54:06Z\",\n" +
                "        \"updated_at\": \"2017-07-27T13:54:06Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"8944b2d0-4a4d-4b31-9754-084c6cb5e5cd\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"37c57caa-07f1-4139-985f-9d32719c8a62\",\n" +
                "                \"external_id\": \"82408.54643421777\",\n" +
                "                \"description\": \"CREDITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"783114036\",\n" +
                "                \"authorization_code\": \"635377\",\n" +
                "                \"number\": \"790569\",\n" +
                "                \"amount\": 3,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"VISA\",\n" +
                "                    \"mask\": \"************0037\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"bfe28481-8d0f-4188-920b-3d13f9831b5b\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-27T13:52:42Z\",\n" +
                "        \"updated_at\": \"2017-07-27T13:52:42Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"2a17b633-0174-4d4e-b468-6930baacaa11\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"c69a981e-d46a-4b25-8345-9dd0ecf0a573\",\n" +
                "                \"external_id\": \"66853.12950252768\",\n" +
                "                \"description\": \"DEBITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"783114036\",\n" +
                "                \"authorization_code\": \"395350\",\n" +
                "                \"number\": \"790567\",\n" +
                "                \"amount\": 3,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"VISA\",\n" +
                "                    \"mask\": \"************0204\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"d8be8e1f-ac44-46e8-9dd9-2c7efd56c97d\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-27T13:50:38Z\",\n" +
                "        \"updated_at\": \"2017-07-27T13:50:38Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"a99774c4-0628-4906-9de4-4217527f2b6e\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"ea7451d6-afb2-4e70-8744-2f1e55fee2b7\",\n" +
                "                \"external_id\": \"92459.83782508984\",\n" +
                "                \"description\": \"VOUCHER/REFEICAO\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"783114036\",\n" +
                "                \"authorization_code\": \"642854\",\n" +
                "                \"number\": \"790565\",\n" +
                "                \"amount\": 3,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"ALELO\",\n" +
                "                    \"mask\": \"************6069\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"09fee233-be45-409b-b432-124a1d5ec642\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-26T20:15:49Z\",\n" +
                "        \"updated_at\": \"2017-07-26T20:15:49Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"dc22299a-b898-48b5-a35e-4c93a838e951\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"7feaa98e-2883-4da2-b32f-fa22f29d5850\",\n" +
                "                \"external_id\": \"90504.59772063592\",\n" +
                "                \"description\": \"DEBITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"381100197\",\n" +
                "                \"authorization_code\": \"384783\",\n" +
                "                \"number\": \"769434\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"ELO\",\n" +
                "                    \"mask\": \"************5107\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"877128fa-6852-428a-99a6-ebb7f431b613\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-26T19:38:08Z\",\n" +
                "        \"updated_at\": \"2017-07-26T19:38:08Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"8a28d895-d400-4177-ab42-2d54e8f522cc\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"49db850c-4403-4f46-89fd-320719b0ce5d\",\n" +
                "                \"external_id\": \"56391.84723284272\",\n" +
                "                \"description\": \"CREDITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"381100056\",\n" +
                "                \"authorization_code\": \"4PCWIF\",\n" +
                "                \"number\": \"768694\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************4016\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"1393627b-e1e3-4bb9-b0c4-69b703f3a764\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-26T18:51:38Z\",\n" +
                "        \"updated_at\": \"2017-07-26T18:51:38Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"253f249b-cd6d-48a3-a7b7-5947480a6ea8\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"7297ee19-eff0-425d-a8d9-a40a7b8d1a00\",\n" +
                "                \"external_id\": \"73636.69932407045\",\n" +
                "                \"description\": \"CREDITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"783138464\",\n" +
                "                \"authorization_code\": \"5FT2RT\",\n" +
                "                \"number\": \"767775\",\n" +
                "                \"amount\": 2,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************4016\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"2e453f60-764a-4f14-9495-204a38af5570\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-26T17:26:06Z\",\n" +
                "        \"updated_at\": \"2017-07-26T17:26:06Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"4188a111-bc03-4671-918d-6dcd6004b25b\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"f962372a-fd12-4aa7-8dbd-89e3cf7387be\",\n" +
                "                \"external_id\": \"ad6f8ae8-f054-426e-82c3-5a26393d866f\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"089838\",\n" +
                "                \"number\": \"738155\",\n" +
                "                \"amount\": 1,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"ELO\",\n" +
                "                    \"mask\": \"************8756\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"9bbb9d96-cda7-4e2a-b43a-94b08bf1986e\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-25T20:26:36Z\",\n" +
                "        \"updated_at\": \"2017-07-25T20:26:36Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"0ee58419-117f-47a2-8493-3050754040a5\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"d7ee0b62-26f5-42df-9bdd-e15d4d255ee3\",\n" +
                "                \"external_id\": \"71778.98694456836\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"NM6Y73\",\n" +
                "                \"number\": \"738152\",\n" +
                "                \"amount\": 1,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"985f407a-46a8-4840-89fc-8cc4bdff17a0\",\n" +
                "        \"number\": \"Pedido #3\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-25T17:32:23Z\",\n" +
                "        \"updated_at\": \"2017-07-25T17:32:23Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"69ef1ff0-eb26-4d3e-93a9-617a60f117cd\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"dfd56f0f-9e03-4f24-906a-e5d39dcd5829\",\n" +
                "                \"external_id\": \"62810.44178288253\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"W0A14F\",\n" +
                "                \"number\": \"736748\",\n" +
                "                \"amount\": 1,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"720efced-3eb2-4733-b23f-52c99e1d8ab3\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-25T17:29:55Z\",\n" +
                "        \"updated_at\": \"2017-07-25T17:29:55Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"d2a3bd83-1c47-44b2-bbae-164c6fdadec5\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"d0be3a05-696d-413f-a674-db78e2cdd4a7\",\n" +
                "                \"external_id\": \"74979.44257499983\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78311400\",\n" +
                "                \"authorization_code\": \"J4411M\",\n" +
                "                \"number\": \"736747\",\n" +
                "                \"amount\": 3,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************0240\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"52b4945e-c2d8-45c3-b280-0b6ef01e8ae6\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 6,\n" +
                "        \"created_at\": \"2017-07-21T21:59:34Z\",\n" +
                "        \"updated_at\": \"2017-07-21T21:59:34Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"7cda5311-8558-4d7c-8350-efb27115f95b\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 6,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"d2b8c1e3-5146-419a-805e-221e86af8abe\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-21T21:46:28Z\",\n" +
                "        \"updated_at\": \"2017-07-21T21:46:28Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"6273bf7d-e60a-436c-88fe-bfe3024c0c0e\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 3,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"5b02cf83-a16e-416d-bb2c-2e6957bed214\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 30,\n" +
                "        \"created_at\": \"2017-07-21T14:37:28Z\",\n" +
                "        \"updated_at\": \"2017-07-21T14:37:28Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"20d6f078-b4b8-4a4d-883c-b019665d5026\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 30,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"b4b410cb-4743-4df5-be9b-5a1b4f24178a\",\n" +
                "                \"external_id\": \"67621.37242194102\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78313949\",\n" +
                "                \"authorization_code\": \"661685\",\n" +
                "                \"number\": \"615904\",\n" +
                "                \"amount\": 30,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"VISA\",\n" +
                "                    \"mask\": \"************0037\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"1ec999e6-47cb-4184-9009-1c102e1ae7b7\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 100,\n" +
                "        \"created_at\": \"2017-07-21T14:32:08Z\",\n" +
                "        \"updated_at\": \"2017-07-21T14:33:46Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"80fad04a-2207-4279-b0fb-1cc4111f3a2f\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 100,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"c19ef64e-dde6-42cf-9476-91f0d449098f\",\n" +
                "                \"external_id\": \"50992.19865037302\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"78313949\",\n" +
                "                \"authorization_code\": \"603592\",\n" +
                "                \"number\": \"615902\",\n" +
                "                \"amount\": 125,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"VISA\",\n" +
                "                    \"mask\": \"************0037\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"423f122d-8105-4d1b-84c3-536d1ebf9a6b\",\n" +
                "        \"number\": \"Pedido #6\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-07-19T20:59:37Z\",\n" +
                "        \"updated_at\": \"2017-07-19T21:01:04Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"dc561d45-e0a3-45cf-a8e9-3ead8579b707\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"1be18eff-843e-42c4-922f-8ee76ed5a7aa\",\n" +
                "        \"number\": \"Pedido #5\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-07-19T20:45:56Z\",\n" +
                "        \"updated_at\": \"2017-07-19T20:59:07Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"e8b7cb62-f7b4-4ad8-9a3d-0952f200389d\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"1a0c95a7-814c-426f-8e5b-9fc403b6bda3\",\n" +
                "        \"number\": \"Pedido #4\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 1,\n" +
                "        \"created_at\": \"2017-07-19T20:44:40Z\",\n" +
                "        \"updated_at\": \"2017-07-19T20:45:26Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"c24af4c3-e214-43ea-84c4-785696da8902\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"6cfaa09d-62fd-4666-97cb-0285a6721cfe\",\n" +
                "        \"number\": \"Pedido #3\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 0,\n" +
                "        \"created_at\": \"2017-07-19T20:12:56Z\",\n" +
                "        \"updated_at\": \"2017-07-19T20:44:09Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"0f6ebccc-c15e-447a-80d6-4aefe489fc44\",\n" +
                "                \"sku\": \"Valor Avulso\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 0,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"0e60198d-76ba-406b-bdc3-0aee36a8b043\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 25,\n" +
                "        \"created_at\": \"2017-07-18T18:16:05Z\",\n" +
                "        \"updated_at\": \"2017-07-18T18:16:05Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"c2cb7bfc-b17b-4362-bbb9-b5326798e981\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 25,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"88417eeb-fbaa-4270-9bf4-f8231a4609cb\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 10,\n" +
                "        \"created_at\": \"2017-07-17T18:25:19Z\",\n" +
                "        \"updated_at\": \"2017-07-17T18:25:19Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"80b0d5dd-e728-4fdf-b4af-a1de28abce41\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 10,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": [\n" +
                "            {\n" +
                "                \"id\": \"7f3eaebe-f8be-43e6-8568-f6b971a349ba\",\n" +
                "                \"external_id\": \"7906.170252224973\",\n" +
                "                \"description\": \"DEBITO/A VISTA\",\n" +
                "                \"status\": \"CONFIRMED\",\n" +
                "                \"terminal_number\": \"783114036\",\n" +
                "                \"authorization_code\": \"483449\",\n" +
                "                \"number\": \"508065\",\n" +
                "                \"amount\": 10,\n" +
                "                \"transaction_type\": \"PAYMENT\",\n" +
                "                \"card\": {\n" +
                "                    \"brand\": \"MASTERCARD\",\n" +
                "                    \"mask\": \"************2136\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"84358129-ec6d-4315-a69a-12fefc3f8b0e\",\n" +
                "        \"number\": \"Pedido #3\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2,\n" +
                "        \"created_at\": \"2017-07-10T20:53:09Z\",\n" +
                "        \"updated_at\": \"2017-07-10T20:53:09Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"a46b2191-0493-4c1f-a081-33fb73abe952\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"3524c58d-efde-48d1-8f51-ebcb9696529d\",\n" +
                "        \"number\": \"Pedido #2\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 3,\n" +
                "        \"created_at\": \"2017-07-10T20:51:33Z\",\n" +
                "        \"updated_at\": \"2017-07-10T20:51:33Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"874244fd-30c7-492c-9870-471a0e979de6\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 1,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"id\": \"0b186e95-25cb-438b-b59f-95753fc12836\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"69281bff-ef9d-4053-a754-5c1e5f562c94\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 2000,\n" +
                "        \"created_at\": \"2017-06-16T14:07:30Z\",\n" +
                "        \"updated_at\": \"2017-06-16T14:12:44Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"59d3986a-e07b-4348-a07b-ae9a81b88270\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 2000,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": \"77883c02-3a47-47e1-a4ac-e6bf916c7c72\",\n" +
                "        \"number\": \"Pedido #1\",\n" +
                "        \"status\": \"CLOSED\",\n" +
                "        \"price\": 100,\n" +
                "        \"created_at\": \"2017-06-14T17:59:02Z\",\n" +
                "        \"updated_at\": \"2017-06-14T17:59:02Z\",\n" +
                "        \"order_type\": \"PAYMENT\",\n" +
                "        \"merchant\": \"0010000244472010\",\n" +
                "        \"items\": [\n" +
                "            {\n" +
                "                \"id\": \"085fc30b-3d43-46e8-9c47-79b723d8407f\",\n" +
                "                \"sku\": \"AVULSO\",\n" +
                "                \"name\": \"Valor Avulso\",\n" +
                "                \"description\": \"Valor Avulso\",\n" +
                "                \"unit_price\": 100,\n" +
                "                \"quantity\": 1,\n" +
                "                \"unit_of_measure\": \"EACH\",\n" +
                "                \"details\": \"Valor Avulso\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"transactions\": []\n" +
                "    }\n" +
                "]";

        JSONArray orderList = new JSONArray(theJson);

        return orderList;
    }
}
