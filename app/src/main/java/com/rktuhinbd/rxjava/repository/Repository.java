package com.rktuhinbd.rxjava.repository;

import androidx.lifecycle.MutableLiveData;

import com.rktuhinbd.rxjava.BuildConfig;
import com.rktuhinbd.rxjava.model.CertificateResponse;
import com.rktuhinbd.rxjava.service.ApiClient;
import com.rktuhinbd.rxjava.service.ApiService;
import com.rktuhinbd.rxjava.service.DataResponse;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class Repository {

    private ApiService service;

    public Repository() {
        service = ApiClient.getClient(BuildConfig.base_url).create(ApiService.class);
    }

    private void dispose(Disposable disposable) {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    // = = = Get End Class Rating = = = //
    public void getRatingData(MutableLiveData<DataResponse<CertificateResponse>> liveData) {

        liveData.setValue(DataResponse.loading(null));

        service.getRating()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<CertificateResponse>() {
                    Disposable disposable;

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        disposable = d;
                    }

                    @Override
                    public void onSuccess(@NonNull CertificateResponse response) {
                        if (response != null) {
                            liveData.setValue(DataResponse.success(response));
                        }
                        dispose(disposable);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        liveData.setValue(DataResponse.error(e.getMessage(), null));
                        dispose(disposable);
                    }
                });

    }
}
