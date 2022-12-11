package com.omaemirates

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
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
    }

    private fun showError(throwable: Throwable) {

    }


}