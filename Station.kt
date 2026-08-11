package com.example.myapplication1.data.model

import com.example.myapplication1.R

data class Station(
    val key: String,
    val nameRes: Int,
    val zoneRes: List<Int>   // most stations: one entry; boundary stations: two
)

data class LineStationEntry(
    val lineKey: String,
    val stationKey: String
)

val lineStationEntries = listOf(

    // V
    LineStationEntry("victoria", "blackhorse_road"),
    LineStationEntry("victoria", "brixton"),
    LineStationEntry("victoria", "green_park"),
    LineStationEntry("victoria", "euston"),
    LineStationEntry("victoria", "finsbury_park"),
    LineStationEntry("victoria", "highbury_and_islington"),
    LineStationEntry("victoria", "kings_cross_st_pancras"),
    LineStationEntry("victoria", "oxford_circus"),
    LineStationEntry("victoria", "pimlico"),
    LineStationEntry("victoria", "seven_sisters"),
    LineStationEntry("victoria", "stockwell"),
    LineStationEntry("victoria", "tottenham_hale"),
    LineStationEntry("victoria", "vauxhall"),
    LineStationEntry("victoria", "victoria"),
    LineStationEntry("victoria", "walthamstow_central"),
    LineStationEntry("victoria", "warren_street"),
    // ... other lines' entries go here as you build them out
)

fun stationsForLine(lineKey: String): List<Station> {
    val stationByKey = allStations.associateBy { it.key }
    return lineStationEntries
        .filter { it.lineKey == lineKey }
        .mapNotNull { stationByKey[it.stationKey] }
}

val allStations = listOf(
    // A (20)

    // B ()
    Station("", ,listOf(R.string.station_)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("", ,listOf(R.string.)
    Station("blackhorse_road", R.string.station_blackhorse_road, listOf(R.string.zone_3)),
    Station("brixton", R.string.station_brixton, listOf(R.string.zone_2)),

   // 
    Station("euston", R.string.station_euston, listOf(R.string.zone_1)),
    Station("finsbury_park", R.string.station_finsbury_park, listOf(R.string.zone_2)),
    Station("green_park", R.string.station_green_park, listOf(R.string.zone_1)),
    Station("highbury_and_islington", R.string.station_highbury_and_islington, listOf(R.string.zone_2)),

    // I (5)
    Station("ickenham", ,listOf(R.string.station_ickenham)
    Station("ilford", ,listOf(R.string.station_ilford)
    Station("imperial_wharf", ,listOf(R.string.station_imperial_wharf)
    Station("island_gardens", ,listOf(R.string.station_island_gardens)
    Station("iver", ,listOf(R.string.station_iver)

    Station("kings_cross_st_pancras", R.string.station_kings_cross_st_pancras, listOf(R.string.zone_1)),
    Station("oxford_circus", R.string.station_oxford_circus, listOf(R.string.zone_1)),
    Station("pimlico", R.string.station_pimlico, listOf(R.string.zone_1)),
    Station("seven_sisters", R.string.station_seven_sisters, listOf(R.string.zone_3)),
    Station("stockwell", R.string.station_stockwell, listOf(R.string.zone_2)),
    Station("tottenham_hale", R.string.station_tottenham_hale, listOf(R.string.zone_3)),

    // U (6)
    Station("upminster", ,listOf(R.string.station_upminster)
    Station("upminster_bridge", ,listOf(R.string.station_upminster_bridge)
    Station("upney", ,listOf(R.string.station_upney)
    Station("upper_holloway", ,listOf(R.string.station_upper_holloway)
    Station("upton_park", ,listOf(R.string.station_upton_park)
    Station("uxbridge", ,listOf(R.string.station_uxbridge)

    // V (2)
    Station("vauxhall", R.string.station_vauxhall, listOf(R.string.zone_1, R.string.zone_2)),
    Station("victoria", R.string.station_victoria, listOf(R.string.zone_1)),

  
    Station("walthamstow_central", R.string.station_walthamstow_central, listOf(R.string.zone_3)),
    Station("warren_street", R.string.station_warren_street, listOf(R.string.zone_1))
)
