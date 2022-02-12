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
        fun bindValute(itemPosition: Int, listOfValutes: ValuesJSON) = with(binding){

            when(itemPosition){
                1 -> {
                    txNameOfValute.text = listOfValutes.Valute.AMD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.AMD.Value / listOfValutes.Valute.AMD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.AMD.Previous / listOfValutes.Valute.AMD.Nominal} Rubles"
                }
                2 -> {
                    txNameOfValute.text = listOfValutes.Valute.AUD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.AUD.Value / listOfValutes.Valute.AUD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.AUD.Previous / listOfValutes.Valute.AUD.Nominal} Rubles"
                }
                3 -> {
                    txNameOfValute.text = listOfValutes.Valute.AZN.Name
                    txCurrentValute.text = "${listOfValutes.Valute.AZN.Value / listOfValutes.Valute.AZN.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.AZN.Previous / listOfValutes.Valute.AZN.Nominal} Rubles"
                }
                4 -> {
                    txNameOfValute.text = listOfValutes.Valute.BGN.Name
                    txCurrentValute.text = "${listOfValutes.Valute.BGN.Value / listOfValutes.Valute.BGN.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.BGN.Previous / listOfValutes.Valute.BGN.Nominal} Rubles"
                }
                5 -> {
                    txNameOfValute.text = listOfValutes.Valute.BRL.Name
                    txCurrentValute.text = "${listOfValutes.Valute.BRL.Value / listOfValutes.Valute.BRL.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.BRL.Previous / listOfValutes.Valute.BRL.Nominal} Rubles"
                }
                6 -> {
                    txNameOfValute.text = listOfValutes.Valute.BYN.Name
                    txCurrentValute.text = "${listOfValutes.Valute.BYN.Value / listOfValutes.Valute.BYN.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.BYN.Previous / listOfValutes.Valute.BYN.Nominal} Rubles"
                }
                7 -> {
                    txNameOfValute.text = listOfValutes.Valute.CAD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.CAD.Value / listOfValutes.Valute.CAD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.CAD.Previous / listOfValutes.Valute.CAD.Nominal} Rubles"
                }
                8 -> {
                    txNameOfValute.text = listOfValutes.Valute.CHF.Name
                    txCurrentValute.text = "${listOfValutes.Valute.CHF.Value / listOfValutes.Valute.CHF.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.CHF.Previous / listOfValutes.Valute.CHF.Nominal} Rubles"
                }
                9 -> {
                    txNameOfValute.text = listOfValutes.Valute.CNY.Name
                    txCurrentValute.text = "${listOfValutes.Valute.CNY.Value / listOfValutes.Valute.CNY.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.CNY.Previous / listOfValutes.Valute.CNY.Nominal} Rubles"
                }
                10 -> {
                    txNameOfValute.text = listOfValutes.Valute.CZK.Name
                    txCurrentValute.text = "${listOfValutes.Valute.CZK.Value / listOfValutes.Valute.CZK.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.CZK.Previous / listOfValutes.Valute.CZK.Nominal} Rubles"
                }
                11 -> {
                    txNameOfValute.text = listOfValutes.Valute.DKK.Name
                    txCurrentValute.text = "${listOfValutes.Valute.DKK.Value / listOfValutes.Valute.DKK.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.DKK.Previous / listOfValutes.Valute.DKK.Nominal} Rubles"
                }
                12 -> {
                    txNameOfValute.text = listOfValutes.Valute.EUR.Name
                    txCurrentValute.text = "${listOfValutes.Valute.EUR.Value / listOfValutes.Valute.EUR.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.EUR.Previous / listOfValutes.Valute.EUR.Nominal} Rubles"
                }
                13 -> {
                    txNameOfValute.text = listOfValutes.Valute.GBP.Name
                    txCurrentValute.text = "${listOfValutes.Valute.GBP.Value / listOfValutes.Valute.GBP.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.GBP.Previous / listOfValutes.Valute.GBP.Nominal} Rubles"
                }
                14 -> {
                    txNameOfValute.text = listOfValutes.Valute.HKD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.HKD.Value / listOfValutes.Valute.HKD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.HKD.Previous / listOfValutes.Valute.HKD.Nominal} Rubles"
                }
                15 -> {
                    txNameOfValute.text = listOfValutes.Valute.HUF.Name
                    txCurrentValute.text = "${listOfValutes.Valute.HUF.Value / listOfValutes.Valute.HUF.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.HUF.Previous / listOfValutes.Valute.HUF.Nominal} Rubles"
                }
                16 -> {
                    txNameOfValute.text = listOfValutes.Valute.INR.Name
                    txCurrentValute.text = "${listOfValutes.Valute.INR.Value / listOfValutes.Valute.INR.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.INR.Previous / listOfValutes.Valute.INR.Nominal} Rubles"
                }
                17 -> {
                    txNameOfValute.text = listOfValutes.Valute.JPY.Name
                    txCurrentValute.text = "${listOfValutes.Valute.JPY.Value / listOfValutes.Valute.JPY.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.JPY.Previous / listOfValutes.Valute.JPY.Nominal} Rubles"
                }
                18 -> {
                    txNameOfValute.text = listOfValutes.Valute.KGS.Name
                    txCurrentValute.text = "${listOfValutes.Valute.KGS.Value / listOfValutes.Valute.KGS.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.KGS.Previous / listOfValutes.Valute.KGS.Nominal} Rubles"
                }
                19 -> {
                    txNameOfValute.text = listOfValutes.Valute.KRW.Name
                    txCurrentValute.text = "${listOfValutes.Valute.KRW.Value / listOfValutes.Valute.KRW.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.KRW.Previous / listOfValutes.Valute.KRW.Nominal} Rubles"
                }
                20 -> {
                    txNameOfValute.text = listOfValutes.Valute.KZT.Name
                    txCurrentValute.text = "${listOfValutes.Valute.KZT.Value / listOfValutes.Valute.KZT.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.KZT.Previous / listOfValutes.Valute.KZT.Nominal} Rubles"
                }
                21 -> {
                    txNameOfValute.text = listOfValutes.Valute.MDL.Name
                    txCurrentValute.text = "${listOfValutes.Valute.MDL.Value / listOfValutes.Valute.MDL.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.MDL.Previous / listOfValutes.Valute.MDL.Nominal} Rubles"
                }
                22 -> {
                    txNameOfValute.text = listOfValutes.Valute.NOK.Name
                    txCurrentValute.text = "${listOfValutes.Valute.NOK.Value / listOfValutes.Valute.NOK.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.NOK.Previous / listOfValutes.Valute.NOK.Nominal} Rubles"
                }
                23 -> {
                    txNameOfValute.text = listOfValutes.Valute.PLN.Name
                    txCurrentValute.text = "${listOfValutes.Valute.PLN.Value / listOfValutes.Valute.PLN.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.PLN.Previous / listOfValutes.Valute.PLN.Nominal} Rubles"
                }
                24-> {
                    txNameOfValute.text = listOfValutes.Valute.RON.Name
                    txCurrentValute.text = "${listOfValutes.Valute.RON.Value / listOfValutes.Valute.RON.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.RON.Previous / listOfValutes.Valute.RON.Nominal} Rubles"
                }
                25-> {
                    txNameOfValute.text = listOfValutes.Valute.SEK.Name
                    txCurrentValute.text = "${listOfValutes.Valute.SEK.Value / listOfValutes.Valute.SEK.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.SEK.Previous / listOfValutes.Valute.SEK.Nominal} Rubles"
                }
                26-> {
                    txNameOfValute.text = listOfValutes.Valute.SGD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.SGD.Value / listOfValutes.Valute.SGD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.SGD.Previous / listOfValutes.Valute.SGD.Nominal} Rubles"
                }
                27-> {
                    txNameOfValute.text = listOfValutes.Valute.TJS.Name
                    txCurrentValute.text = "${listOfValutes.Valute.TJS.Value / listOfValutes.Valute.TJS.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.TJS.Previous / listOfValutes.Valute.TJS.Nominal} Rubles"
                }
                28-> {
                    txNameOfValute.text = listOfValutes.Valute.TMT.Name
                    txCurrentValute.text = "${listOfValutes.Valute.TMT.Value / listOfValutes.Valute.TMT.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.TMT.Previous / listOfValutes.Valute.TMT.Nominal} Rubles"
                }
                29-> {
                    txNameOfValute.text = listOfValutes.Valute.TRY.Name
                    txCurrentValute.text = "${listOfValutes.Valute.TRY.Value / listOfValutes.Valute.TRY.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.TRY.Previous / listOfValutes.Valute.TRY.Nominal} Rubles"
                }
                30-> {
                    txNameOfValute.text = listOfValutes.Valute.UAH.Name
                    txCurrentValute.text = "${listOfValutes.Valute.UAH.Value / listOfValutes.Valute.UAH.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.UAH.Previous / listOfValutes.Valute.UAH.Nominal} Rubles"
                }
                0-> {
                    txNameOfValute.text = listOfValutes.Valute.USD.Name
                    txCurrentValute.text = "${listOfValutes.Valute.USD.Value / listOfValutes.Valute.USD.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.USD.Previous / listOfValutes.Valute.USD.Nominal} Rubles"
                }
                32-> {
                    txNameOfValute.text = listOfValutes.Valute.UZS.Name
                    txCurrentValute.text = "${listOfValutes.Valute.UZS.Value / listOfValutes.Valute.UZS.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.UZS.Previous / listOfValutes.Valute.UZS.Nominal} Rubles"
                }
                33-> {
                    txNameOfValute.text = listOfValutes.Valute.XDR.Name
                    txCurrentValute.text = "${listOfValutes.Valute.XDR.Value / listOfValutes.Valute.XDR.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.XDR.Previous / listOfValutes.Valute.XDR.Nominal} Rubles"
                }
                31-> {
                    txNameOfValute.text = listOfValutes.Valute.ZAR.Name
                    txCurrentValute.text = "${listOfValutes.Valute.ZAR.Value / listOfValutes.Valute.ZAR.Nominal} Rubles"
                    txPreviousValute.text = "${listOfValutes.Valute.ZAR.Previous / listOfValutes.Valute.ZAR.Nominal} Rubles"
                }
            }
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