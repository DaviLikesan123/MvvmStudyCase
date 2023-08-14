package br.com.mvvm.mvvmstudycase.repositories

import br.com.mvvm.mvvmstudycase.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllLives() = retrofitService.getAllLives()

}