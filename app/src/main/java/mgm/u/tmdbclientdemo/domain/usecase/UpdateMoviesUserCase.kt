package mgm.u.tmdbclientdemo.domain.usecase

import mgm.u.tmdbclientdemo.data.model.movie.Movie
import mgm.u.tmdbclientdemo.domain.repository.MovieRepository

class UpdateMoviesUserCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}