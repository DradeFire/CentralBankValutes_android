package com.example.cb_values_android.api.repository

import com.example.cb_values_android.api.retrofit.InstanseBankApi
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import io.reactivex.Observable

class ApiRepository {

    fun getValutesFromServer(): Observable<ValuesJSON> =
        InstanseBankApi.apiBank.getValuesFromServer()

}