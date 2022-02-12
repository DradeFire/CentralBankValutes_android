package com.example.cb_values_android.api.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanseBankApi {

    private val retrofitBank by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.cbr-xml-daily.ru/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiBank: BankApi by lazy {
        retrofitBank.create(BankApi::class.java)
    }

}