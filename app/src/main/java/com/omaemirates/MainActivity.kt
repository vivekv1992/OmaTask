package com.omaemirates

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.omaemirates.databinding.ActivityMainBinding
import com.omaemirates.model.MainDataModel
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // A string variable to store the text from the text file
        val myOutput: String

        // Declaring an input stream to read data
        val myInputStream: InputStream

        // Try to open the text file, reads
        // the data and stores it in the string
        try {
            myInputStream = this.resources.openRawResource(R.raw.task)
            val size: Int = myInputStream.available()
            val buffer = ByteArray(size)
            myInputStream.read(buffer)
            myOutput = String(buffer)
            val mainDataModel = Gson().fromJson(myOutput, MainDataModel::class.java)
            // Sets the TextView with the string
            binding.textView.text =
                mainDataModel.Result?.data?.receiptParam?.customer?.slogan2 ?: "No Message"

        } catch (e: IOException) {
            // Exception
            e.printStackTrace()
        }

    }


}