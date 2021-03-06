package com.suitmedia.bundle.sample.helper

object CommonConstant {

    // for intent extras constant

    const val RC_SIGN_IN = 9001

    // -- Remote Config Params
    const val NOTIFY_NORMAL_UPDATE = "minimum_info_android"
    const val NOTIFY_FORCE_UPDATE = "minumum_force_android"
    const val NOTIFY_NORMAL_MESSAGE = "info_message"
    const val NOTIFY_FORCE_MESSAGE = "force_message"

    const val STATUS_CODE_SUCCESS = "success"
    const val STATUS_CODE_FAILED = "failed"
    const val API_STATUS_CODE_LOCAL_ERROR = 0

    const val BASE_PACKAGE = "com.suitmedia.bundle.sample"
    const val INTENT_LOGIN = "$BASE_PACKAGE.feature.login.LoginActivity"
    const val INTENT_MEMBER = "$BASE_PACKAGE.feature.MemberActivity"
    const val INTENT_FRAGMENT_SAMPLE = "$BASE_PACKAGE.fragmentsample.feature.SampleActivity"

    const val BASE_PACKAGE_URL = "https://bayuinstantaab.azurewebsites.net"
    const val INTENT_MEMBER_URL = "${BASE_PACKAGE_URL}/member"
    const val INTENT_LOGIN_URL = "${BASE_PACKAGE_URL}/signin"
    const val INTENT_FRAGMENT_SAMPLE_URL = "${BASE_PACKAGE_URL}/sample"
}