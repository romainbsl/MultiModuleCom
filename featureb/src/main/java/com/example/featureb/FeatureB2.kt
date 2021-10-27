package com.example.featureb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.featureb.databinding.FragmentB2Binding
import com.example.shared.AppEventBus
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeatureB2 : Fragment() {
    private var binding: FragmentB2Binding? = null

    @Inject
    lateinit var appEventBus: AppEventBus

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
            appEventBus.navToFeatureA2()
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}