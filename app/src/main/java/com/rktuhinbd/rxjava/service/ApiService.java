package com.rktuhinbd.rxjava.service;

import com.rktuhinbd.rxjava.model.NetworkResponse;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/")
    Single<NetworkResponse> getNetworkData();

}
