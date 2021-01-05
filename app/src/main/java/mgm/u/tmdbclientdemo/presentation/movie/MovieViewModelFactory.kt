package mgm.u.tmdbclientdemo.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mgm.u.tmdbclientdemo.domain.usecase.GetMoviesUseCase
import mgm.u.tmdbclientdemo.domain.usecase.UpdateMoviesUserCase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUserCase: UpdateMoviesUserCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase, updateMoviesUserCase) as T
    }
}