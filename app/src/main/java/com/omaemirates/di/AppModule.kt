package com.omaemirates.di

import com.omaemirates.model.DataModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideVisaData(): DataModel {
        return DataModel()
    }
}
