package com.anupam.recycleractivity.listView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.anupam.recycleractivity.BasicInfo
import com.anupam.recycleractivity.R
import com.anupam.recycleractivity.databinding.FragmentFirstBinding
import com.anupam.recycleractivity.databinding.FragmentListViewBinding


class ListViewFragment : Fragment() {

    private var _binding: FragmentListViewBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentListViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val dataList = Array<BasicInfo>(1){
//            BasicInfo("Anupam","Anand@gmail.com")
//        }

        val dataList = arrayListOf(
            BasicInfo("Anupam","anupam@gmail.com"),
            BasicInfo("Anupam","anupam@gmail.com"),
        )


        val adapter = ArrayAdapter(requireContext(),R.layout.support_simple_spinner_dropdown_item,dataList)
        binding.LstView.adapter = adapter
    }


}