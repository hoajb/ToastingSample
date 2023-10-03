package vn.hoanguyen.toasting

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import java.lang.NullPointerException

@SuppressLint("StaticFieldLeak")
object Toasting {
    private var context: Context? = null
    fun init(context: Context) {
        this.context = context.applicationContext
    }

    fun show(message: String) {
        if (this.context == null) {
            throw NullPointerException("context == null, please call init(context) before calling show message")
        }
        Toast.makeText(this.context, message, Toast.LENGTH_SHORT).show()
    }
}