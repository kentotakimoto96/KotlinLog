package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("太郎", 25, "サッカー")      // 名前を太郎、年齢25歳で、Humanのインスタンスを作る

        taro.say()
        taro.Think()

        val yuki = Human("ゆうき", 15, "テニス")     // 名前をゆうき、年齢15歳で、Humanのインスタンスを作る

        yuki.say()
        yuki.Think()

    }
}