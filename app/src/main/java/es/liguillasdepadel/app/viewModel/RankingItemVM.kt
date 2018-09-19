package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.Ranking

class RankingItemVM(ranking: Ranking) {

    val position = ranking.position ?: 1
    val played = ranking.played ?: 0
    val points = ranking.points ?: 0
    val name = ranking.players?.asSequence()?.map { it.name }?.joinToString( separator = " - ")
    val winners = ranking.winners
    val losers = ranking.losers
    val setWinners = ranking.setWinners
    val setLosers = ranking.setLosers

}