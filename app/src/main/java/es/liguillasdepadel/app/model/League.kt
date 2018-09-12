package es.liguillasdepadel.app.model

data class League (
        val id: String?,
        val isDouble: Boolean?,
        val isFinish: Boolean?,
        val name: String?,
        val weeks: ArrayList<Week>?,
        val table: ArrayList<Ranking>?
)