package com.example.sillycounter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(
    val counter: MutableLiveData<Int> = MutableLiveData(0)
) : ViewModel()
