package com.d.mydrawerapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SubHomeViewModel : ViewModel() {

    private var _txt = MutableLiveData<String>().apply {
        value = "Next"
    }

    var btnText :LiveData<String> = _txt
}
