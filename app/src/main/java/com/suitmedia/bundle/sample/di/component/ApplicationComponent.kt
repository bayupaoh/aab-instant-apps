package com.suitmedia.bundle.sample.di.component

import com.suitmedia.bundle.sample.di.module.APIServiceModule
import com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope
import com.suitmedia.bundle.sample.feature.login.LoginPresenter
//import com.suitmedia.bundle.sample.feature.member.MemberPresenter
import dagger.Component

@SuitCoreApplicationScope
@Component(modules = [(APIServiceModule::class)])
interface ApplicationComponent {

//    fun inject(memberPresenter: MemberPresenter)

    fun inject(loginPresenter: LoginPresenter)
}