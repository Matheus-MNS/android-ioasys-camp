package com.example.ioasyscamp.feature.cultural_fit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ioasyscamp.R
import com.example.ioasyscamp.databinding.FragmentCulturalFitBinding


class CulturalFitFragment : Fragment() {

    private val binding by lazy { FragmentCulturalFitBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }

}