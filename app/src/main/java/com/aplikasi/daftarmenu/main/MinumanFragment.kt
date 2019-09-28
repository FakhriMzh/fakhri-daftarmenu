package com.aplikasi.daftarmenu.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplikasi.daftarmenu.R
import com.aplikasi.daftarmenu.R.layout
import com.aplikasi.daftarmenu.data.MenuModel
import kotlinx.android.synthetic.main.minuman_fragment.rv_minuman

class MinumanFragment : Fragment () {
    companion object{
        fun  getInstace(): MinumanFragment {
            return MinumanFragment()
        }
    }

    val dataMinuman= mutableListOf<MenuModel>()
    val rvAdapter=RvAdapter(dataMinuman)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout.minuman_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_minuman.adapter=rvAdapter
        rv_minuman.layoutManager= LinearLayoutManager(context)

        addDummyData()
    }
    private fun addDummyData(){
        dataMinuman.add(
            MenuModel("Froster"
                ,"Rp 7.000"
                ,R.drawable.froster
            ))
        dataMinuman.add(
            MenuModel("CapCin"
                ,"Rp 5.000"
                ,R.drawable.capcin
            ))
        dataMinuman.add(
            MenuModel("Pop Ice"
                ,"Rp 4.000"
                ,R.drawable.popice
            ))

        rvAdapter.notifyDataSetChanged()
    }


}