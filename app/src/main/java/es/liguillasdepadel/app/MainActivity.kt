package es.liguillasdepadel.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import es.liguillasdepadel.app.viewControllers.leagues.viewModel.HomeVM
import org.koin.android.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeVM: HomeVM by viewModel()
    //private val fragNavController = FragNavController(supportFragmentManager, R.id.navigation_view_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homeVM.reloadData()
    }
}
