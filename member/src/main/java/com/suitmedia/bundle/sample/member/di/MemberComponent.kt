package com.suitmedia.bundle.sample.member.di

import com.suitmedia.bundle.sample.di.module.APIServiceModule
import com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope
import com.suitmedia.bundle.sample.member.feature.MemberPresenter
import dagger.Component

@SuitCoreApplicationScope
@Component(modules = [(APIServiceModule::class)])
interface MemberComponent {
    fun inject(memberPresenter: MemberPresenter)
}