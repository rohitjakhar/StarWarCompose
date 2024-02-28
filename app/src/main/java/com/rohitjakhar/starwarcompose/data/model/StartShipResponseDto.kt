package com.rohitjakhar.starwarcompose.data.model


import com.google.gson.annotations.SerializedName

data class StartShipResponseDto(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any,
    @SerializedName("results")
    val startShips: List<StartShip>
) {
    data class StartShip(
        @SerializedName("cargo_capacity")
        val cargoCapacity: String,
        @SerializedName("consumables")
        val consumables: String,
        @SerializedName("cost_in_credits")
        val costInCredits: String,
        @SerializedName("created")
        val created: String,
        @SerializedName("crew")
        val crew: String,
        @SerializedName("edited")
        val edited: String,
        @SerializedName("films")
        val films: List<String>,
        @SerializedName("hyperdrive_rating")
        val hyperdriveRating: String,
        @SerializedName("length")
        val length: String,
        @SerializedName("MGLT")
        val mGLT: String,
        @SerializedName("manufacturer")
        val manufacturer: String,
        @SerializedName("max_atmosphering_speed")
        val maxAtmospheringSpeed: String,
        @SerializedName("model")
        val model: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("passengers")
        val passengers: String,
        @SerializedName("pilots")
        val pilots: List<String>,
        @SerializedName("starship_class")
        val starshipClass: String,
        @SerializedName("url")
        val url: String
    )
}