package com.example.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sendRequestWithOkHttp();

    }

//    private void sendRequestWithOkHttp() {
//        new Thread() {
//            @Override
//            public void run() {
//                super.run();
//                try {
//                    OkHttpClient client = new OkHttpClient();
//                    Request request = new Request.Builder().url("http://guolin.tech/api/china").build();
//                    Response response = client.newCall(request).execute();
//                    String responseData = response.body().string();
//                    parseJSONWithJSONObject(responseData);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
//    }
//
//    private void parseJSONWithJSONObject(String jsonData) {
//        try {
//            JSONArray jsonArray = new JSONArray(jsonData);
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//                int id = jsonObject.getInt("id");
//                String name = jsonObject.getString("name");
//                Log.d("MainActivity", "id is" + id);
//                Log.d("MainActivity", "name is" + name);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void onClick(View view) {
//
//    }
}
