package fr.dleurs.android.counterapp

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    var number = 0
    fun increment(){
        number++
    }
    fun decrement() {
        number--
    }
}