package com.rktuhinbd.rxjava.service;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.concurrent.TimeUnit;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;

    private ApiClient() {

    }

    public static Retrofit getClient(@NonNull String baseUrl) {

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.connectTimeout(15, TimeUnit.SECONDS);
        clientBuilder.readTimeout(15, TimeUnit.SECONDS);
        clientBuilder.writeTimeout(15, TimeUnit.SECONDS);
        clientBuilder.addInterceptor(getHttpLoggingInterceptor());
        clientBuilder.addNetworkInterceptor(provideHeaderInterceptor());
        OkHttpClient client = clientBuilder.build();
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }


    private static HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return new HttpLoggingInterceptor(s -> Log.d("NETWORK_CACHE", "log: " + s));
    }

    private static Interceptor provideHeaderInterceptor() {
        return chain -> {
            Request original = chain.request();
            Request request;

            request = original.newBuilder()
                    .method(original.method(), original.body())
                    .build();

            return chain.proceed(request);
        };
    }
}
