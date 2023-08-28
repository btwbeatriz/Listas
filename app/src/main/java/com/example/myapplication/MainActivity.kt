package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private var list = arrayListOf(
        "Análise e desenvolvimento de sistemas", "Gastronomia",
        "Direito", "Design Digital", "Engenharia Civil"
    )

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListView(list)
    }

    private fun setupListView(cursos: ArrayList<String>) {
        val adapter = MyAdapter()
        adapter.clickListener = {
            cursos.remove(it) //remove o item e add(it) replica os itens da lista
            adapter.notifyDataSetChanged()
        }
        adapter.submitList(cursos)
        binding.recyclerView.adapter = adapter
    }
}