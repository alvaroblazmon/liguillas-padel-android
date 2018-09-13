package es.liguillasdepadel.app.model

data class Week (val id: String?,
                 val isEmpty: Boolean?,
                 val name: String?,
                 val matches: ArrayList<Match>?
)