package com.d.mydrawerapp.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.d.mydrawerapp.R

class SubSubHomeFragment : Fragment() {

    companion object {
        fun newInstance() = SubSubHomeFragment()
    }

    private lateinit var viewModel: SubSubHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sub_sub_home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubSubHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
