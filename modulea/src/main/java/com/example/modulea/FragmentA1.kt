package com.example.modulea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.modulea.databinding.FragmentA1Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentA1 : Fragment() {
    private var binding: FragmentA1Binding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentA1Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}