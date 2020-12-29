package mgm.u.tmdbclientdemo.data.repository.tvshow.datasourceimpl

import mgm.u.tmdbclientdemo.data.api.TMDBService
import mgm.u.tmdbclientdemo.data.model.tvshow.TVShowList
import mgm.u.tmdbclientdemo.data.repository.tvshow.datasource.TVShowRemoteDataSource
import retrofit2.Response

class TVShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): TVShowRemoteDataSource {
    override suspend fun getTVShows(): Response<TVShowList> = tmdbService.getPopularTVShows(apiKey)
}