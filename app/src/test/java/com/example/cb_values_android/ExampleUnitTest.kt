package com.example.cb_values_android

import com.example.cb_values_android.api.repository.ApiRepository
import io.reactivex.Scheduler
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.internal.schedulers.ExecutorScheduler
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.jupiter.api.Test
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import java.util.concurrent.TimeUnit

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @BeforeEach
    fun setUpRxSchedulers() {

        val immediate = object : Scheduler() {

            override fun scheduleDirect(run: Runnable, delay: Long, unit: TimeUnit): Disposable {
                // this prevents StackOverflowErrors when scheduling with a delay
                return super.scheduleDirect(run, 0, unit)
            }

            override fun createWorker(): Worker {
                return ExecutorScheduler.ExecutorWorker(Runnable::run)
            }
        }

        RxJavaPlugins.setInitIoSchedulerHandler { immediate }
        RxJavaPlugins.setInitComputationSchedulerHandler { immediate }
        RxJavaPlugins.setInitNewThreadSchedulerHandler { immediate }
        RxJavaPlugins.setInitSingleSchedulerHandler { immediate }
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { immediate }
    }

    @Test
    fun isBankRetrofitApiWorkingCorrect(){

        val compositeDisposable = CompositeDisposable()
        compositeDisposable.add(
            ApiRepository().getValutesFromServer()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({ testValue ->
                    assertEquals(testValue.Valute.USD.ID, "R01235")
                    assertEquals(testValue.Valute.USD.NumCode, "840")
                    assertEquals(testValue.Valute.USD.CharCode, "USD")
                    assertEquals(testValue.Valute.USD.Nominal, 1)
                    assertEquals(testValue.Valute.USD.Name, "Доллар США")
                    assert(testValue.Valute.USD.Value > 1)

                    assertEquals(testValue.Valute.EUR.ID, "R01239")
                    assertEquals(testValue.Valute.EUR.NumCode, "978")
                    assertEquals(testValue.Valute.EUR.CharCode, "EUR")
                    assertEquals(testValue.Valute.EUR.Nominal, 1)
                    assertEquals(testValue.Valute.EUR.Name, "Евро")
                    assert(testValue.Valute.EUR.Value > 1)
                    assertEquals(testValue.Valute.EUR::class.simpleName, "EUR")
                }, {
                    assert(false)
                })
        )

    }

}