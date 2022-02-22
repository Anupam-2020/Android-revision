package com.anupam.mvpactivity.presenter

import com.anupam.mvpactivity.interfaces.PackageInterfaces
import com.anupam.mvpactivity.model.MainActivityModel

class MainActivityPresenter(view: PackageInterfaces.DataView): PackageInterfaces.Presenter {

    private var view: PackageInterfaces.DataView = view
    private var model: PackageInterfaces.DataModel = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

    override fun getCounter(): String {
        return model.getCounterValue().toString()
    }
}