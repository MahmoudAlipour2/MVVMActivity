package ir.iwithyou.mvvmactivity.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import ir.iwithyou.mvvmactivity.R
import kotlinx.android.synthetic.main.activity_test_main_activiy.*
import java.util.Observer

class TestMainActiviy : AppCompatActivity() {


    lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_main_activiy)

        viewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)

        btn.setOnClickListener {
            requestData()
        }

        viewModel.observable.observe(this, androidx.lifecycle.Observer {
            Toast.makeText(this@TestMainActiviy, it, Toast.LENGTH_LONG).show()
        })

    }


    fun requestData() {
        viewModel.getUser()
    }
}

