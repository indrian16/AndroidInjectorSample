package io.indrian16.androidinjectorsample.ui.second

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import io.indrian16.androidinjectorsample.R
import io.indrian16.androidinjectorsample.ui.third.ThirdActivity
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject

class SecondActivity : SecondView, AppCompatActivity() {

    @Inject lateinit var presenter: SecondPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        AndroidInjection.inject(this)

        presenter.getHello()

        btn_go_third.setOnClickListener { startActivity(Intent(this, ThirdActivity::class.java)) }
    }

    override fun loadHello(data: String) {

        tv_dagger2_second.text = data
    }
}
