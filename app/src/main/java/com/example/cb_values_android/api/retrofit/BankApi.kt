package com.example.cb_values_android.api.retrofit

import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import retrofit2.Response
import retrofit2.http.GET

interface BankApi {

    @GET("daily_json.js")
    suspend fun getValuesFromServer(): Response<ValuesJSON>

}