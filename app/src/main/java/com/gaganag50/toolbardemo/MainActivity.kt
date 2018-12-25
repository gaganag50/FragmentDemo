package com.gaganag50.toolbardemo

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DemoFragment.OnFragmentInteractionListener {
    var demoFragment: DemoFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(my_toolbar)
        demoFragment = DemoFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, demoFragment!!).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        return when (item?.itemId) {
//            R.id.search -> {
//                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show()
//                true
//
//            }
//            R.id.settings -> {
//                Toast.makeText(this, "setteing", Toast.LENGTH_SHORT).show()
//                return true
//            }
//
//            else -> super.onOptionsItemSelected(item)
//        }

        val itemId = item?.itemId
        when {
            itemId == R.id.search -> {
                Toast.makeText(this, "tsih", Toast.LENGTH_SHORT).show()
                return true
            }
            itemId == R.id.settings -> {
                Toast.makeText(this, "esatohu", Toast.LENGTH_SHORT).show()
                return false
            }
        }
        return true
    }

    fun buttonClicked(v: View) {
        Toast.makeText(this, "buton", Toast.LENGTH_SHORT).show()
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}
