package com.theapache64.nemo.feature.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.theapache64.twinkill.utils.livedata.SingleLiveEvent

/**
 * Created by theapache64 : Jul 26 Sun,2020 @ 22:07
 */
open class BaseViewModel : ViewModel() {

    private val _snackBarMsg = SingleLiveEvent<Any>()
    val snackBarMsg: LiveData<Any> = _snackBarMsg

    private val _toastMsg = MutableLiveData<Any>()
    val toastMsg: LiveData<Any> = _toastMsg
}