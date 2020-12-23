package com.tusdwi.virsidas.api;

import com.tusdwi.virsidas.model.ResponJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("read_jadwal.php")
    Call<ResponJadwal> getJadwal();





}
