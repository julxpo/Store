package com.example.shop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "tshirt_black", "Футболка хлопковая", "Базовая футболка черного цвета", "100% хлопок, плотность 180 г/м². Классический крой, универсальный размер. Уход при 30°C.", 1499))
        items.add(Item(2, "hoodie_gray", "Толстовка с капюшоном", "Утепленная худи серого цвета", "Флисовая подкладка, карман-кенгуру, мягкий хлопковый материал. Идеально для прохладной погоды.", 3499))
        items.add(Item(3, "jeans_blue", "Джинсы классические", "Прямые синие джинсы", "Хлопок с эластаном, 98%/2%. Классический крой, пять карманов. Универсальная модель на каждый день.", 2999))

        //items.add(Item(1, "", "", "", "", 100)) //название изображение, название товара, краткое описание, полное описание, цена

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}