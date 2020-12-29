package mgm.u.tmdbclientdemo.data.repository.movie.datasource

import mgm.u.tmdbclientdemo.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}