package com.example.navigationpagetool.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment

import com.example.navigationpagetool.R
import kotlinx.android.synthetic.main.fragment_frag_a.*
import kotlinx.android.synthetic.main.fragment_frag_a.view.*

class Frag_A : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_frag_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = NavHostFragment.findNavController(this)

        nav_btn.setOnClickListener {

            //arguments屬性要設在action裡面
            val bundle = Frag_ADirections.actionFragAToFragB(edt_fragA.text.toString())

            //指定action id才會有動畫可以跑
            navController.navigate(bundle)
        }
    }
}
