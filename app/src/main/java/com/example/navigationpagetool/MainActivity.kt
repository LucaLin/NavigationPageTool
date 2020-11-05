package com.example.navigationpagetool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://medium.com/@wsrew2000/android-navigation-%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98-%E4%B8%80-%E5%9F%BA%E7%A4%8E%E4%BD%BF%E7%94%A8-3c1607ce4d38
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        """
            enterAnim：目標頁進來的動畫
            exitAnim：當前頁退出的動畫
            popEnterAnim：按下返回鍵，目標頁進來的動畫
            popExitAnim：按下返回鍵，當前頁退出的動畫
        """
    }
}
