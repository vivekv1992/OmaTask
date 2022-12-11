package com.omaemirates

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omaemirates.databinding.ActivityMainBinding
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
            // Sets the TextView with the string
            binding.textView.text = myOutput

        } catch (e: IOException) {
            // Exception
            e.printStackTrace()
        }

    }


}