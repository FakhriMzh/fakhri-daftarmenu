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
import kotlinx.android.synthetic.main.makanan_fragment.rv_makanan

class MakananFragment : Fragment () {
    companion object{
        fun  getInstace(): MakananFragment {
            return MakananFragment()
        }
    }
    val dataMakanan= mutableListOf<MenuModel>()
    val rvAdapter=RvAdapter(dataMakanan)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout.makanan_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_makanan.adapter=rvAdapter
        rv_makanan.layoutManager=LinearLayoutManager(context)

        addDummyData()
    }
    private fun addDummyData(){
        dataMakanan.add(
            MenuModel("Mie Goreng",
                "Rp 8.000",
                R.drawable.mie_goreng
            ))
        dataMakanan.add(
            MenuModel("CapCay",
                "Rp 80.000",
                R.drawable.capcay
            ))

        rvAdapter.notifyDataSetChanged()
    }
}