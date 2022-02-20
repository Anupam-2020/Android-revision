package com.dfarm.viewmodelactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class FragmentViewModel: ViewModel() {

    val prg: MutableLiveData<String> = MutableLiveData("0")

    fun onPrgCh(pr: Int) {
        prg.value = "$pr"
    }

}