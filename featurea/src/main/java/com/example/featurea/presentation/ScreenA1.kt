package com.example.featurea.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.featurea.R
import com.example.featurea.databinding.FragmentA1Binding
import com.example.featurea.domain.repositories.BasketRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class ScreenA1 : Fragment() {
    private var binding: FragmentA1Binding? = null

    @Inject
    lateinit var basketRepository: BasketRepository

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

        addProductBtn.setOnClickListener {
            lifecycleScope.launch {
                println("adding product")
                basketRepository.updateOffer("product", 1)
            }
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}