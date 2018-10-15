package es.liguillasdepadel.app.viewControllers.leagues

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.liguillasdepadel.app.BaseFragment
import es.liguillasdepadel.app.R
import es.liguillasdepadel.app.viewControllers.leagues.viewModel.HomeVM
import kotlinx.android.synthetic.main.fragment_leagues.*
import org.koin.android.viewmodel.ext.android.viewModel

class LeaguesFragment: BaseFragment() {

    private val viewModel: HomeVM by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_leagues, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.dataMLD.observe(this, Observer {listLeagueItemVM ->
            Log.d("", "hola")
        })
    }

    companion object {
        fun newInstance() = LeaguesFragment()
    }
}