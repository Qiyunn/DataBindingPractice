package com.example.databindingpractice

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.databindingpractice.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(),ClickEvent {


    var models:Models? = null
    var  binding: ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null){
            Log.d("savedInstanceState","is null")
        }
        else{
            Log.d("savedInstanceState","is not null")
        }

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.lifecycleOwner=this

        models = Models()
        models?.email!!.value=("old email")
        models?.pass!!.value=("1111")

        binding?.setVariable(BR.buttonclick,this)
        binding?.setVariable(BR.userModel,models)





    }

    override fun click(view: View) {


        models?.email!!.value=("new email")
        models?.pass!!.value=("1234")



//        binding?.setVariable(BR.userModel,models)
//        binding?.executePendingBindings()
        Toast.makeText(this,"hello hello",Toast.LENGTH_SHORT).show()
    }


}
