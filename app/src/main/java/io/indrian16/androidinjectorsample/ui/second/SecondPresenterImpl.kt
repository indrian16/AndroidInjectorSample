package io.indrian16.androidinjectorsample.ui.second

import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Inject

class SecondPresenterImpl @Inject constructor(private val secondView: SecondView, private val  hello: Hello) : SecondPresenter {

    override fun getHello() {

        secondView.loadHello(hello.message)
    }
}