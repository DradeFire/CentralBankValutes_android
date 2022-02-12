package com.example.cb_values_android

import com.example.cb_values_android.api.repository.ApiRepository
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import retrofit2.Response
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun isBankRetrofitApiWorkingCorrect(){
        runBlocking(Dispatchers.IO) {
            val testValue: Response<ValuesJSON> = ApiRepository().getValutesFromServer()
            if(testValue.isSuccessful and (testValue.body() != null)){
                assertEquals(testValue.body()?.Valute?.USD?.ID, "R01235")
                assertEquals(testValue.body()?.Valute?.USD?.NumCode, "840")
                assertEquals(testValue.body()?.Valute?.USD?.CharCode, "USD")
                assertEquals(testValue.body()?.Valute?.USD?.Nominal, 1)
                assertEquals(testValue.body()?.Valute?.USD?.Name, "Доллар США")
                assert(testValue.body()?.Valute?.USD?.Value!! > 1)

                assertEquals(testValue.body()?.Valute?.EUR?.ID, "R01239")
                assertEquals(testValue.body()?.Valute?.EUR?.NumCode, "978")
                assertEquals(testValue.body()?.Valute?.EUR?.CharCode, "EUR")
                assertEquals(testValue.body()?.Valute?.EUR?.Nominal, 1)
                assertEquals(testValue.body()?.Valute?.EUR?.Name, "Евро")
                assert(testValue.body()?.Valute?.EUR?.Value!! > 1)
                assertEquals(testValue.body()?.Valute?.EUR!!::class.simpleName, "EUR")
            } else {
                assert(false)
            }

        }

    }

}