package com.example.navigationpagetool.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs

import com.example.navigationpagetool.R
import kotlinx.android.synthetic.main.fragment_frag_a.*
import kotlinx.android.synthetic.main.fragment_frag_a.nav_btn
import kotlinx.android.synthetic.main.fragment_frag_b.*


class Frag_B : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = NavHostFragment.findNavController(this)
        //arguments屬性要設在action外面
        val args:Frag_BArgs by navArgs()//需要implementation "androidx.navigation:navigation-fragment-ktx:2.3.1"
        txv_result.text =args.name

        nav_btn.setOnClickListener {
            //指定action id才會有動畫可以跑
            navController.navigate(R.id.action_frag_B_to_frag_A)
        }
    }

}
