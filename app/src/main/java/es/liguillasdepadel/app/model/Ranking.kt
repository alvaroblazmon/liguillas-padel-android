package es.liguillasdepadel.app.model

data class Ranking (val position: Int?,
                    val played: Int?,
                    val points: Int?,
                    val players: ArrayList<Player>?,
                    val setWinners: Int?,
                    val setLosers: Int?,
                    val winners: Int?,
                    val losers: Int?)