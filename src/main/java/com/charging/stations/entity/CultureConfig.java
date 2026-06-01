package com.charging.stations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import tools.jackson.databind.JsonNode;

@Entity
@Data
public class CultureConfig {
    @Id
    @Size(min = 0, max = 2, message = "countryCode string must be maximum  2 character")
    private String countryCode;

    @Size(min = 0, max = 10, message = "language string must be maximum  10 character")
    private String language;

    @Size(min = 0, max = 3, message = "currency string must be maximum 3 character")
    private String currency;

    private String distanceUnit;
    private String primaryColor;
    private String dangerColor;
    private String successColor;
    private String warningColor;

    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode colorNotes;

    private boolean rtl;
}
