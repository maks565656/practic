package com.example.ppactic

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home_page : AppCompatActivity() {
    lateinit var binding: InputBinding
    lateinit var Adapter: Adapter
    lateinit var recyclerView: RecyclerView
    val stateList = ArrayList<State>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        StateTestData()
        val recycler : RecyclerView = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
    }

    fun StateTestData(){
        stateList.add(State(R.drawable.blue_diwan, "бразилиа"))
        stateList.add(State(R.drawable.blue_diwan, "бразилиа"))
        stateList.add(State(R.drawable.blue_diwan, "бразилиа"))
        return StateTestData()
    }
}