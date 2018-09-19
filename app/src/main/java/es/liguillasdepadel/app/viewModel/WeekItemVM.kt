package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.Week

class WeekItemVM(week: Week) {

    val id = week.id ?: ""
    val isEmpty = week.isEmpty == 1
    val name = week.name ?: ""
    val data = week.matchs?.map { MatchItemVM(it) } ?: arrayListOf()
}