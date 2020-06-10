package kr.co.tjoeun.pizzachickenstore_20200610.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizzachickenstore_20200610.fragments.ChickenStoreListFragment
import kr.co.tjoeun.pizzachickenstore_20200610.fragments.PizzaStoreListFragment

class StoreFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 가게"
            else -> "치킨집"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoreListFragment()
            else -> ChickenStoreListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}