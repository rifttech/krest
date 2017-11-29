package com.github.rifttech.krest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp
import javax.persistence.*


@Entity
@Table(name = "Country")
data class Country(
        @Id
        @JsonProperty("country_id")
        @Column(name= "country_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val countryId : Int = 0,

        @JsonProperty("country")
        @Column(name= "country" , length = 50)
        val country :String,

        @JsonProperty("last_update")
        @Column(name="last_update")
        val last_update : Timestamp
)