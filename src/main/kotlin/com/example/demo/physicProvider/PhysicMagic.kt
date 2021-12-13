package com.example.demo.physicProvider

import com.example.demo.models.PointData

// TODO MAKE HERE

class PhysicMagic {

    companion object {
        fun getPointDataFromPT(p: Double, t: Double): PointData {
            return PointData(
                    1.0,
                    1.1,
                    1212.1,
                    12.1,
                    12.1,
                    12.1,
                    12.1,
                    12.1
            )
        }

        fun getPointDataFromPS(p: Double, s: Double): PointData {
            return PointData(
                    1.0,
                    1.1,
                    1212.1,
                    12.1,
                    12.1,
                    12.1,
                    12.1,
                    12.1
            )
        }
    }
}