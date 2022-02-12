package com.example.cb_values_android.fragments.valutes

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import com.example.cb_values_android.databinding.FragmentListOfValutsBinding
import com.example.cb_values_android.fragments.adapters.ValutesAdapter
import com.example.cb_values_android.viewmodel.ValuteViewModel
import kotlinx.coroutines.*

class ListOfValutesFragment : Fragment() {

    private lateinit var code: String
    private lateinit var binding: FragmentListOfValutsBinding
    private lateinit var listOfValutes: ValuesJSON
    private var countOfBindRCview = 0
    private val viewModel: ValuteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListOfValutsBinding.inflate(inflater)

        startAnimation()
        bindObservers()
        bindSpinner()
        bindSwipe()
        bindOneMinuteRefresh()

        return binding.root
    }

    private fun startAnimation(){
        val animScaleX = ObjectAnimator
            .ofFloat(binding.imageStartAnimation,"scaleX", .5f, .7f, .5f)
        animScaleX.duration = 2000
        animScaleX.repeatCount = Animation.INFINITE

        val animScaleY = ObjectAnimator
            .ofFloat(binding.imageStartAnimation,"scaleY", .5f, .7f,.5f)
        animScaleY.duration = 2000
        animScaleY.repeatCount = Animation.INFINITE

        animScaleX.start()
        animScaleY.start()
    }

    private fun bindOneMinuteRefresh() {
        lifecycleScope.launch{
            while (true) {
                withContext(Dispatchers.Main){
                    viewModel.getValutesFromServer()
                }
                delay(60_000)
            }

        }

    }

    private fun bindSwipe() = with(binding.swipeView){
        setOnRefreshListener {
            viewModel.getValutesFromServer()

            Handler().postDelayed( {
                isRefreshing = false
            }, 4000)
        }
    }

    private fun bindSpinner() {
        val arrayForSpinner = arrayOf("AMD", "AUD", "AZN", "BGN", "BRL",
            "BYN", "CAD", "CHF", "CNY", "CZK", "DKK", "EUR", "GBP", "HKD",
            "HUF", "INR", "JPY", "KGS", "KRW", "KZT", "MDL", "NOK", "PLN",
            "RON", "SEK", "SGD", "TJS", "TMT", "TRY", "UAH", "USD", "UZS", "XDR")
        val adapt: ArrayAdapter<String> = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, arrayForSpinner)

        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.converterInFragment.spinnerToConvert.adapter = adapt

        val itemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(element: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                code = element?.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}

        }

        binding.converterInFragment.spinnerToConvert.onItemSelectedListener = itemSelectedListener
    }

    private fun bindObservers() {
        viewModel.getValutesFromServer()
        viewModel.listOfValutes.observe(viewLifecycleOwner) { response ->
            if (response.isSuccessful and (response.body() != null)){
                if (countOfBindRCview == 0){
                    countOfBindRCview++

                    listOfValutes = response.body()!!
                    bindRcView()
                    lifecycleScope.launch {
                        delay(1500)
                        withContext(Dispatchers.Main){
                            turnOffStartAnimation()
                        }
                    }

                } else {
                    (binding.rcViewValutes.adapter as ValutesAdapter)
                        .setNewValuteList(response.body()!!)
                }

            } else{
                viewModel.getValutesFromServer()
            }

        }

        binding.converterInFragment.btConvertValute.setOnClickListener {
            convertToValute()
        }

    }

    private fun turnOffStartAnimation() = with(binding) {
        imageStartAnimation.clearAnimation()
        startViewWithAnimation.visibility = View.GONE
    }

    @SuppressLint("SetTextI18n")
    private fun convertToValute() {
        val valueValute: Double = when(code){
            listOfValutes.Valute.AMD.CharCode -> listOfValutes.Valute.AMD.Value / listOfValutes.Valute.AMD.Nominal
            listOfValutes.Valute.AUD.CharCode -> listOfValutes.Valute.AUD.Value / listOfValutes.Valute.AUD.Nominal
            listOfValutes.Valute.AZN.CharCode -> listOfValutes.Valute.AZN.Value / listOfValutes.Valute.AZN.Nominal
            listOfValutes.Valute.BGN.CharCode -> listOfValutes.Valute.BGN.Value / listOfValutes.Valute.BGN.Nominal
            listOfValutes.Valute.BRL.CharCode -> listOfValutes.Valute.BRL.Value / listOfValutes.Valute.BRL.Nominal
            listOfValutes.Valute.BYN.CharCode -> listOfValutes.Valute.BYN.Value / listOfValutes.Valute.BYN.Nominal
            listOfValutes.Valute.CAD.CharCode -> listOfValutes.Valute.CAD.Value / listOfValutes.Valute.CAD.Nominal
            listOfValutes.Valute.CHF.CharCode -> listOfValutes.Valute.CHF.Value / listOfValutes.Valute.CHF.Nominal
            listOfValutes.Valute.CNY.CharCode -> listOfValutes.Valute.CNY.Value / listOfValutes.Valute.CNY.Nominal
            listOfValutes.Valute.CZK.CharCode -> listOfValutes.Valute.CZK.Value / listOfValutes.Valute.CZK.Nominal
            listOfValutes.Valute.DKK.CharCode -> listOfValutes.Valute.DKK.Value / listOfValutes.Valute.DKK.Nominal
            listOfValutes.Valute.EUR.CharCode -> listOfValutes.Valute.EUR.Value / listOfValutes.Valute.EUR.Nominal
            listOfValutes.Valute.GBP.CharCode -> listOfValutes.Valute.GBP.Value / listOfValutes.Valute.GBP.Nominal
            listOfValutes.Valute.HKD.CharCode -> listOfValutes.Valute.HKD.Value / listOfValutes.Valute.HKD.Nominal
            listOfValutes.Valute.HUF.CharCode -> listOfValutes.Valute.HUF.Value / listOfValutes.Valute.HUF.Nominal
            listOfValutes.Valute.INR.CharCode -> listOfValutes.Valute.INR.Value / listOfValutes.Valute.INR.Nominal
            listOfValutes.Valute.JPY.CharCode -> listOfValutes.Valute.JPY.Value / listOfValutes.Valute.JPY.Nominal
            listOfValutes.Valute.KGS.CharCode -> listOfValutes.Valute.KGS.Value / listOfValutes.Valute.KGS.Nominal
            listOfValutes.Valute.KRW.CharCode -> listOfValutes.Valute.KRW.Value / listOfValutes.Valute.KRW.Nominal
            listOfValutes.Valute.KZT.CharCode -> listOfValutes.Valute.KZT.Value / listOfValutes.Valute.KZT.Nominal
            listOfValutes.Valute.MDL.CharCode -> listOfValutes.Valute.MDL.Value / listOfValutes.Valute.MDL.Nominal
            listOfValutes.Valute.NOK.CharCode -> listOfValutes.Valute.NOK.Value / listOfValutes.Valute.NOK.Nominal
            listOfValutes.Valute.PLN.CharCode -> listOfValutes.Valute.PLN.Value / listOfValutes.Valute.PLN.Nominal
            listOfValutes.Valute.RON.CharCode -> listOfValutes.Valute.RON.Value / listOfValutes.Valute.RON.Nominal
            listOfValutes.Valute.SEK.CharCode -> listOfValutes.Valute.SEK.Value / listOfValutes.Valute.SEK.Nominal
            listOfValutes.Valute.SGD.CharCode -> listOfValutes.Valute.SGD.Value / listOfValutes.Valute.SGD.Nominal
            listOfValutes.Valute.TJS.CharCode -> listOfValutes.Valute.TJS.Value / listOfValutes.Valute.TJS.Nominal
            listOfValutes.Valute.TMT.CharCode -> listOfValutes.Valute.TMT.Value / listOfValutes.Valute.TMT.Nominal
            listOfValutes.Valute.TRY.CharCode -> listOfValutes.Valute.TRY.Value / listOfValutes.Valute.TRY.Nominal
            listOfValutes.Valute.UAH.CharCode -> listOfValutes.Valute.UAH.Value / listOfValutes.Valute.UAH.Nominal
            listOfValutes.Valute.USD.CharCode -> listOfValutes.Valute.USD.Value / listOfValutes.Valute.USD.Nominal
            listOfValutes.Valute.UZS.CharCode -> listOfValutes.Valute.UZS.Value / listOfValutes.Valute.UZS.Nominal
            listOfValutes.Valute.XDR.CharCode -> listOfValutes.Valute.XDR.Value / listOfValutes.Valute.XDR.Nominal
            else -> listOfValutes.Valute.ZAR.Value / listOfValutes.Valute.ZAR.Nominal
        }
        if(binding.converterInFragment.inputConvertValute.text.isNotBlank()
            and binding.converterInFragment.inputConvertValute.text.isNotEmpty()) {
            binding.converterInFragment.txConvertedValute.text =
                "${binding.converterInFragment.inputConvertValute.text.toString().toDouble() / valueValute} $code"
        }

    }

    private fun bindRcView() = with(binding.rcViewValutes) {
        adapter = ValutesAdapter(listOfValutes)
        layoutManager = LinearLayoutManager(requireContext())
    }

}