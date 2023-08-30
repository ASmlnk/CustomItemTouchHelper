package com.bignerdranch.android.customitemtouchhelper

interface CustomItemTouchHelperListener {

    fun onItemMove(fromPosition: Int, toPosition: Int)

    fun onItemSwiped(position: Int)

    fun onItemClear(position: Int)

}