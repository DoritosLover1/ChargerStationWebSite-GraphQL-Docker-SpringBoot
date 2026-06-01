package com.charging.stations.repository;

import com.charging.stations.entity.Translations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends JpaRepository<Translations,Long> {
}
