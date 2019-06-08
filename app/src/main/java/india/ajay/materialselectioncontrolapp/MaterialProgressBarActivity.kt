package india.ajay.materialselectioncontrolapp

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ProgressBar
import java.util.*

class MaterialProgressBarActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var linearProgressBar: ProgressBar? = null
    private var handler: Handler? = null
    private var runnable: Runnable? = null
    private var timer: Timer? = null
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_progress_bar)
        setupView()
    }

    private fun setupView(){
        showProgressBarCircular()
        showProgressBarLinear()
    }

    private fun showProgressBarCircular(){
        handler = Handler()
        runnable = Runnable {
            timer?.cancel()
            progressBar?.visibility = View.GONE
        }
        timer = Timer()
        val timerTask = object: TimerTask(){
            override fun run(){
                handler?.post(runnable)
            }
        }
        timer?.schedule(timerTask, 8000, 500)
        progressBar = findViewById(R.id.progress_bar)
        progressBar?.visibility = View.VISIBLE
    }

    private fun showProgressBarLinear(){
        handler = Handler()
        runnable = Runnable {
            if(++counter <= 100){
                linearProgressBar?.progress = counter
                linearProgressBar?.secondaryProgress = counter+10
            } else {
                timer?.cancel()
            }

           // linearProgressBar?.visibility = View.GONE
        }
        timer = Timer()
        val timerTask = object: TimerTask(){
            override fun run(){
                handler?.post(runnable)
            }
        }
        timer?.schedule(timerTask, 8000, 500)
        linearProgressBar = findViewById(R.id.progress_bar_linear)
        linearProgressBar?.progress = 0
        linearProgressBar?.secondaryProgress = 0
        linearProgressBar?.max = 100
        linearProgressBar?.visibility = View.VISIBLE
    }


}
