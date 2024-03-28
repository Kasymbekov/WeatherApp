package com.nurdev.weatherapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.RecyclerView
import com.nurdev.weatherapp.R
import com.nurdev.weatherapp.data.local.City
import com.nurdev.weatherapp.data.local.CityDB
import com.nurdev.weatherapp.data.local.CityViewModel
import com.nurdev.weatherapp.databinding.ActivityMainBinding
import com.nurdev.weatherapp.databinding.FragmentWeatherBinding
import com.nurdev.weatherapp.ui.fragments.SearchFragment
import com.nurdev.weatherapp.ui.fragments.WeatherFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var fragment: WeatherFragment = WeatherFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction
            .replace(R.id.main, fragment)
            .addToBackStack(null)
            .commit()
    }
}