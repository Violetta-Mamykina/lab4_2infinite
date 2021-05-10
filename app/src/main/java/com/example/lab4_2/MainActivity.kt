package com.example.lab4_2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import name.ank.lab4.BibDatabase

//бесконечный
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.list)

        val currentDatabase = BibDatabase(
            this::class.java.getResourceAsStream("/res/raw/publicationsferro.bib")!!.reader()
        )

        currentDatabase.cfg.strict=true

        val entriesNumber = currentDatabase.entries.size

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(entriesNumber, currentDatabase)
    }
}

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Log
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import name.ank.lab4.BibDatabase
//import name.ank.lab4.BibEntry
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var recyclerView: RecyclerView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        recyclerView = findViewById(R.id.list)
//
//        val currentDatabase = BibDatabase(
//            this::class.java.getResourceAsStream("/res/raw/publications_ferro.bib")!!.reader()
//        )
//
//        var currentEntry = currentDatabase.getEntry(0)
//        val entriesNumber = currentDatabase.entries.size
//        val entriesList = mutableListOf<BibEntry>()
//        var counter = 1
//
//        while (currentEntry.type != null && entriesNumber > counter) {
//            entriesList.add(currentEntry)
//            currentEntry = currentDatabase.getEntry(counter)
//            counter++
//        }
//
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = Adapter(entriesList)
//    }
//}

//конечный
//class MainActivity : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        recyclerView = findViewById(R.id.list)
//        val currentDatabase = BibDatabase(
//
//            this::class.java.getResourceAsStream("/res/raw/publicationsferro.bib")!!.reader()
//        )
//        val entriesNumber = currentDatabase.entries.size
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = Adapter(entriesNumber, currentDatabase)
//    }
//}
