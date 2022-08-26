package tarc.edu.blooddonation

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import tarc.edu.blooddonation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

lateinit var toggle : ActionBarDrawerToggle
private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //navigationDrawer
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this,binding.root,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        binding.root.addDrawerListener(toggle)
        toggle.syncState()

        binding.navMenu.setNavigationItemSelectedListener{
            drawerLayout.closeDrawer(GravityCompat.START)
            when(it.itemId){
                R.id.home ->{
                    Toast.makeText(this,"Home Clicked",Toast.LENGTH_SHORT).show()
                    setToolbarTitle("Home")
                    changeFragment(Home())

                }
                R.id.profile ->{
                    Toast.makeText(this,"Profile Clicked",Toast.LENGTH_SHORT).show()
                    setToolbarTitle("Profile")
                    changeFragment(Profile())

                }
                R.id.aboutUs ->{
                    Toast.makeText(this,"About Us Clicked",Toast.LENGTH_SHORT).show()
                    setToolbarTitle("About Us")
                    changeFragment(About())
                }
            }
             true
        }
        setToolbarTitle("Home")
        changeFragment(Home())

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    fun setToolbarTitle(title:String) {
        supportActionBar?.title = title
    }

    fun changeFragment(frag:Fragment){
        val fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container,frag).commit()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main_menu,menu)
        menu.findItem(R.id.action_save).isVisible = false
        return true
    }
}

