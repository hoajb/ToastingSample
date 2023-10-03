package vn.hoanguyen.toastingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import vn.hoanguyen.toasting.Toasting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            Toasting.show("Hello from Toasting")
        }
    }
}