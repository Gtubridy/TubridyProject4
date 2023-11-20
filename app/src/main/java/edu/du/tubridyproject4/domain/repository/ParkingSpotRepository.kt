package edu.du.tubridyproject4.domain.repository

import edu.du.tubridyproject4.domain.local.parkingspot.ParkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot: ParkingSpot)

    suspend fun deleteParkingSpot(spot: ParkingSpot)

    fun getParkingSpots(): Flow<List<ParkingSpot>>

}