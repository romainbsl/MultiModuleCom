package com.example.featurea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.featurea.databinding.FragmentA2Binding

class FragmentA2 : Fragment() {
    private var binding: FragmentA2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /* Getting cross-module navigation arg using safe-args */
        val safeArgs: FragmentA2Args by navArgs()
        val argument = safeArgs.data
        println("Feature A2 got data $argument")

        binding = FragmentA2Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}