package com.mruraza.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var adapter: skills_adaptor
    lateinit var recyclerViewLayoutManager: RecyclerView.LayoutManager
    lateinit var soucee : ArrayList<mmodal>
    lateinit var horizontalLayout: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        soucee = ArrayList()
        var recyclervieww = findViewById<RecyclerView>(R.id.horizonatal_recycler_view);
        var btn_proj = findViewById<Button>(R.id.btn_educationaldet)
        var bio_btn = findViewById<Button>(R.id.btn_det)
        supportActionBar?.hide()

        soucee.add(mmodal(R.drawable.android_logo))
        soucee.add(mmodal(R.drawable.java_loo))
        soucee.add(mmodal(R.drawable.kotlin))
        soucee.add(mmodal(R.drawable.cpp_logo))
        soucee.add(mmodal(R.drawable.cc))
        soucee.add(mmodal(R.drawable.php_logo_icon))
        soucee.add(mmodal(R.drawable.mysql))
        soucee.add(mmodal(R.drawable.firebase))
        soucee.add(mmodal(R.drawable.python))
        soucee.add(mmodal(R.drawable.figma))
        soucee.add(mmodal(R.drawable.competitive))


        recyclerViewLayoutManager = LinearLayoutManager(applicationContext)
        recyclervieww.layoutManager=recyclerViewLayoutManager;
        adapter = skills_adaptor(soucee)
        horizontalLayout = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclervieww.layoutManager=horizontalLayout
        recyclervieww.adapter  = adapter


        btn_proj.setOnClickListener()
        {
            intent = Intent(this,projects::class.java)
            startActivity(intent)
        }
        bio_btn.setOnClickListener()
        {
            intent = Intent(this,details_activity::class.java)
            startActivity(intent)
        }


    }
}