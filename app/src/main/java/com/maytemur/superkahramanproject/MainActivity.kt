package com.maytemur.superkahramanproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maytemur.superkahramanproject.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NullPointerException

/*import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maytemur.sinifvefonksyionlar.databinding.ActivityMainBinding
import java.lang.NullPointerException
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun superKahramanYap(view : View){
        val isim = binding.isimText.text.toString()
        val yas = binding.yasText.text.toString().toIntOrNull()
        val meslek = binding.meslekText.text.toString()
        if (yas == null) {
            sonucText.text = "Lütfen Doğru Yaşı giriniz"
            } else {
                val superkahraman = SuperKahraman(isim,yas!!,meslek)
                binding.sonucText.text = "isim : ${superkahraman.isim} yas : ${superkahraman.yas} meslek : ${superkahraman.meslek}"
            }
    }
}