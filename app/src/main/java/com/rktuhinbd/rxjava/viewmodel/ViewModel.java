package com.rktuhinbd.rxjava.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rktuhinbd.rxjava.model.NetworkResponse;
import com.rktuhinbd.rxjava.repository.Repository;
import com.rktuhinbd.rxjava.service.DataResponse;

public class ViewModel extends AndroidViewModel {

    private final Repository repository;

    private MutableLiveData<DataResponse<NetworkResponse>> mutableLiveData;

    public ViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository();
        mutableLiveData = new MutableLiveData<>();
    }

    public LiveData<DataResponse<NetworkResponse>> observeEndClassRatingData() {
        return mutableLiveData;
    }

    public void getRatingData() {
        repository.getNetworkData(mutableLiveData);
    }

}
