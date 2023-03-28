package `in`.kb.databinding


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){

    private var counter = 0
    private var _factLiveData = MutableLiveData<Quote>(Quote("Never Gonna give you up", "Rick"))

     val factLiveData : LiveData<Quote>
        get() = _factLiveData



    fun updateFact(){
        counter++
        _factLiveData.value = Quote("Never gonna let you down #$counter","Roll")
    }



}