package kr.co.tjoeun.pizzachickenstore_20200610

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
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

        callPhoneBtn.setOnClickListener {

            val permssionListener = object : PermissionListener {
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${store.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "권한 거부로 전화연결 불가능", Toast.LENGTH_SHORT).show()
                }

            }

            TedPermission.with(mContext)
                .setPermissionListener(permssionListener)
                .setDeniedMessage("설정에서 권한허가를 해줘야 통화가 가능합니다.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }

    }

    override fun setValues() {

        store = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(store.logoUrl).into(logoImg)
        nameTxt.text = store.name
        phoneNumTxt.text = store.phoneNum

    }

}
