package com.example.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var viewpager2 : ViewPager2
    lateinit var myadapter: MyPagerAdapter
    lateinit var tabLayout: TabLayout

    var tabsArray = arrayOf("MyApp","Coding" , "Last Advice")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager2 = findViewById(R.id.viewPager2)
        viewpager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        myadapter = MyPagerAdapter(supportFragmentManager , lifecycle)
        myadapter.addFragmentToList(FragmentOne())
        myadapter.addFragmentToList(Fragment2())
        myadapter.addFragmentToList(Fragment3())

        viewpager2.adapter = myadapter

        tabLayout = findViewById(R.id.tablayout)
        TabLayoutMediator(
            tabLayout,viewpager2
        ){
            tab,position ->
            tab.text = tabsArray[position]
        }.attach()


    }
}