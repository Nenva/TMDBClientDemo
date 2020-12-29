package mgm.u.tmdbclientdemo.data.repository.movie.datasource

import mgm.u.tmdbclientdemo.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}