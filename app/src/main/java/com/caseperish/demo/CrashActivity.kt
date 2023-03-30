package com.caseperish.demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by wanjian on 2017/2/14.
 */
class CrashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crash)
        findViewById<Button>(R.id.button1).setOnClickListener {
            Log.e("crash", "数组越界了")
            var array = mutableListOf<Int>()
            array[2] = 1
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.e("crash", "空指针")
            var array: MutableList<String>? = null
            array!!.size
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.e("crash", "参数异常")
            var array: String? = null
            testCrash(array!!)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            Log.e("crash", "类型转换")
            var array = mutableListOf<Int>()
            array as MutableMap<String,String>
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            Log.e("crash", "anr")
            Thread.sleep(10000)
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            startActivity(Intent(this@CrashActivity,ResumeActivity::class.java))
        }
    }

//
//    override fun onResume() {
//        super.onResume()
//        testResume()
//    }

    private fun testCrash(a: String) {
        var a :String?= null
        a!!.toString()
    }
    private fun testResume( ) {
        var a :String?= null
        a!!.toString()
    }
}