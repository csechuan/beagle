package com.melon.beagle.core.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Claim(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        val owner : String,
        val maker : String,
        val points : Long
)
