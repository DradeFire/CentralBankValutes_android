package com.example.cb_values_android.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cb_values_android.api.repository.ApiRepository
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import kotlinx.coroutines.launch
import retrofit2.Response

class ValuteViewModel: ViewModel() {

    var isStart: Boolean? = null
    var willConvert: String? = null
    var converted: String? = null


    val listOfValutes: MutableLiveData<Response<ValuesJSON>> = MutableLiveData()

    fun getValutesFromServer(){
        viewModelScope.launch {
            listOfValutes.value = ApiRepository().getValutesFromServer()
        }
    }

}