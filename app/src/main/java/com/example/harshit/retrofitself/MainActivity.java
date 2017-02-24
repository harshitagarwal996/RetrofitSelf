package com.example.harshit.retrofitself;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<Response> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        String key="eacf091eb5c118818fc2e61fccf583bd-us15";
        String BASE_URL="https://us15.api.mailchimp.com/3.0/";
        Retrofit retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        Call<Response> Data = retrofit.create(GetDataInterface.class).fetchData(key);
        try{
        Data.enqueue(this);
        }
        catch (Exception e){
            Log.d("harshit","Some error occured");
        }
    }

    @Override
    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
        Log.d("harshit",response.body().totalItems+"");

    }

    @Override
    public void onFailure(Call<Response> call, Throwable t) {

    }
}
