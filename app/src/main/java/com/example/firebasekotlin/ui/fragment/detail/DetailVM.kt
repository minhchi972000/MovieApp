package com.example.firebasekotlin.ui.fragment.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasekotlin.data.database.movie.MovieDBO

class DetailVM : ViewModel() {

    /*val getSelectedItem: LiveData<MovieDBO> get() = mutableSelectedItem
    private val mutableSelectedItem = MutableLiveData<MovieDBO>()
    fun setSelectItem(movie: MovieDBO) {
        mutableSelectedItem.value = movie
    }*/

    val selectedItemLiveData = MutableLiveData<MovieDBO>()
    var selectedItem: MovieDBO? = null
}