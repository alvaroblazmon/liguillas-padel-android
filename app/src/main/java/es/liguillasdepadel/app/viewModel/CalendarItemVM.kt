package es.liguillasdepadel.app.viewModel

import es.liguillasdepadel.app.model.Week

class CalendarItemVM(weeks: List<Week>) {

    val data = weeks.map { WeekItemVM(it) }

}