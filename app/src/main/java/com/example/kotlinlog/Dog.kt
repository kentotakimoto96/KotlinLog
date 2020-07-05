package com.example.kotlinlog

import android.util.Log

open class Dog: Animal,Mobable{

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name,age) {
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインタフェースのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}