package com.example.harshit.retrofitself;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

/**
 * Created by Harshit on 23-02-2017.
 */

public class Response {
    @Expose
    @SerializedName("name")
    String name;

    @Expose
    @SerializedName("total_items")
    String totalItems;

    @Expose
    @SerializedName("contact")
    JSONObject contact;

}
