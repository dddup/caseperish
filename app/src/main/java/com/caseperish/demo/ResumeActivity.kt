package com.caseperish.demo

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by wanjian on 2017/2/14.
 */
class ResumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crash)
    }


    override fun onResume() {
        super.onResume()
        Log.e("crash","生命周期异常")
        testResume()
    }

    private fun testCrash(a: String) {
        var a :String?= null
        a!!.toString()
    }
    private fun testResume( ) {
        var a :String?= null
        a!!.toString()
    }
}