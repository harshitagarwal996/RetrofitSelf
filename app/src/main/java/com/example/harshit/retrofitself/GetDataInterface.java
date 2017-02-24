package com.example.harshit.retrofitself;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Harshit on 23-02-2017.
 */

public interface GetDataInterface {
    @GET("lists")
    public Call<Response> fetchData(@Query("apikey") String apiKey);
}
