package com.example.cupcake

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class creditCardPage : AppCompatActivity() {
    lateinit var ed1: EditText
    lateinit var ed2: EditText
    lateinit var ed3: EditText
    lateinit var ed4: EditText
    lateinit var ed5: EditText
    var ed_text1: String? = null
    var ed_text2: String? = null
    var ed_text3: String? = null
    var ed_text4: String? = null
    var ed_text5: String? = null
    var bank_name: String? = null
    lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit_card_page)
        ed1 = findViewById(R.id.txt2)
        ed2 = findViewById(R.id.txt3)
        ed3 = findViewById(R.id.txt4)
        ed4 = findViewById(R.id.txt5)
        ed5 = findViewById(R.id.txt6)
        btn1 = findViewById(R.id.btn_next)
        val i = intent
        bank_name = i.getStringExtra("bank_name")
        val quantity = i.getStringExtra("quantity")
        val date = i.getStringExtra("flavour")
        val flavour = i.getStringExtra("date")
        val price = i.getStringExtra("price")
        btn1.setOnClickListener{
            ed_text1 = ed1.getText().toString()
            ed_text2 = ed2.getText().toString()
            ed_text3 = ed3.getText().toString()
            ed_text4 = ed4.getText().toString()
            ed_text5 = ed5.getText().toString()
            if (ed_text1 == "") {
                Toast.makeText(this, "Some fields are empty, please fill it", Toast.LENGTH_SHORT)
                    .show()
            } else if (ed_text2 == "") {
                Toast.makeText(this, "Some fields are empty, please fill it", Toast.LENGTH_SHORT)
                    .show()
            } else if (ed_text3 == "") {
                Toast.makeText(this, "Some fields are empty, please fill it", Toast.LENGTH_SHORT)
                    .show()
            } else if (ed_text4 == "") {
                Toast.makeText(this, "Some fields are empty, please fill it", Toast.LENGTH_SHORT)
                    .show()
            } else if (ed_text5 == "") {
                Toast.makeText(this, "Some fields are empty, please fill it", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this@creditCardPage, summaryPage::class.java)
                intent.putExtra("bank_name", bank_name)
                intent.putExtra("quantity", quantity)
                intent.putExtra("flavour", flavour)
                intent.putExtra("date", date)
                intent.putExtra("price", price)
                intent.putExtra("name_credit", ed_text1)
                intent.putExtra("number_credit", ed_text2)
                intent.putExtra("expiry_credit", ed_text3)
                intent.putExtra("code_credit", ed_text4)
                intent.putExtra("address_credit", ed_text5)
                startActivity(intent)
            }
        }
    }
}