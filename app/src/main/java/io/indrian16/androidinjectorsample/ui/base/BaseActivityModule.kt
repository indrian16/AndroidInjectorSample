package io.indrian16.androidinjectorsample.ui.base

import dagger.Module
import dagger.Provides
import io.indrian16.androidinjectorsample.model.Hello

@Module
class BaseActivityModule {

    @Provides
    fun provideBaseView(baseActivity: BaseActivity): BaseView = baseActivity

    @Provides
    fun provideBasePresenter(baseView: BaseView, hello: Hello): BasePresenter = BasePresenterImpl(baseView, hello)
}