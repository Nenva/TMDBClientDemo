package mgm.u.tmdbclientdemo.data.repository.artist.datasource

import mgm.u.tmdbclientdemo.data.model.artist.Artist
import mgm.u.tmdbclientdemo.data.model.movie.Movie

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB(): List<Artist>
    suspend fun saveArtistToDB(artists: List<Artist>)
    suspend fun clearAllArtist()
}