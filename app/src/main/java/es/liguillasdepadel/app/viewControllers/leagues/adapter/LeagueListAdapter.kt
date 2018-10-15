package es.liguillasdepadel.app.viewControllers.leagues.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.liguillasdepadel.app.R
import es.liguillasdepadel.app.viewModel.LeagueItemVM
import kotlinx.android.synthetic.main.row_league.view.*


class LeagueListAdapter(private val leagues: List<LeagueItemVM>,
                        private val listener: (LeagueItemVM) -> Unit
                        ): RecyclerView.Adapter<LeagueListAdapter.LeagueViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): LeagueListAdapter.LeagueViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_league, parent, false)
        return LeagueViewHolder(v)
    }

    override fun getItemCount() = leagues.count()

    override fun onBindViewHolder(holder: LeagueListAdapter.LeagueViewHolder, position: Int) =
            holder.bind(leagues[position], listener)

    class LeagueViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(leagueItemVM: LeagueItemVM, listener: (LeagueItemVM) -> Unit) {
            itemView.leagueName.text = leagueItemVM.name
            itemView.setOnClickListener { listener(leagueItemVM) }
        }

    }
}