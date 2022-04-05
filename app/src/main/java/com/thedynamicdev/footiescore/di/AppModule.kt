package com.thedynamicdev.footiescore.di

import com.thedynamicdev.footiescore.common.BASE_URL
import com.thedynamicdev.footiescore.network.ApiFootballService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @[Singleton Provides]
    fun provideApiFootballService(): ApiFootballService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(ApiFootballService::class.java)
    }
}