package com.example.daggerexample

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

class MixPanel:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("MSG","MixPanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("MSG","Firebase Analytics - $eventName - $eventType")
    }

}