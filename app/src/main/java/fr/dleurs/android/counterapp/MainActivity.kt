package fr.dleurs.android.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel: CounterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)
        tvNumberValue.setText(viewModel.number.toString())

        btnIncrement.setOnClickListener {
            viewModel.increment()
            tvNumberValue.setText(viewModel.number.toString())
        }

        btnDecrement.setOnClickListener {
            viewModel.decrement()
            tvNumberValue.setText(viewModel.number.toString())
        }
    }
}