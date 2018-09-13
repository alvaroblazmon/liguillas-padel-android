package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.Ranking

class TableItemVM(rankings: List<Ranking>) {

    val data = rankings.sortedBy { it.position }.map { RankingItemVM(it) }
}