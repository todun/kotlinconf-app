package org.jetbrains.kotlinconf.presentation

import org.jetbrains.kotlinconf.*
import org.jetbrains.kotlinconf.model.*

interface DataRepository {
    val sessions: List<SessionModel>
    val favorites: List<SessionModel>

    fun getSessionById(id: String): SessionModel

    suspend fun update()

    /**
     * Rating
     */
    fun getRating(sessionId: String): SessionRating
    suspend fun addRating(sessionId: String, rating: SessionRating)
    suspend fun removeRating(sessionId: String)

    /**
     * Favorites
     */
    fun isFavorite(sessionId: String): Boolean
    suspend fun setFavorite(sessionId: String, isFavorite: Boolean)
}