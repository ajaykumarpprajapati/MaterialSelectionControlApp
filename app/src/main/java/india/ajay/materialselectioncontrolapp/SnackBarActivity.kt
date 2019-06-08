package india.ajay.materialselectioncontrolapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)
        val view = findViewById<View>(R.id.parent_layout)
        Snackbar.make(view, "Hello Snack", Snackbar.LENGTH_SHORT).show()
        
    }
}
