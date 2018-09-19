package es.liguillasdepadel.app.model

import com.google.gson.annotations.SerializedName

data class Week (@SerializedName("week")
                val id: String?,
                 val isEmpty: Int?,
                 val name: String?,
                 val matchs: ArrayList<Match>?
)