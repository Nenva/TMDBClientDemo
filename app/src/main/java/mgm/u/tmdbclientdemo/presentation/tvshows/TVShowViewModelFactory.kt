package mgm.u.tmdbclientdemo.presentation.tvshows

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mgm.u.tmdbclientdemo.domain.usecase.GetTVShowsUseCase
import mgm.u.tmdbclientdemo.domain.usecase.UpdateTVShowsUseCase

class TVShowViewModelFactory(
    private val getTVShowsUseCase: GetTVShowsUseCase,
    private val updateTVShowsUseCase: UpdateTVShowsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TVShowViewModel(
            getTVShowsUseCase,
            updateTVShowsUseCase
        ) as T
    }
}