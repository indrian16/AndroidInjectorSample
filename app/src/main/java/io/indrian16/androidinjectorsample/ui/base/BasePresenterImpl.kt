package io.indrian16.androidinjectorsample.ui.base

import io.indrian16.androidinjectorsample.model.Hello
import javax.inject.Inject

class BasePresenterImpl @Inject constructor(private val baseView: BaseView, private val hello: Hello): BasePresenter {

    override fun getHello() {

        baseView.loadHello(hello.message)
    }
}