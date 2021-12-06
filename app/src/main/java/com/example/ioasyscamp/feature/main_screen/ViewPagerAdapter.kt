package com.example.ioasyscamp.feature.main_screen

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ioasyscamp.R
import com.example.ioasyscamp.feature.about_me.AboutMeFragment
import com.example.ioasyscamp.feature.cultural_fit.CulturalFitFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, private val fragmet: Fragment) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> AboutMeFragment()
            else -> CulturalFitFragment()
        }
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> fragmet.getString(R.string.about_me_label)
            else -> fragmet.getString(R.string.cultural_fit_label)
        }
    }
}