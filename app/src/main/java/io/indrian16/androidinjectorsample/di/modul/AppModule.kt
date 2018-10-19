package io.indrian16.androidinjectorsample.di.modul

import dagger.Module
import dagger.Provides
import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideSayHello(): Hello = Hello("I Love Dagger 2")

    @Provides
    @Singleton
    @Named("second")
    internal fun provideSayKotlin(): Hello = Hello("I Love Kotlin")

    @Provides
    @Singleton
    @Named("third")
    internal fun provideThird(): Hello = Hello("I Love Android")
}