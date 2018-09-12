package es.liguillasdepadel.app.model

import com.google.gson.annotations.SerializedName

data class Match (val id: String?,
                  val status: String?,
                  val sets: ArrayList<Set>?,
                  @SerializedName("players")
                  val players: Players?) {

    data class Players(
            val home: ArrayList<Player>,
            val away: ArrayList<Player>
    )

    enum class Status(val value: String) {
        OPEN("0"), CLOSE("1"), FORBIDDEN("-1");

        companion object {
            fun find(value: String) : Status {
                return when (value) {
                    Status.OPEN.value -> Status.OPEN
                    Status.CLOSE.value -> Status.CLOSE
                    Status.FORBIDDEN.value -> Status.FORBIDDEN
                    else -> Status.FORBIDDEN
                }
            }
        }
    }
}