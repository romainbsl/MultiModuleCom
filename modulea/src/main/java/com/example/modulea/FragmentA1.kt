package com.example.modulea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.modulea.databinding.FragmentA1Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentA1 : Fragment() {
    private var binding: FragmentA1Binding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = FragmentA1Binding.inflate(inflater, container, false)
        this.binding = binding
        binding.initViews()
        return binding.root
    }

    private fun FragmentA1Binding.initViews() {
        navToNextScreen.setOnClickListener {
            findNavController().navigate(R.id.fragmentA2)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}