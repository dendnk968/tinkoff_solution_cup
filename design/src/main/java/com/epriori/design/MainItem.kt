package com.epriori.design

import android.content.Context
import android.graphics.Canvas
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class MainItem @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val content = createDelegate(context, attrs, defStyleAttr)


    companion object {
        private fun createDelegate(context: Context, attrs: AttributeSet?, defStyleAttr:Int): View {
            return LayoutInflater.from(context).inflate(R.layout.item, null)
        }
    }
}