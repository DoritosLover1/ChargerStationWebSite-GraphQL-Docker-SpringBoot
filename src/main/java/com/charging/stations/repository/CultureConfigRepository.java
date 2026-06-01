package com.charging.stations.repository;

import com.charging.stations.entity.CultureConfigs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CultureConfigRepository extends JpaRepository<CultureConfigs,String> {
}
