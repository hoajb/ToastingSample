package vn.hoanguyen.toastingsample

import android.app.Application
import vn.hoanguyen.toasting.Toasting

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Toasting.init(this)
    }
}