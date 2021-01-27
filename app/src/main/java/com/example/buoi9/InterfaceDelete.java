package com.example.buoi9;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterfaceDelete {
    @FormUrlEncoded
    @POST("delete_product.php")
        Call<ResponseDelete> deleteExecute(@Field("pid") String pid);
        }
