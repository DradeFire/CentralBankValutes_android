package com.example.cb_values_android.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cb_values_android.api.repository.ApiRepository
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ValuteViewModel: ViewModel() {

    val listOfValutes: MutableLiveData<ValuesJSON> = MutableLiveData()

    fun getValutesFromServer(){
        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(
            ApiRepository().getValutesFromServer()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { response -> listOfValutes.value = response }
        )

    }

}