package india.ajay.materialselectioncontrolapp

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ProgressBar
import java.util.*

class MaterialProgressBarActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var handler: Handler? = null
    private var runnable: Runnable? = null
    private var timer: Timer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_progress_bar)
        setupView()
    }

    private fun setupView(){
        handler = Handler()
        runnable = Runnable {

        }
        timer = Timer()
        progressBar = findViewById(R.id.progress_bar)
        progressBar?.visibility = View.VISIBLE
    }
}
