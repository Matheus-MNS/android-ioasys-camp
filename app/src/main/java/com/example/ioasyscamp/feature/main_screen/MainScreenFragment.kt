package com.example.ioasyscamp.feature.main_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ioasyscamp.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {

    private val binding by lazy { FragmentMainScreenBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.actionBar?.elevation = 0f

        with(binding) {
            viewPager.adapter = ViewPagerAdapter(childFragmentManager, this@MainScreenFragment)
            viewPagerTab.setupWithViewPager(viewPager)
        }
    }
}