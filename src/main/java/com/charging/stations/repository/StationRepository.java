package com.charging.stations.repository;

import com.charging.stations.entity.Stations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StationRepository extends JpaRepository<Stations, Long>
{
    @Query(value= """
    SELECT * FROM stations
    WHERE (6371 * acos(
        cos(radians(:lat)) * cos(radians(lat)) *
        cos(radians(lng) - radians(:lng)) +
        sin(radians(:lat)) * sin(radians(lat))
        )) <= 10
    """, nativeQuery = true)
    List<Stations> findNearbyStations(
            @Param("lat") Float lat,
            @Param("lng") Float lng
    );
}