package com.charging.stations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Data
public class Stations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "name of the station must not be empty or null")
    private String name;
    private String operator;

    @NotNull(message = "lat of the station must not be empty or null")
    private Float lat;

    @NotNull(message = "lng of the station must not be empty or null")
    private Float lng;

    @Size(min=0, max=2, message = "countryCode string must be maximum  2")
    private String countryCode;
    private String address;
    private Float powerKw;

    @JdbcTypeCode(SqlTypes.ARRAY)
    private String[] connectorTypes;
    private String status;
}