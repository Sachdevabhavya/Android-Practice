package com.example.viewpagerapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(fm: FragmentManager , lc :Lifecycle):FragmentStateAdapter(fm,lc) {

    var fragmentsList : ArrayList<Fragment> = ArrayList()

    fun addFragmentToList(fragment: Fragment)
    {
        fragmentsList.add(fragment)
    }
    override fun getItemCount(): Int {
        return fragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentsList.get(position)
    }
}