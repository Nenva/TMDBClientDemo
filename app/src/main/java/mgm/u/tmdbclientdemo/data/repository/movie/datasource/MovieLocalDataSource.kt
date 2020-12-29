package mgm.u.tmdbclientdemo.data.repository.movie.datasource

import mgm.u.tmdbclientdemo.data.model.movie.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}