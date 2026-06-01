package com.charging.stations.resolver;

import com.charging.stations.entity.Stations;
import com.charging.stations.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StationResolver {

    @Autowired
    private StationRepository stationRepository;

    @QueryMapping
    public List<Stations> nearbyStations
            (@Argument Float lat,
             @Argument Float lng) {
        return stationRepository.findNearbyStations(lat,lng);
    }
}