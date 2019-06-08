package india.ajay.materialselectioncontrolapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatCheckBox
import android.support.v7.widget.AppCompatRadioButton
import android.support.v7.widget.SwitchCompat
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var switchCompat: SwitchCompat? = null
    private var checkBox: AppCompatCheckBox? = null
    private var radioGroup: RadioGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView(){
        switchCompat = findViewById(R.id.switch_compat)
        checkBox = findViewById(R.id.checkbox)
        radioGroup = findViewById(R.id.radio_group)
        switchCompat?.setOnCheckedChangeListener { buttonView, isChecked ->

            Toast.makeText(this, ""+isChecked, Toast.LENGTH_SHORT).show()
        }

        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->

            Toast.makeText(this, ""+isChecked, Toast.LENGTH_SHORT).show()
        }

        radioGroup?.setOnCheckedChangeListener { rGroup, id ->
            when(id){
                R.id.radio_button1 -> {

                }
                R.id.radio_button2 -> {

                }
                R.id.radio_button3 -> {

                }
            }
        }

    }
}
