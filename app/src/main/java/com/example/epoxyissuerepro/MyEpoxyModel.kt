package com.example.epoxyissuerepro

import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder

@EpoxyModelClass(layout = R.layout.my_epoxy_model)
abstract class MyEpoxyModel : EpoxyModelWithHolder<MyEpoxyModel.Holder>() {

    @EpoxyAttribute
    lateinit var myEnums: List<MyEnum>

    override fun bind(holder: Holder) {

    }

    class Holder : EpoxyHolder() {
        override fun bindView(itemView: View) {

        }
    }
}