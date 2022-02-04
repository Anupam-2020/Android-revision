package com.anupam.myapplication.rxJava

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.anupam.myapplication.R
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.Executor

class RxActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Main"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rx)

//        fromOperator()
//        justOperator()
//        fromIterableOperator()


//        rangeOperator().subscribe({
//            Log.i(TAG,"onNext $it")
//        }, {
//            Log.i(TAG,"onError $it")
//        },
//            {
//                Log.i(TAG,"onComplete")
//            }
//        )


//        repeatOperator().subscribe({
//            Log.i(TAG,"onNext $it")
//        },{
//            Log.i(TAG,"onError $it")
//        },{
//            Log.i(TAG,"onComplete")
//        })



//        intervalOperator().subscribe({
//            Log.i(TAG,"onNext $it")
//            getMessage()
//        },
//            {
//                Log.i(TAG,"onError $it")
//            },
//            {
//                Log.i(TAG,"onComplete")
//            }
//        )


//        createOperator().subscribe(
//            {
//                Log.i(TAG,"onNext $it")
//            },
//            {
//                Log.i(TAG,"onError $it")
//            }
//        )


//        filterOperator()
//            .filter{
//                it.age > 23 && it.name == "Anupam2"
//            }
//            .subscribe(
//                {
//                    Log.i(TAG,"onNext $it")
//                },
//                {
//                    Log.i(TAG,"onError $it")
//                },
//                {
//                    Log.i(TAG,"onComplete")
//                }
//            )


        lastOperator()
            .last(User(4,"Anurag",20))
//            .lastElement()
//            .lastOrError()
            .subscribeOn(Schedulers.computation())
//            .observeOn(Schedulers.io())
            .subscribe({
                Log.i(TAG,"onNext $it")
                Log.i(TAG,Thread.currentThread().name)
            },{
                Log.i(TAG,"onError $it")
            })
    }

    fun getMessage() {
        Log.i(TAG,"Message")
    }
}