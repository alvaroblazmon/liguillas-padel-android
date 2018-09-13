package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.League

class LeagueItemVM(league: League) {

    val id = league.id ?: ""
    val isDouble = league.isDouble ?: false
    val isFinish = league.isFinish ?: false
    val name = league.name ?: ""
    val calendar = CalendarItemVM(league.weeks?.toList() ?: listOf())
    val table = TableItemVM(league.table?.toList() ?: listOf())

}