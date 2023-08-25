package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val list = arrayListOf("Análise e desenvolvimento de sistemas", "Gastronomia",
        "Direito", "Design Digital", "Engenharia Civil")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListView(list)
    }

    private fun setupListView(cursos: List<String>){
        for (i in 0 .. 10000)
            list.add(i.toString()
            )

        val adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1,
            cursos
        )

        binding.listView.adapter = adapter
    }
}