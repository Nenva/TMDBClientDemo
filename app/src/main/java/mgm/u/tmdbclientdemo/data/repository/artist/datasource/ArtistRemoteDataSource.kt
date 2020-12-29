package mgm.u.tmdbclientdemo.data.repository.artist.datasource

import mgm.u.tmdbclientdemo.data.model.artist.Artist
import mgm.u.tmdbclientdemo.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtist(): Response<ArtistList>
}