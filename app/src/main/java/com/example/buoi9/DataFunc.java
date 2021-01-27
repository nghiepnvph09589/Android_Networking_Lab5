package com.example.buoi9;

import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataFunc {
    public void deleteFunc(final TextView tvRessult, String pid)
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstDelete.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Prd prd = new Prd();
        prd.setPid(pid);
        RequestDelete requestDelete = new RequestDelete();
        requestDelete.setProducts(prd);
        InterfaceDelete interfaceDelete = retrofit.create(InterfaceDelete.class);

        Call<ResponseDelete> call = interfaceDelete.deleteExecute(pid);
        call.enqueue(new Callback<ResponseDelete>() {
            @Override
            public void onResponse(Call<ResponseDelete> call, Response<ResponseDelete> response) {
                ResponseDelete responseDelete = response.body();
                tvRessult.setText(responseDelete.getMessage()+": "+responseDelete.getResult());
            }

            @Override
            public void onFailure(Call<ResponseDelete> call, Throwable t) {
                tvRessult.setText(t.getMessage());
            }
        });

    }
}
