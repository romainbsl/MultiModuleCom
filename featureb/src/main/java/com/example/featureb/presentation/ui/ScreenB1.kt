package com.example.featureb.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.featureb.R
import com.example.featureb.databinding.FragmentB1Binding
import com.example.featureb.presentation.viewmodels.ScreenB1ViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map

@AndroidEntryPoint
class ScreenB1 : Fragment() {
    private var binding: FragmentB1Binding? = null

    private val viewModel: ScreenB1ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentB1Binding.inflate(inflater, container, false)
        this.binding = binding
        binding.initViews()
        return binding.root
    }

    private fun FragmentB1Binding.initViews() {
        goToFeatureB2.setOnClickListener {
            findNavController().navigate(R.id.featureB2)
        }
        viewModel.basketContent.map {
            println("Basket content: $it")
        }.launchIn(lifecycleScope)
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}