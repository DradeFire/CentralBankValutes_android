package com.example.cb_values_android.api.retrofit

import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import io.reactivex.Observable
import retrofit2.http.GET

interface BankApi {

    @GET("daily_json.js")
    fun getValuesFromServer(): Observable<ValuesJSON>

}