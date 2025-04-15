package com.example.myapplication

import android.app.AlertDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit App")
        builder.setMessage("Are you sure you want to exit?")
        builder.setPositiveButton("Yes") { dialog, _ ->
            dialog.dismiss()
            super.onBackPressed()  // Exit the app
        }
        builder.setNegativeButton("No") { dialog, _ ->
            dialog.dismiss()  // Just dismiss dialog
        }
        val dialog = builder.create()
        dialog.show()
    }
}
