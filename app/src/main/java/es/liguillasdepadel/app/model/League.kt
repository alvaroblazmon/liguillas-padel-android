package es.liguillasdepadel.app.model

import com.google.gson.annotations.SerializedName

data class League (
        val id: String?,
        val isDouble: Int?,
        @SerializedName("finish")
        val isFinish: Int?,
        val name: String?,
        val weeks: List<Week>?,
        val table: ArrayList<Ranking>?
)