package io.indrian16.androidinjectorsample.ui.second

import dagger.Module
import dagger.Provides
import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Named

@Module
class SecondActivityModule {

    @Provides
    fun provideSecondView(secondActivity: SecondActivity): SecondView = secondActivity

    @Provides
    fun provideSecondPresenter(secondView: SecondView, @Named("second") hello: Hello): SecondPresenter = SecondPresenterImpl(secondView, hello)
}