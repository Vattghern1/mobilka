package com.example.firstapp.CustomViews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.MarginLayoutParams
import android.view.inputmethod.InputMethodManager
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.firstapp.databinding.ViewDeclareIntegerBinding
import com.example.firstapp.CodingActivity
import com.example.firstapp.MainActivity
import kotlinx.android.synthetic.main.view_output.view.*


class declareInteger @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,

    ) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val bin3 = ViewDeclareIntegerBinding.inflate(LayoutInflater.from(context), this)

    init {
        hideKeyboard()

    }

    private fun hideKeyboard() {
        removeKeyboard.setOnClickListener {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(windowToken, 0)
        }

    }
}
