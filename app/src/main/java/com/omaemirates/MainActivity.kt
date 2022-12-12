package com.omaemirates

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.omaemirates.databinding.ActivityMainBinding
import com.omaemirates.model.DataModel
import com.omaemirates.state.UiState
import com.omaemirates.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dataModel: DataModel
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        lifecycleScope.launch {
            mainViewModel.uiState.collect { uiState ->
                when (uiState) {
                    is UiState.Success -> showData(uiState.data)
                    is UiState.Error -> showError(uiState.exception)
                    else -> {

                    }
                }
            }
        }
        mainViewModel.getApiData()
    }

    private fun showData(dataModel: DataModel) {
        binding.textView.text =
            dataModel.Result?.data?.receiptParam?.customer?.slogan2 ?: "No Message"
        binding.textView2.text = dataModel.Result?.data?.receiptParam?.customer?.slogan1 ?: "No Message"
        binding.textView3.text = dataModel.Result?.data?.receiptParam?.customer?.cardHolderName.toString()
        dataModel.Result?.data?.caKeyParamMain?.caKeyParam?.let {
            binding.recyclerView.adapter = Adapter(it)
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun showError(throwable: Throwable) {

    }


}