package edu.du.tubridyproject4.presentation.view.map

import com.example.parkingspotfinder.domain.local.parkingspot.ParkingSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent{
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}