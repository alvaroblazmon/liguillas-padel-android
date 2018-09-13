package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.Match
import es.liguillasdepadel.app.model.Set

class MatchItemVM(match: Match) {

    val firstNameHome = match.players?.home?.getOrNull(0)?.name ?: ""
    val secondNameHome = match.players?.home?.getOrNull(1)?.name ?: ""
    val firstNameAway = match.players?.away?.getOrNull(0)?.name ?: ""
    val secondNameAway = match.players?.away?.getOrNull(1)?.name ?: ""

    val firstPhotoHome = match.players?.home?.getOrNull(0)?.photo ?: ""
    val secondPhotoHome = match.players?.home?.getOrNull(1)?.photo ?: ""
    val firstPhotoAway = match.players?.away?.getOrNull(0)?.photo ?: ""
    val secondPhotoAway = match.players?.away?.getOrNull(1)?.photo ?: ""

    val isFinish: Boolean = Match.Status.find(match.status ?: "") == Match.Status.CLOSE
    val result = setResult(isFinish, match.sets)
    val sets = match.sets ?: arrayListOf()

    fun set(number: Int): Set? {
        return sets.find { it.numberSet == number }
    }

    private fun setResult(isFinish: Boolean, sets: ArrayList<Set>?): String {
        if (!isFinish) return "PENDIENTE DE JUGAR"

        return sets?.joinToString(separator = "/") { "${it.home} - ${it.away}" } ?: ""
    }

}