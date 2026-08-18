package com.example.myapplication1.data.model

import androidx.compose.ui.graphics.Color

import com.example.myapplication1.R

data class TransportLine(
    val key: String,
    val nameRes: Int,
    val mapDescTemplateRes: Int?,
    val descTemplateRes: Int?,
    val descColourRes: Int?,
    val extraInfoRes: Int?,  // new — only non-null for DLR,Elizabeth,Tram
    val rgbColour: Color,
    val stripeCount: Int,
    val emoji: String? = null,
    val emojiActiveMonths: IntRange? = null   // e.g. 5..9 for May to September
)

val allTransportLines = listOf(
    TransportLine("bakerloo",R.string.line_bakerloo,R.string.map_placeholder,null,R.string.colour_brown,null,Color(178,99,0),1,null,null),
    TransportLine("central",R.string.line_central,R.string.map_placeholder,null,R.string.colour_red,null,Color(220,36,31),1,null,null),
    TransportLine("circle",R.string.line_circle,R.string.map_placeholder,null,R.string.colour_yellow,null,Color(255,200,10),1,"❄",5..9),
    TransportLine("district",R.string.line_district,R.string.map_placeholder,null,R.string.colour_green,null,Color(0,125,50),1,"❄",5..9),
    TransportLine("hammersmith_and_city",R.string.line_hammersmith_and_city,R.string.map_placeholder,null,R.string.colour_pink,null,Color(245,137,166),1,"❄",5..9),
    TransportLine("jubilee",R.string.line_jubilee,R.string.map_placeholder,null,R.string.colour_grey,null,Color(131,141,147),1,null,null),
    TransportLine("metropolitan",R.string.line_metropolitan,R.string.map_placeholder,null,R.string.colour_magenta,null,Color(155,0,88),1,"❄",5..9),
    TransportLine("northern",R.string.line_northern,R.string.map_placeholder,null,R.string.colour_black,null,Color(0,0,0),1,null,null),
    TransportLine("piccadilly",R.string.line_piccadilly,R.string.map_placeholder,null,R.string.colour_dark_blue,null,Color(0,25,168),1,null,null),
    TransportLine("victoria",R.string.line_victoria,R.string.map_placeholder,null,R.string.colour_light_blue,null,Color(3,155,229),1,null,null),
    TransportLine("waterloo_and_city",R.string.line_waterloo_and_city,R.string.map_placeholder,null,R.string.colour_turquoise,R.string.closed_saturday_sunday_and_holidays,Color(118,208,189),1,null,null),
    TransportLine("dlr",R.string.line_dlr,R.string.map_placeholder,null,R.string.colour_teal_default,R.string.route_colour_disclaimer_dlr,Color(0,175,173),2,null,null),
    TransportLine("elizabeth",R.string.line_elizabeth,R.string.map_placeholder,null,R.string.colour_purple,null,Color(96,57,158),2,"❄",5..9),
    TransportLine("liberty",R.string.line_liberty,R.string.map_placeholder,null,R.string.colour_grey,null,Color(93,96,97),2,"❄",5..9),
    TransportLine("lioness",R.string.line_lioness,R.string.map_placeholder,null,R.string.colour_yellow,null,Color(250,166,26),2,"❄",5..9),
    TransportLine("mildmay",R.string.line_mildmay,R.string.map_placeholder,null,R.string.colour_light_blue,null,Color(0,119,173),2,"❄",5..9),
    TransportLine("suffragette",R.string.line_suffragette,R.string.map_placeholder,null,R.string.colour_grass_green,null,Color(91,189,114),2,"❄",5..9),
    TransportLine("weaver",R.string.line_weaver,R.string.map_placeholder,null,R.string.colour_maroon,null,Color(130,58,98),2,"❄",5..9),
    TransportLine("windrush",R.string.line_windrush,R.string.map_placeholder,null,R.string.colour_red,null,Color(237,27,0),2,"❄",5..9),
    TransportLine("tram",R.string.line_tram,R.string.map_placeholder,null,R.string.colour_lime_green_default,R.string.route_colour_disclaimer_tram,Color(95,181,38),2,null,null),
    TransportLine("cable_car",R.string.line_cable_car,R.string.map_placeholder,null,R.string.colour_red,R.string.closed_during_adverse_weather_fog_rain_snow_wind_thunderstorms,Color(220,36,31),3,null,null)
)
