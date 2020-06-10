package kr.co.tjoeun.pizzachickenstore_20200610

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}