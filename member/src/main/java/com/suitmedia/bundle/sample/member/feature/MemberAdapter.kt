package com.suitmedia.bundle.sample.member.feature

import android.view.ViewGroup
import com.suitmedia.bundle.sample.base.ui.adapter.BaseRecyclerAdapter
import com.suitmedia.bundle.sample.data.api.model.User
import com.suitmedia.bundle.sample.member.R

/**
 * Created by DODYDMW19 on 1/30/2018.
 */
class MemberAdapter : BaseRecyclerAdapter<User, MemberItemView>() {

    private var mOnActionListener: MemberItemView.OnActionListener? = null

    fun setOnActionListener(onActionListener: MemberItemView.OnActionListener) {
        mOnActionListener = onActionListener
    }

    override fun getItemResourceLayout(): Int  = R.layout.item_member

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MemberItemView {
        val view = MemberItemView(getView(parent))
        mOnActionListener?.let { view.setOnActionListener(it) }
        return view
    }
}