package kr.co.tjoeun.pizzachickenstore_20200610

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store.*
import kr.co.tjoeun.pizzachickenstore_20200610.datas.PizzaStore

class ViewStoreActivity : BaseActivity() {

    lateinit var store:PizzaStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        store = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(store.logoUrl).into(logoImg)
        nameTxt.text = store.name
        phoneNumTxt.text = store.phoneNum

    }

}
