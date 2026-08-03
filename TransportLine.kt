package com.example.myapplication1.data.model

import androidx.compose.ui.graphics.Color

import com.example.myapplication1.R

data class TransportLine(
    val key: String,
    val nameRes: Int,
    val mapDescTemplateRes: Int?,
    val descTemplateRes: Int?,
    val descColourRes: Int?,
    val rgbColour: Color,
    val stripeCount: Int
)

val allTransportLines = listOf(
    TransportLine("bakerloo", R.string.line_bakerloo, R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_brown, Color(178,99,0), 1),
    TransportLine("central", R.string.line_central,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_red, Color(220,36,31), 1),
    TransportLine("circle", R.string.line_circle,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_yellow, Color(255,200,10), 1),
    TransportLine("district", R.string.line_district,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_green, Color(0,125,50), 1),
    TransportLine("hammersmith_and_city",R.string.colour_on_map_placeholder, R.string.line_hammersmith_and_city, R.string.solid_placeholder_line, R.string.colour_pink, Color(245,137,166), 1),
    TransportLine("jubilee", R.string.line_jubilee,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_grey, Color(131,141,147), 1),
    TransportLine("metropolitan", R.string.line_metropolitan,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_magenta, Color(155,0,88), 1),
    TransportLine("northern", R.string.line_northern,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_black, Color(0,0,0), 1),
    TransportLine("piccadilly", R.string.line_piccadilly,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_dark_blue, Color(0,25,168), 1),
    TransportLine("victoria", R.string.line_victoria,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_light_blue, Color(3,155,229), 1),
    TransportLine("waterloo_and_city", R.string.line_waterloo_and_city,R.string.colour_on_map_placeholder, R.string.solid_placeholder_line, R.string.colour_turquoise, Color(118,208,189), 1),
    TransportLine("dlr", R.string.line_dlr, R.string.colour_on_map_placeholder,null, null, Color(0,175,173), 2),
    TransportLine("elizabeth", R.string.line_elizabeth,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_purple, Color(96,57,158), 2),
    TransportLine("liberty", R.string.line_liberty,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_grey, Color(93,96,97), 2),
    TransportLine("lioness", R.string.line_lioness,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_yellow, Color(250,166,26), 2),
    TransportLine("mildmay", R.string.line_mildmay,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_light_blue, Color(0,119,173), 2),
    TransportLine("suffragette", R.string.line_suffragette,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_green, Color(91,189,114), 2),
    TransportLine("weaver", R.string.line_weaver,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_maroon, Color(130,58,98), 2),
    TransportLine("windrush", R.string.line_windrush,R.string.colour_on_map_placeholder, R.string.double_parallel_placeholder_line, R.string.colour_red, Color(237,27,0), 2),
    TransportLine("tram", R.string.line_tram,R.string.colour_on_map_placeholder, null, null, Color(95,181,38), 2),
    TransportLine("cable_car", R.string.line_cable_car,R.string.colour_on_map_placeholder, R.string.triple_parallel_placeholder_line, R.string.colour_red, Color(220,36,31), 3)
)
