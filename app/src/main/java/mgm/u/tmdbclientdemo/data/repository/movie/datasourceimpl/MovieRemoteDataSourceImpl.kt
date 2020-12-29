package mgm.u.tmdbclientdemo.data.repository.movie.datasourceimpl

import mgm.u.tmdbclientdemo.data.api.TMDBService
import mgm.u.tmdbclientdemo.data.model.movie.MovieList
import mgm.u.tmdbclientdemo.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
    ): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}