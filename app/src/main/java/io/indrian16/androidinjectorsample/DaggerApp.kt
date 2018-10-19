package io.indrian16.androidinjectorsample

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.indrian16.androidinjectorsample.di.component.DaggerAppComponent
import io.indrian16.androidinjectorsample.di.modul.AppModule
import javax.inject.Inject

class DaggerApp : Application(), HasActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {

        return dispatchingAndroidInjector
    }
}