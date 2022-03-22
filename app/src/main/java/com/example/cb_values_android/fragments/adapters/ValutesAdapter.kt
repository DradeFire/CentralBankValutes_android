package com.example.cb_values_android.fragments.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cb_values_android.api.retrofit.json.ValuesJSON
import com.example.cb_values_android.databinding.ItemLayoutBinding

class ValutesAdapter(valutes: ValuesJSON): RecyclerView.Adapter<ValutesAdapter.ItemViewHolder>() {

    private var listOfValutes: ValuesJSON = valutes

    class ItemViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindValute(itemPosition: Int, listOfValutes: ValuesJSON) {

            when(itemPosition){
                1 -> {
                    bindText(listOfValutes.Valute.AMD.Name, listOfValutes.Valute.AMD.Value / listOfValutes.Valute.AMD.Nominal, listOfValutes.Valute.AMD.Previous / listOfValutes.Valute.AMD.Nominal)
                }
                2 -> {
                    bindText(listOfValutes.Valute.AUD.Name, listOfValutes.Valute.AUD.Value / listOfValutes.Valute.AUD.Nominal,listOfValutes.Valute.AUD.Previous / listOfValutes.Valute.AUD.Nominal)
                }
                3 -> {
                    bindText(listOfValutes.Valute.AZN.Name,listOfValutes.Valute.AZN.Value / listOfValutes.Valute.AZN.Nominal,listOfValutes.Valute.AZN.Previous / listOfValutes.Valute.AZN.Nominal)
                }
                4 -> {
                    bindText(listOfValutes.Valute.BGN.Name,listOfValutes.Valute.BGN.Value / listOfValutes.Valute.BGN.Nominal,listOfValutes.Valute.BGN.Previous / listOfValutes.Valute.BGN.Nominal)
                }
                5 -> {
                    bindText(listOfValutes.Valute.BRL.Name
                        ,listOfValutes.Valute.BRL.Value / listOfValutes.Valute.BRL.Nominal
                        ,listOfValutes.Valute.BRL.Previous / listOfValutes.Valute.BRL.Nominal)
                }
                6 -> {
                    bindText(listOfValutes.Valute.BYN.Name
                        ,listOfValutes.Valute.BYN.Value / listOfValutes.Valute.BYN.Nominal
                        ,listOfValutes.Valute.BYN.Previous / listOfValutes.Valute.BYN.Nominal
                    )
                }
                7 -> {
                    bindText(listOfValutes.Valute.CAD.Name
                        ,listOfValutes.Valute.CAD.Value / listOfValutes.Valute.CAD.Nominal
                        ,listOfValutes.Valute.CAD.Previous / listOfValutes.Valute.CAD.Nominal
                    )
                }
                8 -> {
                    bindText(listOfValutes.Valute.CHF.Name
                        ,listOfValutes.Valute.CHF.Value / listOfValutes.Valute.CHF.Nominal
                        ,listOfValutes.Valute.CHF.Previous / listOfValutes.Valute.CHF.Nominal
                    )
                }
                9 -> {
                    bindText(listOfValutes.Valute.CNY.Name
                        ,listOfValutes.Valute.CNY.Value / listOfValutes.Valute.CNY.Nominal
                        ,listOfValutes.Valute.CNY.Previous / listOfValutes.Valute.CNY.Nominal
                    )
                }
                10 -> {
                    bindText(listOfValutes.Valute.CZK.Name
                        ,listOfValutes.Valute.CZK.Value / listOfValutes.Valute.CZK.Nominal
                        ,listOfValutes.Valute.CZK.Previous / listOfValutes.Valute.CZK.Nominal
                    )
                }
                11 -> {
                    bindText(listOfValutes.Valute.DKK.Name
                        ,listOfValutes.Valute.DKK.Value / listOfValutes.Valute.DKK.Nominal
                        ,listOfValutes.Valute.DKK.Previous / listOfValutes.Valute.DKK.Nominal
                    )
                }
                12 -> {
                    bindText(listOfValutes.Valute.EUR.Name
                        ,listOfValutes.Valute.EUR.Value / listOfValutes.Valute.EUR.Nominal
                        ,listOfValutes.Valute.EUR.Previous / listOfValutes.Valute.EUR.Nominal
                    )
                }
                13 -> {
                    bindText(listOfValutes.Valute.GBP.Name
                        ,listOfValutes.Valute.GBP.Value / listOfValutes.Valute.GBP.Nominal
                        ,listOfValutes.Valute.GBP.Previous / listOfValutes.Valute.GBP.Nominal
                    )
                }
                14 -> {
                    bindText(listOfValutes.Valute.HKD.Name
                        ,listOfValutes.Valute.HKD.Value / listOfValutes.Valute.HKD.Nominal
                        ,listOfValutes.Valute.HKD.Previous / listOfValutes.Valute.HKD.Nominal
                    )
                }
                15 -> {
                    bindText(listOfValutes.Valute.HUF.Name
                        ,listOfValutes.Valute.HUF.Value / listOfValutes.Valute.HUF.Nominal
                        ,listOfValutes.Valute.HUF.Previous / listOfValutes.Valute.HUF.Nominal
                    )
                }
                16 -> {
                    bindText(listOfValutes.Valute.INR.Name
                        ,listOfValutes.Valute.INR.Value / listOfValutes.Valute.INR.Nominal
                        ,listOfValutes.Valute.INR.Previous / listOfValutes.Valute.INR.Nominal
                    )
                }
                17 -> {
                    bindText(listOfValutes.Valute.JPY.Name
                        ,listOfValutes.Valute.JPY.Value / listOfValutes.Valute.JPY.Nominal
                        ,listOfValutes.Valute.JPY.Previous / listOfValutes.Valute.JPY.Nominal
                    )
                }
                18 -> {
                    bindText(listOfValutes.Valute.KGS.Name
                        ,listOfValutes.Valute.KGS.Value / listOfValutes.Valute.KGS.Nominal
                        ,listOfValutes.Valute.KGS.Previous / listOfValutes.Valute.KGS.Nominal
                    )
                }
                19 -> {
                    bindText(listOfValutes.Valute.KRW.Name
                        ,listOfValutes.Valute.KRW.Value / listOfValutes.Valute.KRW.Nominal
                        ,listOfValutes.Valute.KRW.Previous / listOfValutes.Valute.KRW.Nominal
                    )
                }
                20 -> {
                    bindText(listOfValutes.Valute.KZT.Name
                        ,listOfValutes.Valute.KZT.Value / listOfValutes.Valute.KZT.Nominal
                        ,listOfValutes.Valute.KZT.Previous / listOfValutes.Valute.KZT.Nominal
                    )
                }
                21 -> {
                    bindText(listOfValutes.Valute.MDL.Name
                        ,listOfValutes.Valute.MDL.Value / listOfValutes.Valute.MDL.Nominal
                        ,listOfValutes.Valute.MDL.Previous / listOfValutes.Valute.MDL.Nominal
                    )
                }
                22 -> {
                    bindText(listOfValutes.Valute.NOK.Name
                        ,listOfValutes.Valute.NOK.Value / listOfValutes.Valute.NOK.Nominal
                        ,listOfValutes.Valute.NOK.Previous / listOfValutes.Valute.NOK.Nominal
                    )
                }
                23 -> {
                    bindText(listOfValutes.Valute.PLN.Name
                        ,listOfValutes.Valute.PLN.Value / listOfValutes.Valute.PLN.Nominal
                        ,listOfValutes.Valute.PLN.Previous / listOfValutes.Valute.PLN.Nominal
                    )
                }
                24-> {
                    bindText(listOfValutes.Valute.RON.Name
                        ,listOfValutes.Valute.RON.Value / listOfValutes.Valute.RON.Nominal
                        ,listOfValutes.Valute.RON.Previous / listOfValutes.Valute.RON.Nominal
                    )
                }
                25-> {
                    bindText(listOfValutes.Valute.SEK.Name
                        ,listOfValutes.Valute.SEK.Value / listOfValutes.Valute.SEK.Nominal
                        ,listOfValutes.Valute.SEK.Previous / listOfValutes.Valute.SEK.Nominal
                    )
                }
                26-> {
                    bindText(listOfValutes.Valute.SGD.Name
                        ,listOfValutes.Valute.SGD.Value / listOfValutes.Valute.SGD.Nominal
                        ,listOfValutes.Valute.SGD.Previous / listOfValutes.Valute.SGD.Nominal
                    )
                }
                27-> {
                    bindText(listOfValutes.Valute.TJS.Name
                        ,listOfValutes.Valute.TJS.Value / listOfValutes.Valute.TJS.Nominal
                        ,listOfValutes.Valute.TJS.Previous / listOfValutes.Valute.TJS.Nominal
                    )
                }
                28-> {
                    bindText(listOfValutes.Valute.TMT.Name
                        ,listOfValutes.Valute.TMT.Value / listOfValutes.Valute.TMT.Nominal
                        ,listOfValutes.Valute.TMT.Previous / listOfValutes.Valute.TMT.Nominal
                    )
                }
                29-> {
                    bindText(listOfValutes.Valute.TRY.Name
                        ,listOfValutes.Valute.TRY.Value / listOfValutes.Valute.TRY.Nominal
                        ,listOfValutes.Valute.TRY.Previous / listOfValutes.Valute.TRY.Nominal
                    )
                }
                30-> {
                    bindText(listOfValutes.Valute.UAH.Name
                        ,listOfValutes.Valute.UAH.Value / listOfValutes.Valute.UAH.Nominal
                        ,listOfValutes.Valute.UAH.Previous / listOfValutes.Valute.UAH.Nominal
                    )
                }
                0-> {
                    bindText(listOfValutes.Valute.USD.Name
                        ,listOfValutes.Valute.USD.Value / listOfValutes.Valute.USD.Nominal
                        ,listOfValutes.Valute.USD.Previous / listOfValutes.Valute.USD.Nominal
                    )
                }
                32-> {
                    bindText(listOfValutes.Valute.UZS.Name
                        ,listOfValutes.Valute.UZS.Value / listOfValutes.Valute.UZS.Nominal
                        ,listOfValutes.Valute.UZS.Previous / listOfValutes.Valute.UZS.Nominal
                    )
                }
                33-> {
                    bindText(listOfValutes.Valute.XDR.Name
                        ,listOfValutes.Valute.XDR.Value / listOfValutes.Valute.XDR.Nominal
                        ,listOfValutes.Valute.XDR.Previous / listOfValutes.Valute.XDR.Nominal
                    )
                }
                31-> {
                    bindText(listOfValutes.Valute.ZAR.Name
                        ,listOfValutes.Valute.ZAR.Value / listOfValutes.Valute.ZAR.Nominal
                        ,listOfValutes.Valute.ZAR.Previous / listOfValutes.Valute.ZAR.Nominal
                    )
                }
            }
        }

        @SuppressLint("SetTextI18n")
        private fun bindText(name: String, d: Double, d1: Double) = with(binding){
            txNameOfValute.text = name
            txCurrentValute.text = "%.2f Rubles".format(d)
            txPreviousValute.text = "%.2f Rubles".format(d1)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindValute(position, listOfValutes)
    }

    override fun getItemCount(): Int = 34

    @SuppressLint("NotifyDataSetChanged")
    fun setNewValuteList(newValutes: ValuesJSON){
        listOfValutes = newValutes
        notifyDataSetChanged()
    }
}