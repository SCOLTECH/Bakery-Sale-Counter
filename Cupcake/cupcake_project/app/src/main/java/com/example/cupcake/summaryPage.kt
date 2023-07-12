package com.example.cupcake

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class summaryPage : AppCompatActivity() {
    lateinit var ed1: TextView
    lateinit var ed2: TextView
    lateinit var ed3: TextView
    lateinit var ed4: TextView
    lateinit var ed5: TextView
    lateinit var ed6: TextView
    lateinit var ed7: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary_page)
        ed1 = findViewById(R.id.txt2)
        ed2 = findViewById(R.id.txt3)
        ed3 = findViewById(R.id.txt4)
        ed4 = findViewById(R.id.txt5)
        ed5 = findViewById(R.id.txtF)
        ed6 = findViewById(R.id.txtDate)
        ed7 = findViewById(R.id.txtPr)




        val i = intent
        val bank_name = i.getStringExtra("bank_name")
        val quantity = i.getStringExtra("quantity")
        val date = i.getStringExtra("flavour")
        val flavour = i.getStringExtra("date")
        val price = i.getStringExtra("price")
        val name_credit = i.getStringExtra("name_credit")
//        val number_credit = i.getStringExtra("number_credit")
//        val expiry_credit = i.getStringExtra("expiry_credit")
//        val code_credit = i.getStringExtra("code_credit")
        val address_credit = i.getStringExtra("address_credit")
        ed1.setText("Quantity = $quantity")
        ed5.setText("Flavour = $date")
        ed6.setText("Date = $flavour")
        ed7.setText("Price = $price")
        ed2.setText("Payment Selected = $bank_name")
        ed3.setText("Full Name = $name_credit")
        ed4.setText("Shipping Address = $address_credit")
        Toast.makeText(this, "Thanks for Shopping....", Toast.LENGTH_SHORT).show()
    }
}