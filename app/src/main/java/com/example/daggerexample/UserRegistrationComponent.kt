package com.example.daggerexample

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class,
AnalyticsModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}