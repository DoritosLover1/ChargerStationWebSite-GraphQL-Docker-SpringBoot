package com.charging.stations.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Table(
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"language", "key"}
        )
)
@Entity
@Data
public class Translations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(min = 0, max = 10, message = "language string must be maximum  10 character")
    private String language;

    @Column(name = "key")
    private String translationKey;
    private String value;
}