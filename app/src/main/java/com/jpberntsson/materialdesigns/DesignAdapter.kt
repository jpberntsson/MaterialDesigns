package com.jpberntsson.materialdesigns

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter


class DesignAdapter(context: Context?, itemLayout: Int, objects: Array<out ActivityItem>?) : ArrayAdapter<DesignAdapter.ActivityItem>(context, itemLayout, objects) {

    class ActivityItem

}