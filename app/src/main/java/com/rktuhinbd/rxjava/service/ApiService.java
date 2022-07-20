package com.rktuhinbd.rxjava.service;

import com.rktuhinbd.rxjava.model.CertificateResponse;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("v2/forms/5J_XrkO84K")
    Single<CertificateResponse> getRating();

}
