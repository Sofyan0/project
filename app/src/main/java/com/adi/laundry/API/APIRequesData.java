package com.adi.laundry.API;

import com.adi.laundry.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequesData {
    @GET("retrieve.php")
    Call<ResponseModel> ardRetrieveData();
}
