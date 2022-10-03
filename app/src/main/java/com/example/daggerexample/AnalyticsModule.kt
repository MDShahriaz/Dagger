package com.example.daggerexample

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService():AnalyticsService{
        return MixPanel()
    }
}