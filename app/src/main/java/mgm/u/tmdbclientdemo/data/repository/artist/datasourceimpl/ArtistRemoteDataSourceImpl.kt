package mgm.u.tmdbclientdemo.data.repository.artist.datasourceimpl

import mgm.u.tmdbclientdemo.data.api.TMDBService
import mgm.u.tmdbclientdemo.data.model.artist.ArtistList
import mgm.u.tmdbclientdemo.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDataSource {
    override suspend fun getArtist(): Response<ArtistList> = tmdbService.getPopularArtist(apiKey)
}