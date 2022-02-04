package com.anupam.myapplication.rxJava

import android.util.Log
import com.anupam.myapplication.rxJava.RxActivity.Companion.TAG
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.lang.Exception
import java.util.concurrent.TimeUnit


val arrayNum1 = arrayOf(1,2,3)
val mList = mutableListOf(1,2,3,4,"Hello,6,7,8,9,10")
val mList2 = mutableListOf(3,6,8,90,876)
val mUserList = mutableListOf(
    User(1,"Anupam1",23),
    User(2,"Anupam2",39),
    User(2,"Anupam3",78),
)
val mEmpty = emptyList<User>()

fun justOperator() {
    // Just (operator) — convert an object or a set of objects into an Observable that emits that or those objects
    val observable = Observable.just(1,2,3,"Hello",mList)
    val observer = object : Observer<Any> {
        override fun onSubscribe(d: Disposable) {
            Log.i(RxActivity.TAG,"onSubscribe")
        }

        override fun onNext(t: Any) {
            Log.i(RxActivity.TAG,"onNext $t")
        }

        override fun onError(e: Throwable) {
            Log.i(RxActivity.TAG,"onError $e")
        }

        override fun onComplete() {
            Log.i(RxActivity.TAG,"onComplete")
        }

    }
    observable.subscribe(observer)
}


fun fromOperator() {
    val observable = Observable.fromArray(7,mList)
    val observer = object : Observer<Any> {
        override fun onSubscribe(d: Disposable) {
            Log.i(RxActivity.TAG,"onSubscribe")
        }

        override fun onNext(t: Any) {
            Log.i(RxActivity.TAG,"onNext $t")
        }

        override fun onError(e: Throwable) {
            Log.i(RxActivity.TAG,"onError $e")
        }

        override fun onComplete() {
            Log.i(RxActivity.TAG,"onComplete")
        }

    }
    observable.subscribe(observer)
}

fun fromIterableOperator() {
    val observable = Observable.fromIterable(mList)

    val observer = object : Observer<Any> {
        override fun onSubscribe(d: Disposable) {
            Log.i(TAG,"onSubscribe")
        }

        override fun onNext(t: Any) {
            Log.i(TAG,"onNext $t")
        }

        override fun onError(e: Throwable) {
            Log.i(TAG,"onError $e")
        }

        override fun onComplete() {
            Log.i(TAG,"onComplete")
        }

    }
    observable.subscribe(observer)
}

fun rangeOperator(): Observable<Int> {

    return Observable.range(1,10)
}

fun repeatOperator(): Observable<Int> {

    return Observable.range(1,10).repeat(2)
}

fun intervalOperator(): Observable<Long> {
    return Observable.interval(5,1,TimeUnit.SECONDS).takeWhile{
        it <= 10
    }
}

fun createOperator(): Observable<Int> {
    return Observable.create {
        try {
            for (i in mList2) {
                it.onNext(i * 5)
            }
            it.onComplete()
        }
        catch (e: Exception) {
            it.onError(e)
        }
    }
}

fun filterOperator(): Observable<User> {
    return Observable.fromIterable(mUserList)
}

fun lastOperator(): Observable<User> {
    return Observable.fromIterable(mEmpty)
}