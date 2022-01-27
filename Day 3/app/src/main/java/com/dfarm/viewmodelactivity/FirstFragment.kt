package com.dfarm.viewmodelactivity

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.dfarm.viewmodelactivity.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private lateinit var fragmentViewModel: FragmentViewModel

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentViewModel = ViewModelProvider(this)[FragmentViewModel::class.java]
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }


        val viewModel: FragmentViewModel by activityViewModels()
        binding.vm = viewModel
        binding.lifecycleOwner = this
        viewModel.prg.observe(viewLifecycleOwner) {
            Log.i("seek", it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}