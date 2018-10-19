package io.indrian16.androidinjectorsample.ui.base

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import io.indrian16.androidinjectorsample.R
import io.indrian16.androidinjectorsample.ui.second.SecondActivity
import kotlinx.android.synthetic.main.activity_base.*
import javax.inject.Inject

class BaseActivity : BaseView, AppCompatActivity() {

    @Inject lateinit var presenter: BasePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        AndroidInjection.inject(this)

        presenter.getHello()

        btn_go_second.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }

    override fun loadHello(data: String) {

        tv_dagger2.text = data
    }
}
