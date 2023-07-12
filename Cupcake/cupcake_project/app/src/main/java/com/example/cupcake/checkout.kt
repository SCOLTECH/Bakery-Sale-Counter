package com.example.cupcake

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class checkout : AppCompatActivity() {
    // bank string
    var selectedValue = ""

    // credit card details strings
    var ed_text1 = ""
    var ed_text2 = ""
    var ed_text3 = ""
    var ed_text4 = ""
    var ed_text5 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout1)
        val i = intent
        val quantity = i.getStringExtra("quantity")
        val date = i.getStringExtra("flavour")
        val flavour = i.getStringExtra("date")
        val price = i.getStringExtra("price")

        val tvP = findViewById<TextView>(R.id.tvPrice);
        tvP.text = price;

        val rad1 = findViewById<RadioButton>(R.id.radio_button1)
        val rad2 = findViewById<RadioButton>(R.id.radio_button2)
        val rad3 = findViewById<RadioButton>(R.id.radio_button3)
        val rad4 = findViewById<RadioButton>(R.id.radio_button4)


        if (rad1.isChecked) {
            selectedValue = rad1.text.toString()
        } else if (rad2.isChecked) {
            selectedValue = rad2.text.toString()
        } else if (rad3.isChecked) {
            selectedValue = rad3.text.toString()
        } else if (rad4.isChecked) {
            selectedValue = rad4.text.toString()
        } else {
            Toast.makeText(this, "please select a payment method", Toast.LENGTH_SHORT).show()
        }

        val btnNext = findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            val intent = Intent(this@checkout, creditCardPage::class.java)
            intent.putExtra("bank_name", selectedValue)
            intent.putExtra("quantity", quantity)
            intent.putExtra("flavour", flavour)
            intent.putExtra("date", date)
            intent.putExtra("price", price)
//            intent.putExtra("name_credit", ed_text1)
//            intent.putExtra("number_credit", ed_text2)
//            intent.putExtra("expiry_credit", ed_text3)
//            intent.putExtra("code_credit", ed_text4)
//            intent.putExtra("address_credit", ed_text5)
            startActivity(intent)

        }



//        val dialog = Dialog(this)
//        dialog.setContentView(R.layout.activity_checkout)
//
//        val next = dialog.findViewById<Button>(R.id.btn_next)
//        next.setOnClickListener { view: View? ->
//            dialog.dismiss()

//            tv5.text = "bank = $selectedValue"
//            val dialog1 = Dialog(this)
//            dialog1.setContentView(R.layout.activity_credit_card_page1)
//            val ed1 = dialog1.findViewById<EditText>(R.id.txt2)
//            val ed2 = dialog1.findViewById<EditText>(R.id.txt3)
//            val ed3 = dialog1.findViewById<EditText>(R.id.txt4)
//            val ed4 = dialog1.findViewById<EditText>(R.id.txt5)
//            val ed5 = dialog1.findViewById<EditText>(R.id.txt6)
//            val btn1 = dialog1.findViewById<Button>(R.id.btn_next)
//            btn1.
//                btnNext.text = "Summary"
//            }


//        btnNext.setOnClickListener { view3: View? ->
//
//        }
    }
}
//ed_text1 = ed1.text.toString()
//ed_text2 = ed2.text.toString()
//ed_text3 = ed3.text.toString()
//ed_text4 = ed4.text.toString()
//ed_text5 = ed5.text.toString()
//if (ed_text1 == "") {
//    Toast.makeText(
//        this,
//        "Some fields are empty, please fill it",
//        Toast.LENGTH_SHORT
//    ).show()
//} else if (ed_text2 == "") {
//    Toast.makeText(
//        this,
//        "Some fields are empty, please fill it",
//        Toast.LENGTH_SHORT
//    ).show()
//} else if (ed_text3 == "") {
//    Toast.makeText(
//        this,
//        "Some fields are empty, please fill it",
//        Toast.LENGTH_SHORT
//    ).show()
//} else if (ed_text4 == "") {
//    Toast.makeText(
//        this,
//        "Some fields are empty, please fill it",
//        Toast.LENGTH_SHORT
//    ).show()
//} else if (ed_text5 == "") {
//    Toast.makeText(
//        this,
//        "Some fields are empty, please fill it",
//        Toast.LENGTH_SHORT
//    ).show()
//} else {
//    Toast.makeText(this, "data saved successfully", Toast.LENGTH_SHORT).show()
//}