package com.suitmedia.bundle.sample.member.feature

import com.suitmedia.bundle.sample.base.presenter.MvpView
import com.suitmedia.bundle.sample.data.api.model.User

/**
 * Created by DODYDMW19 on 1/30/2018.
 */

interface MemberView : MvpView {

    fun onMemberCacheLoaded(members: List<User>?)

    fun onMemberLoaded(members: List<User>?)

    fun onMemberEmpty()

    fun onFailed(message: String?)

}