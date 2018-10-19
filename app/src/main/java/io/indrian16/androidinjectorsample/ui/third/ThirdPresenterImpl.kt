package io.indrian16.androidinjectorsample.ui.third

import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Inject

class ThirdPresenterImpl @Inject constructor(private val thirdView: ThirdView, private val hello: Hello) : ThirdPresenter {

    override fun getHello() {

        thirdView.loadHello(hello.message)
    }
}