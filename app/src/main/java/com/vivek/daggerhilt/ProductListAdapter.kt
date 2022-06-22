package com.vivek.daggerhilt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.vivek.daggerhilt.databinding.ContaintItemBinding

class ProductListAdapter(private val mList:List<ProductList>):RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val mBinding = ContaintItemBinding.inflate(inflater)
        return ViewHolder(mBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(mList[position])

    override fun getItemCount() = mList.size



    inner class ViewHolder(private val mBinding:ContaintItemBinding):RecyclerView.ViewHolder(mBinding.root){
        fun bind(item:ProductList){
            mBinding.name.text = item.toString()
            mBinding.executePendingBindings()
        }
    }
}