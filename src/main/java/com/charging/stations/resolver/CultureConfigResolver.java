package com.charging.stations.resolver;

import com.charging.stations.entity.CultureConfigs;
import com.charging.stations.repository.CultureConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CultureConfigResolver{

    @Autowired
    private CultureConfigRepository cultureConfigRepository;

    @QueryMapping
    public CultureConfigs cultureConfigs(
            @Argument String countryCode) {
        return  cultureConfigRepository.findById(countryCode).orElse(null);
    }
}
