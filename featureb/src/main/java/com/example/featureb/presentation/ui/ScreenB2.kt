package com.example.featureb.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.featureb.databinding.FragmentB2Binding
import com.example.shared.NavEventBus
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ScreenB2 : Fragment() {
    private var binding: FragmentB2Binding? = null

    @Inject
    lateinit var navEventBus: NavEventBus

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentB2Binding.inflate(inflater, container, false)
        this.binding = binding
        binding.initViews()
        return binding.root
    }

    private fun FragmentB2Binding.initViews() {
        deeplinkFeatureA2.setOnClickListener {
            navEventBus.navToScreenA2(5)
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}