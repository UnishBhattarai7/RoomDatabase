package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class AddStudentActivity : AppCompatActivity() {

    private lateinit var etname : EditText
    private lateinit var etage : EditText
    private lateinit var rg : RadioButton
    private lateinit var rbmale : RadioButton
    private lateinit var rbfemale : RadioButton
    private lateinit var rbothers : RadioButton
    private lateinit var etaddress : EditText
    private lateinit var etimg : EditText
    private lateinit var btnsave : Button
    var gender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        etname =findViewById(R.id.etname)
        etage =findViewById(R.id.etage)
        rbmale =findViewById(R.id.rbmale)
        rbfemale =findViewById(R.id.rbfemale)
        rbothers =findViewById(R.id.rbothers)
        etaddress =findViewById(R.id.etaddress)
        etimg =findViewById(R.id.etimg)
        btnsave =findViewById(R.id.btnsave)
    }
}