package com.parulson.apikotlinimagesearchappcodinginflow.api

import com.parulson.apikotlinimagesearchappcodinginflow.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
        )