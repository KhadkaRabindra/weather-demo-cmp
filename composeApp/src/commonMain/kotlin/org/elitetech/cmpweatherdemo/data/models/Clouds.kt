package org.elitetech.cmpweatherdemo.data.models
import kotlinx.serialization.Serializable

@Serializable
data class Clouds(
    val all: Int?
)