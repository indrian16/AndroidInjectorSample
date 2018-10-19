package io.indrian16.androidinjectorsample.ui.third

import dagger.Module
import dagger.Provides
import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Named

@Module
class ThirdActivityModule {

    @Provides
    fun provideThirdView(thirdActivity: ThirdActivity): ThirdView = thirdActivity

    @Provides
    fun provideThirdPresenter(thirdView: ThirdView, @Named("third") hello: Hello): ThirdPresenter =

            ThirdPresenterImpl(thirdView, hello)
}