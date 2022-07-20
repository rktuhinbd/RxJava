package com.rktuhinbd.rxjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.GsonBuilder;
import com.rktuhinbd.rxjava.databinding.ActivityMainBinding;
import com.rktuhinbd.rxjava.viewmodel.ViewModel;

public class MainActivity extends AppCompatActivity {

    // = = = = = > Declare View Properties < = = = = = //

    private ActivityMainBinding binding;
    private ViewModel viewModel;

    // = = = = = > Declare Data Properties < = = = = = //

    private final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initComponent();
        setObserver();
    }

    private void initComponent() {
        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ViewModel.class);
        viewModel.getRatingData();
    }

    private void setObserver() {
        viewModel.observeEndClassRatingData().observe(this, response -> {
            switch (response.status) {
                case LOADING:
                    break;

                case ERROR:
                    Log.e(TAG, "onError => " + response.message);
                    break;

                case SUCCESS:
                    Log.d(TAG, "onSuccess => " + new GsonBuilder().setPrettyPrinting().create().toJson(response.data));
                    break;
            }
        });
    }
}