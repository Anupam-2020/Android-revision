package com.dfarm.viewmodelactivity

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dfarm.viewmodelactivity.databinding.FragmentSecondBinding
import kotlinx.coroutines.*


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        binding.counterBtn.setOnClickListener {
            binding.textviewSecond.text = "${binding.textviewSecond.text.toString().toInt()+1}"
            Log.i("Thread","${Thread.currentThread().name}")
        }
        
        binding.longRunning.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                executeLongRunning()
                Log.i("@Back","1 - ${Thread.currentThread().name}")
            }

            GlobalScope.launch(Dispatchers.IO) {
                executeLongRunning()
                Log.i("@Back","2 - ${Thread.currentThread().name}")
            }

            CoroutineScope(Dispatchers.IO).launch {
                task1()
            }
            CoroutineScope(Dispatchers.IO).launch {
                task2()
            }
        }
    }

    suspend fun task1() {
        Log.i("TAG","STARTING TASK 1")
        delay(2000)
        Log.i("TAG","ENDING TASK 1")
    }

    suspend fun task2() {
        Log.i("TAG","STARTING TASK 2")
        delay(2000)
        Log.i("TAG","ENDING TASK 2")
    }

    fun executeLongRunning() {
        for (i in 1..1000000000L) {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}