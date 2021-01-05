package mgm.u.tmdbclientdemo.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import mgm.u.tmdbclientdemo.domain.usecase.GetMoviesUseCase
import mgm.u.tmdbclientdemo.domain.usecase.UpdateMoviesUserCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUserCase: UpdateMoviesUserCase
) : ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUserCase.execute()
        emit(movieList)
    }
}