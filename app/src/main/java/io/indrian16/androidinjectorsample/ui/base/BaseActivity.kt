package io.indrian16.androidinjectorsample.ui.base

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import io.indrian16.androidinjectorsample.R
import io.indrian16.androidinjectorsample.ui.base.fragment.BaseFragment
import io.indrian16.androidinjectorsample.ui.second.SecondActivity
import kotlinx.android.synthetic.main.activity_base.*
import javax.inject.Inject

class BaseActivity : AppCompatActivity(), BaseView, HasSupportFragmentInjector {

    @Inject lateinit var presenter: BasePresenter

    @Inject internal lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        AndroidInjection.inject(this)

        presenter.getHello()

        if (savedInstanceState == null) {

            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.base_container, BaseFragment.newInstance())
                    .commit()
        }

        btn_go_second.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {

        return dispatchingAndroidInjector
    }

    override fun loadHello(data: String) {

        tv_dagger2.text = data
    }
}
