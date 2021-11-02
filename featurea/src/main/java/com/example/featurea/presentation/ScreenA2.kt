package com.example.featurea.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.featurea.databinding.FragmentA2Binding
import com.example.featurea.presentation.viewmodel.ScreenA2ViewModel
import com.example.shared.contracts.DataChecker
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ScreenA2 : Fragment() {
    private var binding: FragmentA2Binding? = null


    private val viewModel: ScreenA2ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val argument = arguments?.getInt("data")
        println("Screen A2 got data $argument")

        viewModel.check()

        binding = FragmentA2Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}