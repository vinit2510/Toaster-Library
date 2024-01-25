package com.vinit.toaster

import android.content.Context
import android.widget.Toast

class Toaster {
    fun toast(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}