package mgm.u.tmdbclientdemo.domain.repository

import mgm.u.tmdbclientdemo.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtist(): List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}