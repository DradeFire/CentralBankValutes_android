package com.example.cb_values_android.api.repository

import com.example.cb_values_android.api.retrofit.InstanseBankApi
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import retrofit2.Response

class ApiRepository {

    suspend fun getValutesFromServer(): Response<ValuesJSON> =
        InstanseBankApi.apiBank.getValuesFromServer()

}