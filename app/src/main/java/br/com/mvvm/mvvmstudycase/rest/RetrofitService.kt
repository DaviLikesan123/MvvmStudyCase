package br.com.mvvm.mvvmstudycase.rest


import br.com.mvvm.mvvmstudycase.BuildConfig
import br.com.mvvm.mvvmstudycase.models.Live
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("lista-lives.json")
    fun getAllLives(): Call<List<Live>>

    companion object {

        private val retrofitService : RetrofitService by lazy {

            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofit.create(RetrofitService::class.java)
        }

        fun getInstance(): RetrofitService{
            return retrofitService
        }

    }
}