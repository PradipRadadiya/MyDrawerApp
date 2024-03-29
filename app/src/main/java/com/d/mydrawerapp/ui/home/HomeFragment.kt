package com.d.mydrawerapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.d.mydrawerapp.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        val btn: Button = root.findViewById(R.id.btn_home)

        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })

        homeViewModel.btn.observe(this, Observer {
            btn.text = it
        })

        btn.setOnClickListener {
            it.findNavController().navigate(R.id.subHomeFragment)
        }
        return root
    }
}