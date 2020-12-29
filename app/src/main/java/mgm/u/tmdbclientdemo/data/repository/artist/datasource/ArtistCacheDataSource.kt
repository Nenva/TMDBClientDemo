package mgm.u.tmdbclientdemo.data.repository.artist.datasource

import mgm.u.tmdbclientdemo.data.model.artist.Artist

interface ArtistCacheDataSource {

    suspend fun getArtistFromCache(): List<Artist>
    suspend fun saveArtistToCache(artists: List<Artist>)
}