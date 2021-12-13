package com.example.demo.models

// TODO rewrite types or something

data class PointData(
        val pressure: Double?,
        val temperature: Double?,
        val speedOfSound: Double?,
        val enthalpy: Double?,
        val internalEnergy: Double?,
        val entropy: Double?,
        val isobaricHeatCapacity: Double?,
        val prandtlNumber: Double?,
)