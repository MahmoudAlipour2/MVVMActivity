package ir.iwithyou.mvvmactivity.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {


    //Observable
    val observable = MutableLiveData<String>()

    fun getUser() {
        observable.value = "Mahmoud"
    }
}