package io.indrian16.androidinjectorsample.ui.third

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import io.indrian16.androidinjectorsample.R
import kotlinx.android.synthetic.main.activity_third.*
import javax.inject.Inject

class ThirdActivity : ThirdView, AppCompatActivity() {

    @Inject lateinit var presenter: ThirdPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        AndroidInjection.inject(this)

        presenter.getHello()
    }

    override fun loadHello(data: String) {

        tv_dagger2_third.text = data
    }
}
