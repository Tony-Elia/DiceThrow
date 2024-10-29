package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel() {
    private val dieValue = MutableLiveData<Int>();

    fun getDieValue() : LiveData<Int> = dieValue;

    fun setDieValue(value : Int) {
        dieValue.value = value;
    }
}