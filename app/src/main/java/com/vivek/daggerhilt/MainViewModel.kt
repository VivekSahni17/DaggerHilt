package com.vivek.daggerhilt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val mProduct:ProductListRepo):ViewModel() {
    private val mProductlistEmitter = MutableLiveData<List<ProductList>>()
    val productList: LiveData<List<ProductList>> = mProductlistEmitter


    init {
        loadProductList()
    }


    private fun loadProductList() {
        mProductlistEmitter.value = mProduct.getProductList()
    }

}