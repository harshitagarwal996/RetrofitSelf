package com.example.harshit.retrofitself;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Harshit on 23-02-2017.
 */

public class Response {
    @Expose
    @SerializedName("total_items")
    String totalItems;
}
