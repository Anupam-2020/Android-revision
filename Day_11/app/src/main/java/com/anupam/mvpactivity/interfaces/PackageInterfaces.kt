package com.anupam.mvpactivity.interfaces

interface PackageInterfaces {

    interface DataView {
        fun initView()
        fun updateView()
    }

    interface Presenter{
        fun incrementValue() // presenter will ask model to change the value on button click.
        fun getCounter(): String // presenter will ask the Activity class to update the view.
    }

    interface DataModel{
        fun incrementCounter() // gets instruction from presenter to increment counter.
        fun getCounterValue(): Int // returns count value to presenter.
    }
}