package kr.co.tjoeun.pizzachickenstore_20200610.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.pizzachickenstore_20200610.R
import kr.co.tjoeun.pizzachickenstore_20200610.datas.PizzaStore

class PizzaStoreAdapter(
    val mContext:Context,
    val resId:Int,
    val mList:List<PizzaStore>) : ArrayAdapter<PizzaStore>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }
        
//        row가 절대 null 아님을 보장하면서 대입
        val row = tempRow!!
        
//        row에 실제 데이터를 뿌려주고
        
        
//        완성된 row를 리스트뷰의 재료로 리턴
        return row
        
    }

}