package com.anupam.mvpactivity.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.anupam.mvpactivity.R
import com.anupam.mvpactivity.interfaces.PackageInterfaces
import com.anupam.mvpactivity.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), PackageInterfaces.DataView {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        findViewById<TextView>(R.id.textView).text = presenter?.getCounter()
        findViewById<Button>(R.id.button).setOnClickListener {
            presenter?.incrementValue()
        }
    }

    override fun updateView() {
        findViewById<TextView>(R.id.textView).text = presenter?.getCounter()
    }
}