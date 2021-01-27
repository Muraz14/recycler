package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val products = ArrayList<Product>()
        products.add(Product(1, "Alarm", R.drawable.ic_baseline_access_alarm_24))
        products.add(Product(1, "Airplane", R.drawable.ic_baseline_airplanemode_active_24))
        products.add(Product(1, "Bluetooth", R.drawable.ic_baseline_bluetooth_24))
        products.add(Product(1, "Android", R.drawable.ic_android_black_24dp))
        products.add(Product(1, "Man", R.drawable.ic_baseline_accessibility_new_24))
        products.add(Product(1, "Alarm", R.drawable.ic_baseline_access_alarm_24))
        products.add(Product(1, "Airplane", R.drawable.ic_baseline_airplanemode_active_24))
        products.add(Product(1, "Bluetooth", R.drawable.ic_baseline_bluetooth_24))
        products.add(Product(1, "Android", R.drawable.ic_android_black_24dp))
        products.add(Product(1, "Man", R.drawable.ic_baseline_accessibility_new_24))

        val adapter = ProductAdapter(products)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}

