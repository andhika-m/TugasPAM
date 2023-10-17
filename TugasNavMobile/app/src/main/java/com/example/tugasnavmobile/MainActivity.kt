package com.example.tugasnavmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tugasnavmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Telusuri())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.search -> replaceFragment(Telusuri())
                R.id.favorite -> replaceFragment(Favorit())
                R.id.journey -> replaceFragment(Perjalanan())
                R.id.message -> replaceFragment(KotakMasuk())
                R.id.profile -> replaceFragment(Profil())

                else ->{



                }

            }

            true

        }


    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()


    }
}