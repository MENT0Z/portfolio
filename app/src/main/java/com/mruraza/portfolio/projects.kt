package com.mruraza.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class projects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        val recyclerView = findViewById<RecyclerView>(R.id.projects_recycler)
        recyclerView.layoutManager= LinearLayoutManager(this)
        val data = ArrayList<project_modal>();
            val chat1 = getString(R.string.info)
            val weather = getString(R.string.weather)
            val todo = getString(R.string.todo)
            val quiz = getString(R.string.quiz)

            data.add(project_modal(R.drawable.chat1,R.drawable.chat2,"Lets Chat",chat1))
            data.add(project_modal(R.drawable.quiz1,R.drawable.quiz2,"Quiz",quiz))
            data.add(project_modal(R.drawable.weather1,R.drawable.weather2,"Weather",weather))
            data.add(project_modal(R.drawable.tak1,R.drawable.task2,"To do list",todo))


        val adapter = projectt_adaptorr(data)
        recyclerView.adapter= adapter
    }
}