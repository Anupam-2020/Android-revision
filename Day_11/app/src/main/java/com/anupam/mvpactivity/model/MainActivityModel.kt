package com.anupam.mvpactivity.model

import com.anupam.mvpactivity.interfaces.PackageInterfaces

class MainActivityModel: PackageInterfaces.DataModel {

    private var counter = 0
    override fun incrementCounter() {
        counter += 1
    }

    override fun getCounterValue(): Int {
        return counter
    }
}