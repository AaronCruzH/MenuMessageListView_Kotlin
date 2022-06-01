package com.example.menumensajelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /////List View
        ///Datos
        val datos = listOf("Fatima","Davod","Nestor","Toño","Manuel")
        val lvLista = findViewById<ListView>(R.id.lvLista)
        //Adapter
        ///1.- Contexto 2.- Diseño (Layout) 3.- Datos
        val adaptador = ArrayAdapter( this@MainActivity,
            android.R.layout.simple_list_item_1,
            datos)
        ///Asignar el adaptador al ListView
        lvLista.adapter = adaptador
    }
}