package com.sunflower.pantaucovid19.remote;

import com.sunflower.pantaucovid19.model.Model;
import com.sunflower.pantaucovid19.model.ModelData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("provinsi/?fbclid=IwAR2et4U7LTIEnKnPe0uBWfjn6lTmyyu-EEssrIBO4bLxx1W_lJmUtBnASzU")
    Call<List<ModelData>> getDataProvinsi();
}
