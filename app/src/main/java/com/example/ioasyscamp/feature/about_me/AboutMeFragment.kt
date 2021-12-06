package com.example.ioasyscamp.feature.about_me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ioasyscamp.databinding.FragmentAboutMeBinding


class AboutMeFragment : Fragment() {

    private val binding by lazy { FragmentAboutMeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }

}