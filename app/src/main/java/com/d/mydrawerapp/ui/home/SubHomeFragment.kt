package com.d.mydrawerapp.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.findNavController

import com.d.mydrawerapp.R
import kotlinx.android.synthetic.main.sub_home_fragment.*

class SubHomeFragment : Fragment() {

    companion object {
        fun newInstance() = SubHomeFragment()
    }

    private lateinit var viewModel: SubHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sub_home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubHomeViewModel::class.java)
        viewModel.btnText.observe(this, Observer {
            btn_next.text = it
        })

        btn_next.setOnClickListener {
            it.findNavController().navigate(R.id.subSubHomeFragment)
        }
    }

}
