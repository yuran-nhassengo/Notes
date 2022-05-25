package com.lamarck.journale

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity

 abstract class BaseActivity :FragmentActivity() {

     protected abstract val tag : String
     protected abstract fun getLayout(): Int

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(getLayout())
         Log.v(tag,"[ON CREATE ]")
     }

     override fun onPostCreate(savedInstanceState: Bundle?) {
         super.onPostCreate(savedInstanceState)
         Log.v(tag,"[ON POST CREATE ]")
     }

     override fun onRestart() {
         super.onRestart()
         Log.v(tag,"[ON RESTAR ]")
     }

     override fun onResume() {
         super.onResume()
         Log.v(tag,"[ON RESUME ]")
     }

     override fun onPostResume() {
         super.onPostResume()
         Log.v(tag,"[ON POST RESUME ]")
     }

     override fun onPause() {
         super.onPause()
         Log.v(tag,"[ON PAUSE ]")
     }

     override fun onStop() {
         super.onStop()
         Log.v(tag,"[ON STOP ]")
     }

     override fun onDestroy() {
         super.onDestroy()
         Log.v(tag,"[ON DESTROY ]")
     }

}