package com.lamarck.journale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : BaseActivity() {

    override val tag ="Main activity"
    override fun getActivityTitle() =R.string.app_name
    override fun getLayout() = R.layout.activity_main




}