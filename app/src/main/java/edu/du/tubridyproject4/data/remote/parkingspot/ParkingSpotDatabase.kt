package edu.du.tubridyproject4.data.remote.parkingspot

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ParkingSpotEntity::class],
    version = 1
)
abstract class ParkingSpotDatabase: RoomDatabase() {

    abstract val dao: ParkingSpotDao

}