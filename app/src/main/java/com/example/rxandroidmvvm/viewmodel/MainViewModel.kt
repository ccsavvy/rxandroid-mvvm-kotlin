package com.example.rxandroidmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var viewState = MutableLiveData<Boolean>()
    private var isLoading = MutableLiveData<Boolean>()

}
