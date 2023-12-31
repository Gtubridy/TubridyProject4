package edu.du.tubridyproject4.presentation.view.map

import com.example.parkingspotfinder.domain.local.parkingspot.ParkingSpot
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)