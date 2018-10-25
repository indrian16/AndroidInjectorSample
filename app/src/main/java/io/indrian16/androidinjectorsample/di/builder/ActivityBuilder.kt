package io.indrian16.androidinjectorsample.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.indrian16.androidinjectorsample.ui.base.BaseActivity
import io.indrian16.androidinjectorsample.ui.base.BaseActivityModule
import io.indrian16.androidinjectorsample.ui.base.BaseFragmentProvide
import io.indrian16.androidinjectorsample.ui.second.SecondActivity
import io.indrian16.androidinjectorsample.ui.second.SecondActivityModule
import io.indrian16.androidinjectorsample.ui.third.ThirdActivity
import io.indrian16.androidinjectorsample.ui.third.ThirdActivityModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(BaseActivityModule::class), (BaseFragmentProvide::class)])
    abstract fun bindBaseActivity(): BaseActivity

    @ContributesAndroidInjector(modules = [(SecondActivityModule::class)])
    abstract fun bindSecondActivity(): SecondActivity

    @ContributesAndroidInjector(modules = [(ThirdActivityModule::class)])
    abstract fun bindThirdActivity(): ThirdActivity
}