package com.example.ioasyscamp.base_app

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ioasyscamp.R
import com.example.ioasyscamp.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    private val binding by lazy { FragmentSplashBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        Handler(Looper.getMainLooper()).postDelayed(
            {
                findNavController().navigate(
                    SplashFragmentDirections.actionSplashFragmentToMainScreenFragment()
                )
            }, 2000
        )
    }
}