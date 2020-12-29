package mgm.u.tmdbclientdemo.domain.repository

import mgm.u.tmdbclientdemo.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}