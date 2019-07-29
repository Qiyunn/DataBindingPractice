package com.example.databindingpractice

import android.arch.lifecycle.MutableLiveData
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField

class Models{
//    var email = ObservableField<String>()
//    var pass = ObservableField<String>()
    var email = MutableLiveData<String>()
    var pass = MutableLiveData<String>()

    fun returnCaptal(text:String):String{
        return text.toUpperCase()
    }

//    @get:Bindable
//    var email:String? = null
//
//    set(value) {
//        field=value
//        notifyPropertyChanged(BR.email)
//
//    }
//
//    @get:Bindable
//    var pass:String? =null
//        set(value) {
//        field = value
//        notifyPropertyChanged(BR.pass)
//    }
}